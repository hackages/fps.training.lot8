package io.hackages.learning.exercise02;

import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;

/**
 * CRUD Operations
 */
public class Exercise02 {

    @Test
    public void test_add_cat_fact_ok() throws URISyntaxException {
        // Json content in file catFact.json
        String jsonBody = "{\"id\": \"whiskers123\",\"type\": \"cat\",\"text\": \"Meow\",\"user\": {\"id\": \"furry1234\",\"name\": {\"first\": \"Music\",\"last\": \"Player\"}},\"upvotes\": 1,\"userUpvoted\": null}";

        given()
                .contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .post("http://localhost:3000/catFacts")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED)
                .and()
                .body("id", equalTo("whiskers123"))
                .and()
                .body("text", equalTo("Meow"))
                .and()
                .body("user.id", equalTo("furry1234"))
        ;
    }

    @Test
    public void test_scenario1() throws URISyntaxException {

        // Fetch a record
        URI uri = new URI("http://localhost:3000/catFacts/_id/591d9b2f227c1a0020d26823");
        given().accept(ContentType.JSON)
                .when()
                .get(uri)
                .then().assertThat().statusCode(HttpStatus.SC_OK);


        // Delete the record
        given().accept(ContentType.JSON)
                .when()
                .delete(uri)
                .then().assertThat().statusCode(HttpStatus.SC_OK);

        // Fetch the previous record
        given().accept(ContentType.JSON)
                .when()
                .get(uri)
                .then().assertThat().statusCode(HttpStatus.SC_NOT_FOUND);

        /*
        String jsonBody = "{\\r\\n\\t\\\"firstName\\\":\\\"John\\\",\\r\\n\\t\\\"lastName\\\":\\\"Wick\\\",\\r\\n\\t\\\"message\\\":\\\"I am coming for you !!!!\\\",\\r\\n\\t\\\"contact\\\": 123456789\\t\\r\\n}";

        given()
                .contentType(ContentType.JSON)
                .and()
                .body(jsonBody)
                .when()
                .post("https://myfakeapi.com/api/contactus")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST);

         */
    }

}
