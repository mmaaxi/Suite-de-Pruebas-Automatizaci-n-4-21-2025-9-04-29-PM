Feature: Prueba de Inicio de Sesión

  Scenario: El usuario inicia sesión correctamente
    Given que el usuario está en la página de inicio de sesión
    When ingresa el nombre de usuario "usuarioCorrecto"
    And ingresa la contraseña "contraseñaCorrecta"
    And hace clic en el botón de iniciar sesión
    Then el usuario es autenticado y redirigido a la página principal