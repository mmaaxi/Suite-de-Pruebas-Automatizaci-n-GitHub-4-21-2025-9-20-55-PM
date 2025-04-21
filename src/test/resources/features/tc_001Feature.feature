Feature: Validar Creación de Repositorio

  Scenario: Validar la creación exitosa de un repositorio en GitHub
    Given el usuario revisa la estrategia en Google Sheets
    Then se encuentra la estrategia detallada en el Google Sheets
    When el usuario verifica la matriz de pruebas
    Then la matriz está correctamente aprobada y estructurada
    When el usuario crea un repositorio en GitHub
    Then el repositorio se crea exitosamente con los scripts correspondientes