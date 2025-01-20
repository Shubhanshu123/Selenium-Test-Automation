package browser_interactions;

import org.openqa.selenium.By;

import setup.Main;

public class Navigation extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/clicks.html");

    System.out.println("on page: " + driver.getTitle());

    driver.findElement(By.id("twoClientRects")).click();
    System.out.println("clicked link. now on page: " + driver.getTitle());

    driver.navigate().back();
    System.out.println("went back.  on page: " + driver.getTitle());

    driver.navigate().forward();
    System.out.println("went forward. on page: " + driver.getTitle());

    driver.quit();
  }
}