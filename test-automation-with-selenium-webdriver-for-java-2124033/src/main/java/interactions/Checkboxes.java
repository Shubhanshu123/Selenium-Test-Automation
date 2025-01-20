package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;

public class Checkboxes extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    WebElement checkbox = driver.findElement(By.id("my-check-1"));
    boolean isSelected = checkbox.isSelected();
    if (!isSelected) {
      checkbox.click();
    }
    
    driver.quit();
  }
}