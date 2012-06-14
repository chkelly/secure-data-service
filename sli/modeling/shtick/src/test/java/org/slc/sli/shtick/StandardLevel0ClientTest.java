package org.slc.sli.shtick;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.ws.rs.client.InvocationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author jstokes
 */
public class StandardLevel0ClientTest {

    private Level0Client client; // class under test

    @Before
    public void setup() {
        this.client = new StandardLevel0Client();
    }

    @Test
    @Ignore
    public void testDeleteRequest() {
        try {
            Response actualResponse = client.deleteRequest(TestingConstants.ROGERS_TOKEN, new URL(
                    TestingConstants.BASE_URL + "/students/" + TestingConstants.TEST_STUDENT_DELETE_ID),
                    MediaType.APPLICATION_JSON);
            assertNotNull(actualResponse);
            assertEquals(Response.noContent().build().getStatus(), actualResponse.getStatus());

            Response deletedResponse = client.getRequest(TestingConstants.ROGERS_TOKEN, new URL(
                    TestingConstants.BASE_URL + "/students/" + TestingConstants.TEST_STUDENT_DELETE_ID),
                    MediaType.APPLICATION_JSON);
            assertNotNull(actualResponse);
            assertEquals(Response.status(Response.Status.NOT_FOUND).build().getStatus(), deletedResponse.getStatus());

        } catch (MalformedURLException e) {
            fail(e.getMessage());
        } catch (URISyntaxException e) {
            fail(e.getMessage());
        } catch (HttpRestException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testGetRequest() {
        try {
            Response actualResponse = client.getRequest(TestingConstants.ROGERS_TOKEN, new URL(
                    TestingConstants.BASE_URL + "/students"), MediaType.APPLICATION_JSON);
            assertNotNull(actualResponse);
            assertEquals(Response.ok().build().getStatus(), actualResponse.getStatus());

            actualResponse = client.getRequest(TestingConstants.ROGERS_TOKEN, new URL(TestingConstants.BASE_URL
                    + "/students/" + TestingConstants.TEST_STUDENT_ID), MediaType.APPLICATION_JSON);
            assertNotNull(actualResponse);
            assertEquals(Response.ok().build().getStatus(), actualResponse.getStatus());
        } catch (URISyntaxException e) {
            fail(e.getMessage());
        } catch (MalformedURLException e) {
            fail(e.getMessage());
        } catch (InvocationException e) {
            fail(e.getMessage());
        } catch (HttpRestException e) {
            fail(e.getMessage());
        }
    }

    @Ignore("Problem with invalid autorization token.")
    public void testGetRequestWithBrokenToken() {
        try {
            Response actualResponse = client.getRequest(TestingConstants.BROKEN_TOKEN, new URL(
                    TestingConstants.BASE_URL + "/students"), MediaType.APPLICATION_JSON);
            assertNotNull(actualResponse);
            assertEquals(Response.ok().build().getStatus(), actualResponse.getStatus());

            actualResponse = client.getRequest(TestingConstants.BROKEN_TOKEN, new URL(TestingConstants.BASE_URL
                    + "/students/" + TestingConstants.TEST_STUDENT_ID), MediaType.APPLICATION_JSON);
            assertNotNull(actualResponse);
            assertEquals(Response.ok().build().getStatus(), actualResponse.getStatus());
        } catch (URISyntaxException e) {
            fail(e.getMessage());
        } catch (MalformedURLException e) {
            fail(e.getMessage());
        } catch (InvocationException e) {
            fail(e.getMessage());
        } catch (HttpRestException e) {
            fail(e.getMessage());
        }
    }
}
