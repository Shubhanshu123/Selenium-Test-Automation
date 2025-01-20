package browser_interactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import setup.Main;

public class Alerts extends Main {

  public static void main(String[] args) {
    alerts();
    confirmations();
    prompts();
    waits();

    driver.quit();
  }

  public static void alerts() {
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
    driver.findElement(By.id("alert")).click();

    Alert alert = driver.switchTo().alert();
    String message = alert.getText();

    System.out.println(message);

    alert.accept();
  }

  public static void confirmations() {
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
    driver.findElement(By.id("confirm")).click();

    Alert confirmation = driver.switchTo().alert();
    // confirmation.accept(); // OK
    confirmation.dismiss(); // Cancel
  }

  public static void prompts() {
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
    driver.findElement(By.id("prompt")).click();

    Alert prompt = driver.switchTo().alert();
    prompt.sendKeys("something");
    prompt.accept();
  }

  public static void waits() {
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
    driver.findElement(By.id("slow-alert")).click();

    var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
    alert.accept();
  }
}