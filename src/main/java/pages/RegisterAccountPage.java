package pages;

import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {

  private final By clickFieldUserName = By.id("input-firstname");
  private final By clickFieldLastName = By.id("input-lastname");
  private final By clickFieldEmail = By.id("input-email");
  private final By clickFieldPhone = By.id("input-telephone");
  private final By clickFieldPassword = By.id("input-password");
  private final By clickFieldPasswordConfirm = By.id("input-confirm");
  private final By clickOnTheCheckBox = By.xpath("//input[@type='checkbox']");
  private final By clickOnButtonContinue = By.xpath("//input[@value='Continue']");


  public RegisterAccountPage enterFirstName(String firstName){
    getDriver().findElement(clickFieldUserName).sendKeys(firstName);
    return this;
  }

  public RegisterAccountPage enterLastName(String lastName){
    getDriver().findElement(clickFieldLastName).sendKeys(lastName);
    return this;
  }

  public RegisterAccountPage enterEmail(String email) {
    getDriver().findElement(clickFieldEmail).sendKeys(email);
    return this;
  }

  public RegisterAccountPage enterPhone(String phone) {
    getDriver().findElement(clickFieldPhone).sendKeys(phone);
    return this;
  }

  public RegisterAccountPage enterPassword(String password) {
    getDriver().findElement(clickFieldPassword).sendKeys(password);
    return this;
  }

  public RegisterAccountPage enterPasswordConfirm(String passwordConfirm) {
    getDriver().findElement(clickFieldPasswordConfirm).sendKeys(passwordConfirm);
    return this;
  }

  public RegisterAccountPage clickOnThePrivacyPolicyCheckBox() {
    getDriver().findElement(clickOnTheCheckBox).click();
    return this;
  }

  public PersonalCabinetPage clickOnTheContinueButton() {
    getDriver().findElement(clickOnButtonContinue).click();
    return new PersonalCabinetPage();
  }

}
