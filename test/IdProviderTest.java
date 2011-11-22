import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class IdProviderTest extends UnitTest {

    @Before
    public void setup() {
        Fixtures.deleteAllModels();
    }

    @Test
    public void createAndRetrieveIdP() {
        // Create a new IdProvider and save it
        new IdProvider("idp.sli.wgen.net", "idp=SLI").save();

        // Retrieve the IdP with domain idp.sli.wgen.net
        IdProvider sli = IdProvider.find("byDomain", "idp.sli.wgen.net").first();

        // Test
        assertNotNull(sli);
        assertEquals("idp=SLI", sli.redirect);
    }

}
