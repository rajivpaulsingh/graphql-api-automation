package query;

import utilities.APIService;
import payload.PayLoadAPI;
import utilities.Utilities;
import testconfig.BaseTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetServerVersionTest extends BaseTest {

    private static final Logger log = LogManager.getLogger(GetServerVersionTest.class.getName());

    @Test(description = "Get Version Test")
    public void versionTest() {

        log.info("Sending the graphQL request to the server");
        String payload = PayLoadAPI.getServerVersion();
        Response res = APIService.sendAPIRequest(payload);

        JsonPath js = Utilities.RawToJSON(res);
        String version = js.get("data.getServerVersion.commitShortSHA");

        log.info("The status code for getServerVersion api is: " + res.getStatusCode());
        log.info("The current server versions: " + js.get("data.getServerVersion.commitShortSHA"));

        Assert.assertNotNull(version);

    }

}