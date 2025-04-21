package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    By nombreInput = By.id("nombre");
    By apellidoInput = By.id("apellido");
    By emailInput = By.id("email");
    By passwordInput = By.id("contraseña");
    By registroButton = By.id("registro");
    By mensajeConfirmacion = By.id("mensaje-confirmacion");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeRegistro() {
        driver.get("http://sitio-de-ejemplo.com/registro");
    }

    public void completarFormularioDeRegistro(String nombre, String apellido, String email, String password) {
        driver.findElement(nombreInput).sendKeys(nombre);
        driver.findElement(apellidoInput).sendKeys(apellido);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enviarFormulario() {
        driver.findElement(registroButton).click();
    }

    public boolean esMensajeDeConfirmacionMostrado() {
        WebElement mensaje = driver.findElement(mensajeConfirmacion);
        return mensaje.isDisplayed() && mensaje.getText().contains("Registro exitoso");
    }
}