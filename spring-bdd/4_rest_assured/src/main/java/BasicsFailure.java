import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BasicsFailure {

    @Test()
    public void Test() {

        RestAssured.baseURI="https://maps.googleapis.com";
        given().param("location", "-33.8670522,151.1957362")
                .param("radius","1500")
                .param("type", "restaurant")
                .param("keyword", "cruise")
                .param("key","AIzaSyBNFr6lZh5tpxcokwHIHCwbd5zM6iUmqR8")
                .when()
                .get("/maps/api/place/nearbysearch/json")
                .then()
                .assertThat()
                .statusCode(250)
                .and()
                .contentType(ContentType.XML);
    }
}
