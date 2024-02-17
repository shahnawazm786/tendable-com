package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {
    HomePage home=new HomePage(MyHooks.driver);
    @Given("user access the website and verify home page")
    public void userAccessTheWebsiteAndVerifyHomePage() {
    home.verifyHomeMenu();
    home.verifyRequestDemoMenu();
    }

    @And("user verify our story menu")
    public void userVerifyOurStoryMenu() {
        home.OurStoryMenuClick();
        home.verifyRequestDemoMenu();
    }

    @And("user verify our solution menu")
    public void userVerifyOurSolutionMenu() {
       home.OurSolutionMenuClick();
       home.verifyRequestDemoMenu();
    }

    @And("user verify why tendable menu")
    public void userVerifyWhyTendableMenu() {
        home.WhyTendableMenuClick();
        home.verifyRequestDemoMenu();
    }

    @And("user verify about us menu")
    public void userVerifyAboutUsMenu() {
        home.AboutUsMenuClick();
        home.AboutUsOurTeamMenuClick();
        home.verifyRequestDemoMenu();
    }

    @And("user verify request a demo menu")
    public void userVerifyRequestADemoMenu() {
    }
}
