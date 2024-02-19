package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactusPage;

public class ContactusPageSteps {
    ContactusPage contact=new ContactusPage(MyHooks.driver);
    @When("user click on contact")
    public void userClickOnContact() {
        contact.ContactusMenuClick();
    }

    @And("user click on marketing option")
    public void userClickOnMarketingOption() {
        contact.ContactusMeetingClick();
    }

    @Then("user verify form feed displayed")
    public void userVerifyFormFeedDisplayed() {
     contact.verifyFormFeed();
    }

    @When("user enter {string} in fullname text box")
    public void userEnterFullnameInFullnameTextBox(String fullName) {
    contact.enterFullName(fullName);
    }

    @And("user enter {string} in organization text box")
    public void userEnterOrganizationInOrganizationTextBox(String orgName) {
        contact.enterOgranizationName(orgName);
    }

    @And("user enter {string} in phone text box")
    public void userEnterPhonenumberInPhoneTextBox(String phone) {
        contact.enterPhoneNumber(phone);
    }

    @And("user enter {string} in email text box")
    public void userEnterEmailInEmailTextBox(String email) {
        contact.enterEmail(email);
    }

    @And("user enter job role")
    public void userEnterJobRole() {
        contact.enterJob();
    }

    @And("user enter {string} in text area")
    public void userEnterMessageInTextArea(String address) {
        contact.enterAddress(address);
    }

    @And("Select the agreement radio")
    public void selectTheAgreementRadio() throws InterruptedException {
       contact.clickOnAgreement();
    }

    @When("click on submit button")
    public void clickOnSubmitButton() {
        contact.clickOnSubmit();
    }

    @Then("verify the {string} in error message area")
    public void verifyTheMessageInErrorMessageArea(String errorMessage) {
    contact.verifyErrorMessage(errorMessage);
    }
}
