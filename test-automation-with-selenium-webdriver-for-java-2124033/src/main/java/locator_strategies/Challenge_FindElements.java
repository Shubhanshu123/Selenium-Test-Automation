package locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;

public class Challenge_FindElements extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    WebElement imageButton = driver.findElement(By.id("imageButton"));
    WebElement clickButton = driver.findElement(By.cssSelector("input[value='Click']"));
    WebElement nameTextBox = driver.findElement(By.name("id-name1"));

    driver.quit();
  }
}