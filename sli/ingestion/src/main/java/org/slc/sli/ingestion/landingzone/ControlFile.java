package org.slc.sli.ingestion.landingzone;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slc.sli.ingestion.FileFormat;
import org.slc.sli.ingestion.FileType;

public class ControlFile {

    protected File file;
    protected List<IngestionFileEntry> fileEntries = new ArrayList<IngestionFileEntry>();
    protected Properties configProperties = new Properties();

    public static ControlFile parse(File file) throws IOException {

        Scanner scanner = new Scanner(file);
        Pattern fileItemPattern = Pattern.compile("^([^\\s]+)\\,([^\\s]+)\\,([^,]+)\\,(\\w+)\\s*$");
        Matcher fileItemMatcher;
        Pattern configItemPattern = Pattern.compile("^@(.*)$");
        Matcher configItemMatcher;
        String line;
        FileFormat fileFormat;
        FileType fileType;

        Properties configProperties = new Properties();
        ArrayList<IngestionFileEntry> fileEntries = new ArrayList<IngestionFileEntry>();

        try {
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                fileItemMatcher = fileItemPattern.matcher(line);
                if (fileItemMatcher.matches()) {
                    fileFormat = FileFormat.findByCode(fileItemMatcher.group(1));
                    fileType = FileType.findByNameAndFormat(fileItemMatcher.group(2), fileFormat);
                    fileEntries.add(new IngestionFileEntry(fileFormat, fileType, fileItemMatcher.group(3), fileItemMatcher
                            .group(4)));
                    continue;
                }

                configItemMatcher = configItemPattern.matcher(line);
                if (configItemMatcher.matches()) {
                    configProperties.load(new ByteArrayInputStream(configItemMatcher.group(1).getBytes()));
                    // System.err.println("found configItem: ["+configItemMatcher.group(1)+"]");
                    continue;
                }

                // blank lines are ignored silently, but stray marks are not
                if (line.trim().length() > 0) {
                    // line was not parseable
                    // TODO fault or custom exception?
                    throw new RuntimeException("invalid control file entry: " + line);
                }
            }

            return new ControlFile(file, fileEntries, configProperties);

        } finally {
            scanner.close();
        }
    }

    public List<IngestionFileEntry> getFileEntries() {
        return this.fileEntries;
    }

    /**
     * @param file
     * @param fileEntries
     * @param configProperties
     */
    protected ControlFile(File file, List<IngestionFileEntry> fileEntries, Properties configProperties) {
        this.file = file;
        this.fileEntries = fileEntries;
        this.configProperties = configProperties;
    }

}
