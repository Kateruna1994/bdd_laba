package stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterAccountPage;

public class RegisterAccountStepDefs {
  private final RegisterAccountPage registerAccountPage = new RegisterAccountPage();
  Faker faker = new Faker();
  String password = faker.internet().password();


  @When("I enter First name")
  public void enterFirstName() {
    registerAccountPage.enterFirstName(faker.name().firstName());
  }

  @When("I enter Last name")
  public void enterLastName() {
    registerAccountPage.enterLastName(faker.name().lastName());
  }

  @When("I enter email")
  public void enterEmail() {
    registerAccountPage.enterEmail(faker.internet().emailAddress());
  }

  @When("I enter Telephone")
  public void enterTelephone() {
    registerAccountPage.enterPhone(faker.phoneNumber().cellPhone());
  }

  @When("I enter Password")
  public void enterPassword() {
    registerAccountPage.enterPassword(password);
  }

  @When("I enter Password Confirm")
  public void enterPasswordConfirm() {
    registerAccountPage.enterPasswordConfirm(password);
  }

  @When("I check on check box")
  public void clickOnCheckbox() {
    registerAccountPage.clickOnThePrivacyPolicyCheckBox();
  }

  @When("I click on continue button")
  public void clickOnContinueButton() {
    registerAccountPage.clickOnTheContinueButton();
  }

  @Then("The test appeared {String}")
  public void theTestAppearedYourAccountHasBeenCreated() {
  }
}
