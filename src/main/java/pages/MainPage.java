package pages;

import io.cucumber.java.it.Ma;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

  private final By clickButton = By.xpath("//a[@title='My Account']");
  private final By clickButtonRegister = By.xpath
      ("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']");

  public void openMainPage(){
    getDriver().get("https://demo.opencart.com/");
  }


  public MainPage clickOnAccountButton() {
   getDriver().findElement(clickButton).click();
    return this;
  }

public RegisterAccountPage clickRegisterAccountButton(){
    getDriver().findElement(clickButtonRegister).click();
    return new RegisterAccountPage();
}

}
