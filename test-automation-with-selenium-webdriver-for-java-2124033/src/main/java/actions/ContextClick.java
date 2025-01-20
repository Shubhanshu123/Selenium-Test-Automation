package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import setup.Main;

public class ContextClick extends Main {

  public static void main(String[] args) {
    driver.get("https://selenium.dev/selenium/web/mouse_interaction.html");

    var input = driver.findElement(By.id("clickable"));
    new Actions(driver).contextClick(input).perform();
    System.out.println(driver.findElement(By.id("click-status")).getText());

    driver.quit();
  }
}