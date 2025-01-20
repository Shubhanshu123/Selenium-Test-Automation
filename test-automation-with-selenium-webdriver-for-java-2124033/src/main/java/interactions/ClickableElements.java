package interactions;

import org.openqa.selenium.By;

import setup.Main;

public class ClickableElements extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    
    //driver.findElement(By.xpath("//button[text()='Submit']")).click();
    driver.findElement(By.xpath("//a[normalize-space(text())='Return to index']")).click();

    driver.quit();
  }

}