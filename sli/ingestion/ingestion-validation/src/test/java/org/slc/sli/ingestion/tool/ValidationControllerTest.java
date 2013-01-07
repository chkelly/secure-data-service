/*
 * Copyright 2012 Shared Learning Collaborative, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.slc.sli.ingestion.tool;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junitx.util.PrivateAccessor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.slc.sli.ingestion.FileType;
import org.slc.sli.ingestion.handler.Handler;
import org.slc.sli.ingestion.landingzone.ControlFile;
import org.slc.sli.ingestion.landingzone.FileResource;
import org.slc.sli.ingestion.landingzone.IngestionFileEntry;
import org.slc.sli.ingestion.reporting.AbstractMessageReport;
import org.slc.sli.ingestion.reporting.ReportStats;
import org.slc.sli.ingestion.reporting.Source;

/**
 * Unit Tests for ValidationController
 *
 * @author tke
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/applicationContext.xml" })
public class ValidationControllerTest {

    final String controlFileName = "test/MainControlFile.ctl";
    final String invalidControlFile = "test/MainControlFileCheckSumError.ctl";
    final String zipFileName = "zipFile/Session1.zip";
    @Autowired
    private ValidationController validationController;

    @Test
    public void testDoValidationCtlFile() throws NoSuchFieldException, IllegalAccessException, IOException {
        File ctlFile = Mockito.mock(File.class);
        Mockito.when(ctlFile.getName()).thenReturn("Test.ctl");
        Mockito.when(ctlFile.isFile()).thenReturn(true);

        ValidationController vc = Mockito.spy(validationController);
        Mockito.doNothing().when(vc).processControlFile(ctlFile);
        vc.doValidation(ctlFile);
        Mockito.verify(vc, Mockito.atLeastOnce()).processControlFile(ctlFile);

    }

    @Test
    public void testDirectory() throws NoSuchFieldException, IllegalAccessException, IOException {
        File ctlFile = Mockito.mock(File.class);
        Mockito.when(ctlFile.getName()).thenReturn("Test");
        Mockito.when(ctlFile.isFile()).thenReturn(false);

        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        validationController.doValidation(ctlFile);
        Mockito.verify(messageReport, Mockito.atLeastOnce()).error(Matchers.any(ReportStats.class),
                Matchers.any(Source.class), Matchers.eq(ValidationMessageCode.VALIDATION_0001));
    }

    @Test
    public void testDoValidationZipFile() throws NoSuchFieldException, IllegalAccessException, IOException {
        File zipFile = Mockito.mock(File.class);
        Mockito.when(zipFile.getName()).thenReturn("Test.zip");
        Mockito.when(zipFile.isFile()).thenReturn(true);

        ValidationController vc = Mockito.spy(validationController);
        Mockito.doNothing().when(vc).processZip(zipFile);
        vc.doValidation(zipFile);
        Mockito.verify(vc, Mockito.atLeastOnce()).processZip(zipFile);

    }

    @Test
    public void testDoValidationInvalidFile() throws NoSuchFieldException, IllegalAccessException, IOException {
        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        File invalidFile = Mockito.mock(File.class);
        Mockito.when(invalidFile.getName()).thenReturn("Test.txt");
        Mockito.when(invalidFile.isFile()).thenReturn(true);

        validationController.doValidation(invalidFile);
        Mockito.verify(messageReport, Mockito.atLeastOnce()).error(Matchers.any(ReportStats.class),
                Matchers.any(Source.class), Matchers.eq(ValidationMessageCode.VALIDATION_0001));
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testProcessZip() throws IOException, NoSuchFieldException, IllegalAccessException {
        Handler<org.slc.sli.ingestion.Resource, File> handler = Mockito.mock(Handler.class);

        ReportStats rs = Mockito.mock(ReportStats.class);
        Mockito.when(rs.hasErrors()).thenReturn(false);

        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);

        PrivateAccessor.setField(validationController, "reportStats", rs);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        File zipFile = (new ClassPathResource(zipFileName)).getFile();
        FileResource zipFileResource = new FileResource(zipFile.getAbsolutePath());

        ValidationController vc = Mockito.spy(validationController);
        Mockito.doNothing().when(vc).processControlFile((FileResource) Mockito.any());
        Mockito.doReturn(zipFile).when(handler).handle(zipFileResource, messageReport, rs);

        vc.setZipFileHandler(handler);
        vc.processZip(zipFileResource);
        Mockito.verify(handler, Mockito.atLeastOnce()).handle(zipFileResource, messageReport, rs);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testProcessInvalidZip() throws IOException, NoSuchFieldException, IllegalAccessException {

        Handler<org.slc.sli.ingestion.Resource, File> handler = Mockito.mock(Handler.class);

        ReportStats reportStats = Mockito.mock(ReportStats.class);
        Mockito.when(reportStats.hasErrors()).thenReturn(true);

        File zipFile = (new ClassPathResource(zipFileName)).getFile();
        FileResource zipFileResource = new FileResource(zipFile.getAbsolutePath());

        ValidationController vc = Mockito.spy(validationController);

        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);

        PrivateAccessor.setField(validationController, "reportStats", reportStats);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        Mockito.doReturn(zipFile).when(handler).handle(zipFileResource, messageReport, reportStats);
        vc.processZip(zipFileResource);
        Mockito.verify(vc, Mockito.never()).processControlFile(zipFileResource);
    }

    @Test
    public void testValidatorInValid() throws IOException, NoSuchFieldException, IllegalAccessException {
        Resource xmlResource = new ClassPathResource("emptyXml/InterchangeStudent.xml");
        File xmlFile = xmlResource.getFile();

        String fileName = "InterchangeStudent.xml";

        IngestionFileEntry ife = Mockito.mock(IngestionFileEntry.class);
        Mockito.when(ife.getFileName()).thenReturn(fileName);
        Mockito.when(ife.getFile()).thenReturn(xmlFile);
        Mockito.when(ife.getFileType()).thenReturn(FileType.XML_STUDENT_PARENT_ASSOCIATION);

        List<IngestionFileEntry> fileEntries = new ArrayList<IngestionFileEntry>();
        fileEntries.add(ife);

        ControlFile cfl = Mockito.mock(ControlFile.class);
        Mockito.when(cfl.getFileEntries()).thenReturn(fileEntries);

        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        validationController.processValidators(cfl);
        Mockito.verify(messageReport, Mockito.atLeastOnce()).info(Matchers.any(ReportStats.class),
                Matchers.any(Source.class), Matchers.eq(ValidationMessageCode.VALIDATION_0003), Matchers.eq(fileName));
    }

    @Test
    public void testValidatorValid() throws IOException, NoSuchFieldException, IllegalAccessException {
        Resource xmlResource = new ClassPathResource("test/InterchangeStudent.xml");
        File xmlFile = xmlResource.getFile();

        String fileName = "InterchangeStudent.xml";
        IngestionFileEntry ife = Mockito.mock(IngestionFileEntry.class);
        Mockito.when(ife.getFileName()).thenReturn(fileName);
        Mockito.when(ife.getFile()).thenReturn(xmlFile);
        Mockito.when(ife.getFileType()).thenReturn(FileType.XML_STUDENT_PARENT_ASSOCIATION);

        List<IngestionFileEntry> fileEntries = new ArrayList<IngestionFileEntry>();
        fileEntries.add(ife);

        ControlFile cfl = Mockito.mock(ControlFile.class);
        Mockito.when(cfl.getFileEntries()).thenReturn(fileEntries);

        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        validationController.processValidators(cfl);
        Mockito.verify(messageReport, Mockito.atLeastOnce()).info(Matchers.any(ReportStats.class),
                Matchers.any(Source.class), Matchers.eq(ValidationMessageCode.VALIDATION_0002), Matchers.eq(fileName));
    }

    @Test
    public void testValidProcessControlFile() throws IOException, NoSuchFieldException {
        Resource ctlFileResource = new ClassPathResource(controlFileName);
        File ctlFile = ctlFileResource.getFile();

        ValidationController vc = Mockito.spy(validationController);

        ReportStats reportStats = Mockito.mock(ReportStats.class);
        Mockito.when(reportStats.hasErrors()).thenReturn(false);

        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);

        PrivateAccessor.setField(validationController, "reportStats", reportStats);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        vc.processControlFile(ctlFile);

        Mockito.verify(vc).processValidators(Mockito.any(ControlFile.class));
    }

    @Test
    public void testInvalidProcessControlFile() throws IOException, SecurityException, NoSuchFieldException,
            IllegalArgumentException, IllegalAccessException {
        Resource ctlFileResource = new ClassPathResource(invalidControlFile);
        File ctlFile = ctlFileResource.getFile();

        AbstractMessageReport messageReport = Mockito.mock(AbstractMessageReport.class);
        PrivateAccessor.setField(validationController, "messageReport", messageReport);

        validationController.processControlFile(ctlFile);

        Mockito.verify(messageReport).error(Matchers.any(ReportStats.class),
                Matchers.any(Source.class), Matchers.eq(ValidationMessageCode.VALIDATION_0010), Matchers.anyString());
    }

}
