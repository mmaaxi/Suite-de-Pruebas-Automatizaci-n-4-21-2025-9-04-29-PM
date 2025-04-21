package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_002Page;
import utils.DriverFactory;

public class tc_002Steps {

    WebDriver driver = DriverFactory.getDriver();
    tc_002Page registrationPage = new tc_002Page(driver);

    @Given("el usuario está en la página de registro")
    public void el_usuario_está_en_la_página_de_registro() {
        registrationPage.navegarAPaginaDeRegistro();
    }

    @When("el usuario completa el formulario de registro con datos válidos")
    public void el_usuario_completa_el_formulario_de_registro_con_datos_válidos() {
        registrationPage.completarFormularioDeRegistro("nombreEjemplo", "apellidoEjemplo", "email@ejemplo.com", "contraseñaSegura123");
    }

    @And("envía el formulario de registro")
    public void envía_el_formulario_de_registro() {
        registrationPage.enviarFormulario();
    }

    @Then("el usuario debería recibir un mensaje de confirmación")
    public void el_usuario_debería_recibir_un_mensaje_de_confirmación() {
        Assert.assertTrue("El mensaje de confirmación no fue mostrado.", registrationPage.esMensajeDeConfirmacionMostrado());
    }
}