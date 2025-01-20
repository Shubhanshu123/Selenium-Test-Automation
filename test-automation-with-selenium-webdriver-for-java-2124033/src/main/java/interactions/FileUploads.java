package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;

public class FileUploads extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    String filePath = "/workspaces/test-automation-with-selenium-webdriver-for-java-2124033/resources/file.txt";
    WebElement uploadElement = driver.findElement(By.name("my-file"));
    uploadElement.sendKeys(filePath);

    driver.quit();
  }
}