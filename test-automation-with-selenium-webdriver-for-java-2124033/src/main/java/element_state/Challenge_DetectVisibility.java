package element_state;

import setup.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Challenge_DetectVisibility extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/coordinates_tests/page_with_hidden_element.html");

    WebElement box = driver.findElement(By.id("box"));
    
    if(box.isDisplayed()){
      box.click();
    }
    else {
      System.out.println("box is not visible");
    }
    
    driver.quit();
  }
}
