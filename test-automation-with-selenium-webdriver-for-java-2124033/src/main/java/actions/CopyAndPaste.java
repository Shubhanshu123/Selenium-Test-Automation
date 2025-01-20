package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class CopyAndPaste extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    var field1 = driver.findElement(By.id("withText"));
    var field2 = driver.findElement(By.id("emptyTextArea"));

    Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

    Actions actions = new Actions(driver);

    // Copy
    actions.click(field1)
        .keyDown(cmdCtrl)
        .sendKeys("a")
        .sendKeys("c")
        .keyUp(cmdCtrl)
        .perform();

    // Paste
    actions.click(field2)
        .keyDown(cmdCtrl)
        .sendKeys("v")
        .keyUp(cmdCtrl)
        .perform();

    driver.quit();
  }
}