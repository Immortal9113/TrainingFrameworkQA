package api.test.mykhaliuk.videoGamesDB;

import api.test.mykhaliuk.videoGamesDB.config.GameConfig;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class GamesTest extends GameConfig {
    @Test
    public void getAllGames(){
        given()
                .log().all()
                .when().get("videogames")
                .then()
                .log().all();
    }

    @Test
    public void checkGamesPositive() {
        given()
                .baseUri("http://localhost:8080")
                .header("Accept","application/json")
        .when()
                .get("/app/videogames")
        .then() .statusCode(200);
    }
    @Test
    public void getBody() {
        String response = given()
                .baseUri("http://localhost:8080")
                .header("Accept","application/json")
                .when()
                .get("/app/videogames")
                .getBody()
                .prettyPrint();
        System.out.println(response);
    }
    @Test
    public void checkGamePositive(){
        Response response = given()
                .when()
                .get("videogames/10");
        GameModel gameModel = response.as(GameModel.class);
        Assert.assertEquals(gameModel.id, 10);
        Assert.assertTrue(gameModel.reviewScore > 80);
        Assert.assertEquals(gameModel.category, "Driving");
        Assert.assertEquals(gameModel.name, "Grand Theft Auto III");
        Assert.assertEquals(gameModel.rating, "Mature");
        Assert.assertEquals(gameModel.releaseDate, "2001-04-23");
    }
}

