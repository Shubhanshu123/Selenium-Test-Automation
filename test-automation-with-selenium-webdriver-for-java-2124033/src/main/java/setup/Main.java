package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Main {

  static protected WebDriver driver;

  static {
    chromedriver().setup();

    var options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    //options.enableBiDi(); //needed for screenshots
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://google.com");
    driver.quit();
  }
}