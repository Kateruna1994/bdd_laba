package stepDefs;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.PersonalCabinetPage;

public class PersonalCabinetPageStepDefs {

  private final PersonalCabinetPage personalCabinetPage = new PersonalCabinetPage();


  @Then("The test appeared {string}")
  public void checkTextYouAccountHasBeenCreated(String expectedTextYouAccountHasBeenCreated) {
    String actualResultShouldBe = personalCabinetPage.checkForTextYourAccountHasBeenCreated();

    Assertions.assertThat(actualResultShouldBe)
        .as("After click button Continues should be " + expectedTextYouAccountHasBeenCreated)
        .isEqualTo(expectedTextYouAccountHasBeenCreated);

  }

}
