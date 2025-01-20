package page_objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  private final By usernameField = By.id("username-field");
  private final By passwordField = By.id("password-field");
  private final By loginButton = By.id("login-form-submit");

  private final WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void setUsername(String username) {
    driver.findElement(usernameField).sendKeys(username);
  }

  public void setPassword(String password) {
    driver.findElement(passwordField).sendKeys(password);
  }

  public String clickLoginButton() {
    driver.findElement(loginButton).click();
    Alert alert = driver.switchTo().alert();
    String message = alert.getText();
    alert.accept();
    return message;
  }

  public String login(String username, String password) {
    setUsername(username);
    setPassword(password);
    return clickLoginButton();
  }
}