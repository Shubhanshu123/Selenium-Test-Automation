package wait_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import setup.Main;

public class ExplicitWaits extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

    WebElement textbox = driver.findElement(By.id("revealed"));
    driver.findElement(By.id("reveal")).click();

    var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    wait.until(ExpectedConditions.visibilityOf(textbox));

    driver.quit();
  }
}