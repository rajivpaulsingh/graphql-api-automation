package utilities;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class APIService {

    public static Response sendAPIRequest(String payload) {

        EncoderConfig encoderConfig = new EncoderConfig();

        Response response = given().
                header("Content-Type", "application/json").
                config(RestAssured.config()
                        .encoderConfig(encoderConfig.appendDefaultContentCharsetToContentTypeIfUndefined(false)
                        .encodeContentTypeAs("application/graphql", ContentType.TEXT))).
                filter(new AllureRestAssured()).
                body(payload).
                when().
                post(baseURI).
                then().
                assertThat().statusCode(200).and().contentType(ContentType.JSON).

                extract().response().prettyPeek();

        return response;
    }
}
