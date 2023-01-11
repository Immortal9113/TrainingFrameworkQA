package api.test.mykhaliuk.boredAPI.tests;

import api.test.mykhaliuk.boredAPI.BoredResponseModel;
import api.test.mykhaliuk.boredAPI.config.BoredConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class BoredTest extends BoredConfig {
    @Test
    public void getRandomEvent() {
        final int EXPECTED_STATUS_CODE = 200;
        Response response = given()
                .when().get(ACTIVITY_ENDPOINT);
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, EXPECTED_STATUS_CODE);
    }

    @Test
    public void boundaryKeyResponseValuesTest() throws IllegalAccessException {
        ArrayList<Response> responses = new ArrayList<>();
        responses.add(
                given()
                        .when().get(ACTIVITY_ENDPOINT + KEY_KEY + 1000000));
        responses.add(
                given()
                        .when().get(ACTIVITY_ENDPOINT + KEY_KEY + 9999999));
        for (Response response : responses) {
            BoredResponseModel boredModel = response.as(BoredResponseModel.class);
            Field[] fields = boredModel.getClass().getFields();
            for (Field field : fields) {
                Object value = field.get(boredModel);
                Assert.assertNotNull(value);
            }
        }
    }
    @Test
    public void findActivityWithAnyNumberOfParticipants(){

    }
}
