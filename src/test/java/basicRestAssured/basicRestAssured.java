package basicRestAssured;

import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateProjectTest {

    @Test
    @DisplayName("Verify Create Project by API - Todo.ly StringBody using ApiConfig")
    public void verifyCreateProjectStringBody() {
        given()
                .auth()
                .preemptive()
                .basic("usuario1234@gmail.com", "0311adrian") // Usamos tu usuario y contraseña directamente
                .body("{\n" +
                        "   \"Content\":\"NuevoProyecto\",\n" + // Cambié el nombre del proyecto
                        "   \"Icon\":5\n" + // Cambié el icono
                        "}")
                .log().all()
                .when()
                .post(ApiConfig.CREATE_PROJECT) // Usamos la URL de ApiConfig
                .then()
                .log().all();
    }
}
