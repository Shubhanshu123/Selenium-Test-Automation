package browser_interactions;

import org.openqa.selenium.By;

import setup.Main;

public class Iframes extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/click_tests/click_in_iframe.html");

    driver.switchTo().frame("ifr");
    driver.findElement(By.id("link")).click();
    driver.switchTo().defaultContent();

    driver.quit();
  }
}