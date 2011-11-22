package org.sli.ingestion.processors;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sli.ingestion.InterchangeAssociation;
import org.sli.ingestion.NeutralRecord;
import org.sli.ingestion.NeutralRecordFileReader;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;


/**
 * Ingestion Persistence Processor.
 * 
 * Specific Ingestion Persistence Processor which provides specific SLI Ingestion instance persistence behavior.
 * 
 */

@Component
public class PersistenceProcessor extends IngestionProcessor implements Processor {

	Logger log = LoggerFactory.getLogger( PersistenceProcessor.class );
	
	/**
	 * Consumes the SLI Neutral records file, parses, and persists the SLI Ingestion instances
	 * @param inputFile
	 * @param outputFile
	 */
	public void processIngestionStream(File inputFile, File outputFile) throws IOException, SAXException {
		
		// Create Ingestion Neutral record reader
		NeutralRecordFileReader fileReader = new NeutralRecordFileReader(inputFile);
		
		// Ingestion Neutral record
		NeutralRecord ingestionRecord;
		
		// Ingestion counter
		int ingestionCounter = 0;
		
	    try {
	    	
			// Iterate Ingestion neutral records/lines
	        while (fileReader.hasNext()) {
	        	
	        	// Read next Ingestion neutral record/line
	        	ingestionRecord = fileReader.next();
	        	
	        	log.debug("processing " + ingestionRecord);
	        	
	        	// Map Ingestion Neutral JSON format into instance
	        	Object ingestionInstance = this.mapFromNeutralRecord(ingestionRecord);
	        	
	        	// Initialize Ingestion association instances
	        	if (ingestionInstance instanceof InterchangeAssociation) {
	        		((InterchangeAssociation)ingestionInstance).init(this.getContextManager());
	        	}
	        	
	        	// Persist Ingestion instance
	        	this.persist(ingestionInstance);
	        	
	        	// Update Ingestion counter
	        	ingestionCounter++;
	        }
	    }
	    finally {
	    	fileReader.close();
	    }
	    
	    String status = "processed " + ingestionCounter + " records.";
	    
	    BufferedOutputStream outputStream = null;
	    try {
	    	
			// Setup Ingestion processor output stream for Camel Exchange
			outputStream = new BufferedOutputStream( new FileOutputStream(outputFile) );

		    // Output Ingestion processor results
		    outputStream.write(status.getBytes());
		    
	    }
	    finally {
		    outputStream.close();
	    }
	    
	    // Indicate processor status
	    log.info(status);
	    
	}

	/**
	 * Persists the SLI Ingestion instance using the appropriate SLI repository.
	 * 
	 * @param instance
	 * @return
	 */
	public Object persist(Object instance) {
		
    	// Lookup Repository for Ingestion instance class
    	PagingAndSortingRepository repository = this.getContextManager().getRepositoryByConvention(instance.getClass().getName());
    	
    	// Persist the Ingestion instance
    	return repository.save(instance);
        	
	}
	
}
