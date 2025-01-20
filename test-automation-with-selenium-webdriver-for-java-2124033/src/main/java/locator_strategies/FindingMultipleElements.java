package locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;
import java.util.List;

public class FindingMultipleElements extends Main{

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
    
    System.out.println(radioButtons.size());

    driver.quit();
  }

}
