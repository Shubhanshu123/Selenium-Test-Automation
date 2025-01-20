package locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import setup.Main;

public class RelativeLocators extends Main {
  
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    WebElement bottomButton = driver.findElement(
        RelativeLocator
            .with(By.name("submit"))
            .below(By.id("submit")));

    driver.quit();
  }

}