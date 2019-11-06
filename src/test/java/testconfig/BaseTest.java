package testconfig;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.baseURI;

public class BaseTest {

    @BeforeTest
    protected void getData() {
        BasicConfigurator.configure();
        baseURI = System.getProperty("project.baseUrl");
    }
}
