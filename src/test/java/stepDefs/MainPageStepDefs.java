package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageStepDefs {

  private final MainPage mainPage = new MainPage();

  @Given("I am on the main page")
  public void goToTheMainPage() {
    mainPage.openMainPage();
  }

  @When("I go to the account registration page")
  public void goToTheRegistrationPage() {
    mainPage.clickOnAccountButton().clickRegisterAccountButton();

  }



}
