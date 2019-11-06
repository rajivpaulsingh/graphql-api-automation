package mutation;

import utilities.APIService;
import payload.PayLoadMutation;
import utilities.Utilities;
import testconfig.BaseTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateSimulationConfigTest extends BaseTest {

    private static final Logger log = LogManager.getLogger(UpdateSimulationConfigTest.class.getName());

    @Test(description = "Update Simulator Config Test")
    public void updateSimulationTest()  {

        log.info("Sending the graphQL request to the server");
        String payload = PayLoadMutation.updatimulationConfig();
        Response res = APIService.sendAPIRequest(payload);

        JsonPath js = Utilities.RawToJSON(res);
        log.info("The status code for update simulation config mutation is: " + res.getStatusCode());

        int updatedValue = js.get("data.updateSimulator.sensors.TT_0112.value");
        log.info("The updated value is: " + updatedValue);

        Assert.assertEquals(updatedValue, 88); //88 is the value we updated

    }
}
