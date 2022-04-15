package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class TestHooks {

  @Before
  public void setUpDriver(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    BasePage.setDriver(driver);
  }

  @After
  public void quiteDriver(){
    BasePage.getDriver().quit();
  }

}
