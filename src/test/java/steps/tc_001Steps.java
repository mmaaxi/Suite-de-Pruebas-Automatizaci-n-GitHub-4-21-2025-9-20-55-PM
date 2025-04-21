package steps;

import pages.tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("el usuario revisa la estrategia en Google Sheets")
    public void revisaEstrategiaEnGoogleSheets() {
        page.openGoogleSheets();
    }

    @Then("se encuentra la estrategia detallada en el Google Sheets")
    public void verificaEstrategiaEnGoogleSheets() {
        assertTrue(page.isStrategyDetailed());
    }

    @When("el usuario verifica la matriz de pruebas")
    public void verificaMatrizDePruebas() {
        page.checkTestMatrix();
    }

    @Then("la matriz está correctamente aprobada y estructurada")
    public void verificaMatrizEstructurada() {
        assertTrue(page.isMatrixApprovedAndStructured());
    }

    @When("el usuario crea un repositorio en GitHub")
    public void creaRepositorioEnGitHub() {
        page.createRepositoryOnGitHub();
    }

    @Then("el repositorio se crea exitosamente con los scripts correspondientes")
    public void verificaCreacionExitosadeRepositorio() {
        assertTrue(page.isRepositoryCreatedSuccessfully());
    }
}