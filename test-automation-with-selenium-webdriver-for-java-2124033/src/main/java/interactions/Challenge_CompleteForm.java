package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import setup.Main;

public class Challenge_CompleteForm extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    // enter text into input of type text
    driver.findElement(By.id("my-text-id")).sendKeys("username");

    // enter text into input of type password
    driver.findElement(By.name("my-password")).sendKeys("passw0rd");

    // enter text into textarea
    driver.findElement(By.name("my-textarea")).sendKeys("I am learning Selenium WebDriver");

    // select from dropdown
    new Select(driver.findElement(By.name("my-select"))).selectByValue("3");

    // deselect checkbox
    WebElement checkedCheckbox = driver.findElement(By.id("my-check-1"));
    if(checkedCheckbox.isSelected()){
        checkedCheckbox.click();
    }

    // select checkbox
    WebElement defaultCheckbox = driver.findElement(By.id("my-check-2"));
    if(!defaultCheckbox.isSelected()){
        defaultCheckbox.click();
    }

    // select radio button
    driver.findElement(By.id("my-radio-2")).click();

    // click button
    driver.findElement(By.xpath("//button[text()='Submit']")).click();

    driver.quit();
  }
}