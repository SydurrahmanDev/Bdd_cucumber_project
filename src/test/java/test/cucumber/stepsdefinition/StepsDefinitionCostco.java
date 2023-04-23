package test.cucumber.stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefinitionCostco {
    WebDriver driver;

    @Given("i want to browser costco open")
    public void i_want_to_browser_costco_open() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        driver.get("https://www.costco.com/");
        driver.manage().window().maximize();
    }

    @When("Click the locations click")
    public void click_the_locations_click() throws InterruptedException {
        driver.findElement(By.linkText("Locations")).click();
        Thread.sleep(500);
    }

    @Then("put my zip code and click find")
    public void putMyZipCodAndClickFind() {
        // WebElement this way you do it visible which element you interacted.
//        WebElement showRoom = driver.findElement(By.id("search-warehouse"));
//        showRoom.sendKeys("11377");
//        WebElement click = driver.findElement(By.xpath("//*[@id=\"warehouse-locator-search-form\"]/div[1]/span/button"));
//        click.click();

        // if you do this way it is also okay just shortage code but you don't know which element you interacted
        driver.findElement(By.id("search-warehouse")).sendKeys("11377");
        driver.findElement(By.xpath("//*[@id=\"warehouse-locator-search-form\"]/div[1]/span/button")).click();
    }

    @Then("Queens would be visible")
    public void queensWouldBeVisible() {

        String expectedTitle="Find a Warehouse at a Nearby Location | Costco";
        Assertions.assertEquals(expectedTitle,driver.getTitle());
        System.out.printf(driver.getTitle());

    }
}
