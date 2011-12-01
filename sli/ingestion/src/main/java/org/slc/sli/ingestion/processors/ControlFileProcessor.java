package org.slc.sli.ingestion.processors;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slc.sli.ingestion.BatchJob;
import org.slc.sli.ingestion.landingzone.BatchJobAssembler;
import org.slc.sli.ingestion.landingzone.ControlFile;
import org.slc.sli.ingestion.landingzone.LandingZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControlFileProcessor implements Processor {

    Logger log = LoggerFactory.getLogger(ControlFileProcessor.class);

    @Autowired
    LandingZone lz;

    @Override
    public void process(Exchange exchange) throws Exception {

        long startTime = System.currentTimeMillis();

        // TODO handle invalid control file (user error)
        // TODO handle IOException or other system error
        ControlFile controlFile = ControlFile.parse(exchange.getIn().getBody(
                File.class));

        // generate a BatchJob from the ControlFile
        BatchJob job = new BatchJobAssembler(lz).assembleJob(controlFile);

        long endTime = System.currentTimeMillis();
        log.info("Assembled batch job [{}] in {} ms", job.getId(), endTime
                - startTime);

        // TODO set properties on the exchange based on job properties
        // TODO set faults on the exchange if the control file sucked (?)

        // set the exchange outbound message to the value of the job
        exchange.getOut().setBody(job);

    }

}
