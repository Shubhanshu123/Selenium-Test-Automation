package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class Challenge_MultipleKeyPresses extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/keyboard_shortcut.html");

    new Actions(driver)
        .keyDown(Keys.CONTROL)
        .keyDown(Keys.SHIFT)
        .sendKeys("1")
        .keyUp(Keys.SHIFT)
        .keyUp(Keys.CONTROL)
        .perform();

    driver.quit();
  }
}