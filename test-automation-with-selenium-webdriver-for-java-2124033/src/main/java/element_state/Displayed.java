package element_state;

import setup.Main;
import org.openqa.selenium.By;

public class Displayed extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    boolean isVisible = driver.findElement(By.name("my-hidden")).isDisplayed();

    driver.quit();
  }
}
