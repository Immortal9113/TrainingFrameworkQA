package api.test.mykhaliuk.videoGamesDB.config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;

public class GameConfig {
    public static RequestSpecification game_requestSpec;
    public static ResponseSpecification game_responseSpec;
    @BeforeClass
    public static void setUp(){
        game_requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setBasePath("/app/")
                .setPort(8080)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        game_responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
        RestAssured.requestSpecification = game_requestSpec;
        RestAssured.responseSpecification = game_responseSpec;
    }
}
