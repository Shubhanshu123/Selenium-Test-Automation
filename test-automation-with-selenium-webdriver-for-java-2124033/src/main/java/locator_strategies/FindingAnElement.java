package locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;

public class FindingAnElement extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    WebElement emailTextBox = driver.findElement(By.id("email"));

    driver.quit();
  }
}
