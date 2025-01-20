package wait_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import setup.Main;

public class Challenge_WaitForAppearance extends Main {

  public static void main(String[] args) {

    driver.get("https://www.selenium.dev/selenium/web/dynamicallyModifiedPage.html");

    WebElement elementToRemove = driver.findElement(By.id("element-to-remove"));
    driver.findElement(By.id("buttonDelete")).click();

    var wait = new WebDriverWait(driver, Duration.ofMillis(5001));
    boolean removed = wait.until(
        ExpectedConditions.invisibilityOf(elementToRemove));

    System.out.println(removed);

    driver.quit();
  }
  
}
