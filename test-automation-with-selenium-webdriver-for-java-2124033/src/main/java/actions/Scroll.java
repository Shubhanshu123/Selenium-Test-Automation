package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class Scroll extends Main {

  public static void main(String[] args) {

    // Scroll to element
    driver.get("https://www.selenium.dev/selenium/web/scroll.html");
    var line9 = driver.findElement(By.id("line9"));
    System.out.println(line9.isDisplayed());
    new Actions(driver).scrollToElement(line9).perform();

    // Scroll by amount
    driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/page_with_tall_frame.html");
    var height = driver.findElement(By.tagName("body")).getSize().getHeight();
    new Actions(driver).scrollByAmount(0, height).perform();

    driver.quit();
  }
}