package org.slc.sli.ingestion.landingzone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import org.slc.sli.ingestion.BatchJob;
import org.slc.sli.ingestion.Fault;

/**
 *
 * @author jsa
 *
 */
public class BatchJobAssembler {

    /**
     *
     */
    protected LandingZone landingZone;

    /**
     *
     * @param landingZone
     */
    public BatchJobAssembler(LandingZone landingZone) {
        this.landingZone = landingZone;
    }

    /**
     * Attempt to generate a new BatchJob based on data found in the
     * controlFile.
     *
     * @param controlFile
     * @return BatchJob
     * @throws IOException
     */
    public BatchJob assembleJob(ControlFile controlFile) throws IOException {

        BatchJob job = BatchJob.createDefault();

        ArrayList<ControlFile.FileEntry> entries =
                (ArrayList<ControlFile.FileEntry>) controlFile
                .getFileEntries();

        // assert the control file has more than zero file items
        if (entries.size() < 1) {
            job.addFault(Fault
                    .createError("No files specified in control file"));
        }

        for (ControlFile.FileEntry entry : entries) {

            // verify each file item can be mapped to an accessible file
            File f = landingZone.getFile(entry.fileName);
            if (f == null) {
                // file does not exist.
                job.addFault(Fault.createError("File [" + entry.fileName
                        + "] was not found."));
                continue;
            }

            // and the attributes match
            String actualMd5Hex = landingZone.getMd5Hex(f);

            if (!actualMd5Hex.equals(entry.checksum)) {
                job.addFault(Fault.createError("File [" + entry.fileName + "] "
                        + "checksum (" + actualMd5Hex + ") "
                        + "does not match control file " + "checksum ("
                        + entry.checksum + ")."));
                continue;
            }

            // TODO verify proper file type
            // TODO verify proper file format

            // add the file to the job
            job.addFile(f);
        }

        // iterate over the configProperties and copy into the job
        // TODO validate config properties are legit
        Enumeration e = controlFile.configProperties.keys();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            job.setProperty(key, controlFile.configProperties.getProperty(key));
        }

        return job;
    }
}
