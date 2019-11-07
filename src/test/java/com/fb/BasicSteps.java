package com.fb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSteps {

    WebDriver driver;

    @Given("^Open the browser and launch the application$")
    public void open_the_browser_and_launch_the_application() throws Throwable
    {
        //System.setProperty("webdriver.gecko.driver", "");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ubiverso.com");
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
    }

    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    public void enter_the_Username_and_Password(String username, String password) throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("^Check the initial state$")
    public void Check_the_initial_state() throws Throwable
    {
        driver.findElement(By.name("btnState")).click();
    }
}
