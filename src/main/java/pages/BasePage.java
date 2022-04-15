package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

public class BasePage {

  private static WebDriver driver;


  public static WebDriver getDriver() {
    return driver;
  }

  public static void setDriver(WebDriver webDriver) {
    driver = webDriver;
  }
}
