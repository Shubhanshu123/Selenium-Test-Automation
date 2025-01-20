package browser_interactions;

import setup.Main;

public class BrowserInfo extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    String title = driver.getTitle();
    String url = driver.getCurrentUrl();
    System.out.println(title);
    System.out.println(url);

    driver.quit();
  }
}