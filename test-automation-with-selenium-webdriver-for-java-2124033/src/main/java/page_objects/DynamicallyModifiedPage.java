package page_objects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicallyModifiedPage {

  private final WebDriver driver;
  private final By element = By.id("element-to-remove");
  private final By deleteButton = By.id("buttonDelete");

  public DynamicallyModifiedPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickDeleteButton() {
    driver.findElement(deleteButton).click();
    new WebDriverWait(driver, Duration.ofMillis(5001))
        .until(ExpectedConditions.invisibilityOfElementLocated(element));
  }

  public boolean isElementPresent() {
    try {
      driver.findElement(element);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
}