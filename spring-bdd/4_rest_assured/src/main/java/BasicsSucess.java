import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BasicsSucess {

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
                .statusCode(200)
        .and()
        .contentType(ContentType.JSON).and()
        .body("results[0].name", equalTo("Cruise Bar, Restaurant & Events"))
        .and()
                .body("results[0].place_id", equalTo("ChIJi6C1MxquEmsR9-c-3O48ykI"))
        .and()
        .header("server","scaffolding on HTTPServer2");
    }
}
