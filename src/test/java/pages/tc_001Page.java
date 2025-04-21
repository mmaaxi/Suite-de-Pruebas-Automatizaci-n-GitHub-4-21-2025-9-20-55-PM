package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    private WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogleSheets() {
        driver.get("https://sheets.google.com");
        // Add steps to navigate and login if necessary
    }

    public boolean isStrategyDetailed() {
        // Locate the strategy document and validate its contents
        WebElement strategyElement = driver.findElement(By.id("strategyDetail")); // example locator
        return strategyElement.isDisplayed();
    }

    public void checkTestMatrix() {
        // Logic to verify the test matrix
        driver.get("https://sheets.google.com/matrixpage");
    }

    public boolean isMatrixApprovedAndStructured() {
        // Validate the matrix structure and approval
        WebElement matrixElement = driver.findElement(By.id("matrixApproved")); // example locator
        return matrixElement.isDisplayed();
    }

    public void createRepositoryOnGitHub() {
        driver.get("https://github.com/new-repo");
        // Steps to fill repo details and create
        driver.findElement(By.id("create-repo-button")).click();
    }

    public boolean isRepositoryCreatedSuccessfully() {
        // Validate repository creation success
        WebElement repoSuccessElement = driver.findElement(By.id("repoCreatedSuccess")); // example locator
        return repoSuccessElement.isDisplayed();
    }
}