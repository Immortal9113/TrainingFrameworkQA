package api.test.mykhaliuk.boredAPI.config;
import api.test.mykhaliuk.boredAPI.endpoints.BoredEndpoints;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class BoredConfig extends BoredEndpoints {
    public static RequestSpecification bored_requestSpec;
    public static ResponseSpecification bored_responseSpec;
    @BeforeClass
    public static void setUp(){
        bored_requestSpec = new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .setBasePath(BASE_PATH)
                .build();
        bored_responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
        RestAssured.requestSpecification = bored_requestSpec;
        RestAssured.responseSpecification = bored_responseSpec;
    }
}
