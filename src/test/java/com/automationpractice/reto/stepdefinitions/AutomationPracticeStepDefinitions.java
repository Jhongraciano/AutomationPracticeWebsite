package com.automationpractice.reto.stepdefinitions;

import com.automationpractice.reto.models.DataAutomationPractice;
import com.automationpractice.reto.questions.ValidatePurchase;
import com.automationpractice.reto.questions.ValidateTheNewAddress;
import com.automationpractice.reto.questions.ValidateUpdateMessage;
import com.automationpractice.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class AutomationPracticeStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that JD opens the Automation Practice Website page$")
    public void thatJDOpensTheAutomationPracticeWebsitePage() {
        OnStage.theActorCalled("JD").wasAbleTo(OpenTheBrowser.onTheAutomationPracticePage());
    }

    @Given("^proceeds to log in with its corresponding user$")
    public void proceedsToLogInWithItsCorrespondingUser(List<DataAutomationPractice> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignIn.onTheAutomationPracticePage(data));
    }

    @When("^enter the option My personal information and change date of birth$")
    public void enterTheOptionMyPersonalInformationAndChangeDateOfBirth(List<DataAutomationPractice> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateMyPersonalInformation.onTheAutomationPracticePage(data));
    }

    @Then("^Validate the message that has been successfully updated$")
    public void validateTheMessageThatHasBeenSuccessfullyUpdated(List<DataAutomationPractice> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUpdateMessage.onTheAutomationPracticePage(data), Matchers.equalTo("Your personal information has been successfully updated.")));
    }

    @When("^enter the my addresses option and add a new address$")
    public void enterTheMyAddressesOptionAndAddANewAddress(List<DataAutomationPractice> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddAnewAddress.onTheAutomationPracticePage(data));
    }

    @Then("^validate that if it was created successfully$")
    public void validateThatIfItWasCreatedSuccessfully(List<DataAutomationPractice> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTheNewAddress.onTheAutomationPracticePage(data)));
    }

    @When("^I am looking for the product I want to buy$")
    public void iAmLookingForTheProductIWantToBuy(List<DataAutomationPractice> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(MakeAPurchase.onTheAutomationPracticePage(data));
    }

    @Then("^Validate that if it appears to me that it was successful$")
    public void validateThatIfItAppearsToMeThatItWasSuccessful(List<DataAutomationPractice> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePurchase.onTheAutomationPracticePage(data), Matchers.equalTo("Your order on My Store is complete.")));
    }
}
