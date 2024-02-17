package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumCommonFunction;
import static  org.junit.Assert.*;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    // Element declaration Home

    @FindBy(how= How.CSS,using="a[class='logo']")
    private WebElement menu_home_tendable_css;

    @FindBy(how= How.CSS,using="a[href*='our-story']")
    private WebElement menu_our_story_tendable_css;

    @FindBy(how= How.CSS,using="a[href*='our-solution']")
    private WebElement menu_our_solution_tendable_css;

    @FindBy(how= How.CSS,using="a[href*='why-tendable']")
    private WebElement menu_why_tendable_tendable_css;

    @FindBy(how= How.XPATH,using="//a[text()='About Us']")
    private WebElement menu_about_us_tendable_xpath;

    @CacheLookup
    @FindBy(how= How.LINK_TEXT,using="Request A Demo")
    private WebElement menu_request_demo_link_text;

    ////h2[text()='Our Origin Story']

    @FindBy(how= How.XPATH,using="//h2[text()='Our Origin Story']")
    private WebElement our_story_header_text_xpath;


    @FindBy(how= How.XPATH,using="//h1[text()='Quality inputs deliver']")
    private WebElement our_solution_header_text_xpath;

    ////h2[contains(text(),'Why should you')]

    @FindBy(how= How.XPATH,using="//h2[contains(text(),'Why should you')]")
    private WebElement why_tendable_header_text_xpath;

//
    @FindBy(how= How.CSS,using="ul li a[href*='our-team']")
    private WebElement sub_menu_about_us_our_team_css;

//
    @FindBy(how= How.XPATH,using="//div[contains(text(),'Our mission is to create the')]")
    private WebElement about_us_our_team_header_text_xpath;

    //
    @FindBy(how= How.XPATH,using="//h1[text()='Request a Demo']")
    private WebElement request_demo_header_text_xpath;

    public void HomeMenuClick(){
        SeleniumCommonFunction.WaitElement(driver,menu_home_tendable_css,20);
        SeleniumCommonFunction.Click(menu_home_tendable_css);
    }
    public void verifyHomeMenu(){
        SeleniumCommonFunction.WaitElement(driver,menu_home_tendable_css,20);
        assertEquals("Quality Improvement App | Health and Social Care | Tendable",SeleniumCommonFunction.GetTitle(driver));
    }
    public void OurStoryMenuClick(){
        SeleniumCommonFunction.WaitElement(driver,menu_our_story_tendable_css,20);
        SeleniumCommonFunction.Click(menu_our_story_tendable_css);
    }
    public void verifyOurStoryMenu(){
        SeleniumCommonFunction.WaitElement(driver,our_story_header_text_xpath,20);
        assertTrue(SeleniumCommonFunction.IsDisplayed(our_story_header_text_xpath));
    }
    public void OurSolutionMenuClick(){
        SeleniumCommonFunction.WaitElement(driver,menu_our_solution_tendable_css,20);
        SeleniumCommonFunction.Click(menu_our_solution_tendable_css);
    }
    public void verifyOurSolutionMenu(){
        SeleniumCommonFunction.WaitElement(driver,menu_our_solution_tendable_css,20);
        assertTrue(SeleniumCommonFunction.IsDisplayed(our_solution_header_text_xpath));
    }
    public void WhyTendableMenuClick(){
        SeleniumCommonFunction.WaitElement(driver,menu_why_tendable_tendable_css,20);
        SeleniumCommonFunction.Click(menu_why_tendable_tendable_css);
    }
    public void verifyWhyTendableMenu(){
        SeleniumCommonFunction.WaitElement(driver,menu_why_tendable_tendable_css,20);
        assertTrue(SeleniumCommonFunction.IsDisplayed(why_tendable_header_text_xpath));
    }
    public void AboutUsMenuClick(){
        Actions actions=new Actions(driver);
        SeleniumCommonFunction.WaitElement(driver,menu_about_us_tendable_xpath,20);
        actions.moveToElement(menu_about_us_tendable_xpath).build().perform();
    }
    public void AboutUsOurTeamMenuClick(){
        SeleniumCommonFunction.WaitElement(driver,sub_menu_about_us_our_team_css,20);
        SeleniumCommonFunction.Click(sub_menu_about_us_our_team_css);

    }

    public void verifyAboutUsOurTeamMenu(){
        SeleniumCommonFunction.WaitElement(driver,about_us_our_team_header_text_xpath,20);
        assertTrue(SeleniumCommonFunction.IsDisplayed(about_us_our_team_header_text_xpath));
    }
    public void RequestDemoMenuClick(){
        SeleniumCommonFunction.WaitElement(driver,menu_request_demo_link_text,20);
        SeleniumCommonFunction.Click(menu_request_demo_link_text);
    }
    public void verifyRequestDemoMenu(){
    //    SeleniumCommonFunction.WaitElement(driver,request_demo_header_text_xpath,20);
    //    assertTrue(SeleniumCommonFunction.IsDisplayed(request_demo_header_text_xpath));
        SeleniumCommonFunction.WaitElement(driver,menu_request_demo_link_text,20);
        assertTrue(SeleniumCommonFunction.IsDisplayed(menu_request_demo_link_text));
        assertTrue(SeleniumCommonFunction.IsEnabled(menu_request_demo_link_text));

    }

}
