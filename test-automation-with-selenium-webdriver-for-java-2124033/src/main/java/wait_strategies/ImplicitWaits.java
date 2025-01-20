package wait_strategies;

import setup.Main;
import java.time.Duration;
import org.openqa.selenium.By;

public class ImplicitWaits extends Main {

  public static void main(String[] args) {
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
    driver.findElement(By.id("reveal")).click();
    driver.findElement(By.id("revealed")).sendKeys("I see you");

    driver.quit();
  }

}
