package interactions;

import setup.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownMenus extends Main {


  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    driver.findElement(By.name("my-select"));
    Select dropdown = new Select(driver.findElement(By.name("my-select")));
    dropdown.selectByValue("2");
    dropdown.selectByVisibleText("One");
    dropdown.selectByIndex(0);

    WebElement selectedOption = dropdown.getFirstSelectedOption();
    List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();

    /*
     * Deselect only works on multi-select dropdown menus
     * 
     * dropdown.deselectByValue("2");
     * dropdown.deselectByVisibleText("One");
     * dropdown.deselectByIndex(0); 
     */

    driver.quit();
  }
  
}
