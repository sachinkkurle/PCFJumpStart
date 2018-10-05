import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Basic3_GettingResponseBodyForAdvanceValidation {
    Properties prop = new Properties();
    @BeforeTest()
    public void getData() throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\files\\env.properties");
        prop.load(fis);
    }

    @Test
    public void AddAndDeletePlace(){
        RestAssured.baseURI=        prop.getProperty("HOST");
        System.out.println("HOST Value " + prop.getProperty("HOST"));
       Response res = given()
                .queryParam("key", prop.getProperty("KEY"))
                .body(Payload.getPostData()).when()
                .post(resources.postData())
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body("status", equalTo("OK"))
        .extract().response()
        ;

     String resString =   res.asString();
     System.out.println(resString);

     JsonPath jsonPath = new JsonPath(resString);
      String palceId =   jsonPath.get("place_id");
        System.out.println("This Place Id " + palceId);

        /*
        * {"status":"OK","place_id":"8b051e1218d121cd9d4530ebbf704cd8","scope":"APP","reference":"4a08226c965c238f6bad7849ecd767a14a08226c965c238f6bad7849ecd767a1","id":"4a08226c965c238f6bad7849ecd767a1"}
8b051e1218d121cd9d4530ebbf704cd8

        * */

        System.out.println("Key " + prop.getProperty("KEY"));

String todelete ="{";
        todelete = todelete + "\"place_id\":\""+palceId+"\"";
        todelete = todelete + "}";
        System.out.println(" To delete String " +  todelete);



        given()
                .queryParam("key", prop.getProperty("KEY"))
                .body( todelete)
                .when()
                .post("maps/api/place/delete/json")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body("status", equalTo("OK"))
                .extract().response()
        ;





    }
}
