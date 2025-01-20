package browser_interactions;

import org.openqa.selenium.Cookie;

import setup.Main;

public class Cookies extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    Cookie cookie = new Cookie("theme", "light");
    driver.manage().addCookie(cookie);

    Cookie themeCookie = driver.manage().getCookieNamed("theme");
    System.out.println(themeCookie.getDomain());

    driver.manage().deleteCookie(themeCookie);
    System.out.println(driver.manage().getCookies().size());

    driver.quit();
  }
}