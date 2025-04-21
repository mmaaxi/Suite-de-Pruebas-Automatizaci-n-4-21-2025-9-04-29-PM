package steps;

import pages.tc_001Page;
import io.cucumber.java.en.*;

public class tc_001Steps {
    tc_001Page loginPage = new tc_001Page();

    @Given("que el usuario está en la página de inicio de sesión")
    public void queElUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        loginPage.openLoginPage();
    }

    @When("ingresa el nombre de usuario {string}")
    public void ingresaElNombreDeUsuario(String username) {
        loginPage.enterUsername(username);
    }

    @And("ingresa la contraseña {string}")
    public void ingresaLaContrasena(String password) {
        loginPage.enterPassword(password);
    }

    @And("hace clic en el botón de iniciar sesión")
    public void haceClicEnElBotonDeIniciarSesion() {
        loginPage.clickLoginButton();
    }

    @Then("el usuario es autenticado y redirigido a la página principal")
    public void elUsuarioEsAutenticadoYRedirigidoALaPaginaPrincipal() {
        loginPage.verifyHomePageIsDisplayed();
    }
}