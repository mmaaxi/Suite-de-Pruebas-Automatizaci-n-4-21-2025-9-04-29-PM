Feature: Prueba de Registro de Usuario

  Scenario: Registro exitoso de un usuario nuevo
    Given el usuario está en la página de registro
    When el usuario completa el formulario de registro con datos válidos
    And envía el formulario de registro
    Then el usuario debería recibir un mensaje de confirmación