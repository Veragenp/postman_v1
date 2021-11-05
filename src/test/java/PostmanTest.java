import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

class PostmanTest {
    @Test
    void shouldTestPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("user id")
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("user i"));
    }
}
