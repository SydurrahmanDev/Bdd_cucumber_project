package test.cucumber.stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefinitionRamadan {

    private WebDriver driver;

    @Given("Open the chrome browser")
    public void open_the_chrome_browser() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

    }
    @When("Search in a google for Ramadan Mubarak")
    public void search_in_a_google_for_ramadan_mubarak() {
      driver.findElement(By.name("q")).sendKeys("Ramadan Mubarak");
      driver.findElement(By.name("btnK")).submit();
    }
    @Then("Ramadan Mubarak visible")
    public void ramadan_mubarak_visible() {
        String title = "Ramadan Mubarak - Google Search";
        Assertions.assertEquals(title, driver.getTitle());



    }

}
