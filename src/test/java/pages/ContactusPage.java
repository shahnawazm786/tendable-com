package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.SeleniumCommonFunction;
import static org.junit.Assert.*;
public class ContactusPage {
    WebDriver driver;
    public ContactusPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.XPATH,using="//a[text()='Contact Us']")
    private WebElement menu_contact_us_menu_xpath;

    @FindBy(how= How.XPATH,using="//div[contains(text(),'Marketing')]//parent::div//descendant::button")
    private WebElement menu_contact_us_marketing_button_xpath;

    @FindBy(how= How.ID,using="form-input-fullName")
    private WebElement contact_us_full_name_text_box_id;

    @FindBy(how= How.ID,using="form-input-organisationName")
    private WebElement contact_us_form_input_organisationname_text_box_id;

    @FindBy(how= How.ID,using="form-input-cellPhone")
    private WebElement contact_us_form_input_cell_phone_text_box_id;

    @FindBy(how= How.ID,using="form-input-email")
    private WebElement contact_us_form_input_email_text_box_id;

    @FindBy(how= How.ID,using="form-input-jobRole")
    private WebElement contact_us_form_input_job_role_text_box_id;

    @FindBy(how= How.XPATH,using="(//option[text()='Executive Board Member'])[1]")
    private WebElement contact_us_form_input_job_role_executive_board_member_xpath;

    @FindBy(how= How.ID,using="form-input-message")
    private WebElement contact_us_form_input_message_text_box_id;

    @FindBy(how= How.XPATH,using="(//input[@value='Consent Agreed'])[1]")
    private WebElement contact_us_form_input_consent_agreed_radio_button_xpath;

    //
    @FindBy(how= How.XPATH,using="(//button[@type='submit' and @data-original-text='Submit'])[1]")
    private WebElement contact_us_form_input_submit_button_xpath;

    @FindBy(how= How.XPATH,using="//*[contains(text(),'Sorry')] | ( //h3[contains(text(),'Form has been submitted successfully!')])[1]")
    private WebElement contact_us_form_error_message_label;

    ////*[text()='Form has been submitted successfully!']

    // *********************************** Function ****************
    public void ContactusMenuClick(){
        SeleniumCommonFunction.WaitElement(driver,menu_contact_us_menu_xpath,20);
        SeleniumCommonFunction.Click(menu_contact_us_menu_xpath);
    }
    public void ContactusMeetingClick(){
        SeleniumCommonFunction.WaitElement(driver,menu_contact_us_marketing_button_xpath,20);
        SeleniumCommonFunction.Click(menu_contact_us_marketing_button_xpath);
    }
    public void verifyFormFeed(){
        SeleniumCommonFunction.WaitElement(driver,contact_us_full_name_text_box_id,20);
        assertTrue(SeleniumCommonFunction.IsDisplayed(contact_us_full_name_text_box_id));
    }
    public void enterFullName(String fullName){
        SeleniumCommonFunction.WaitElement(driver,contact_us_full_name_text_box_id,20);
        SeleniumCommonFunction.SendKeys(contact_us_full_name_text_box_id,fullName);
    }
    public void enterOgranizationName(String orgName){
        //contact_us_form_input_organisationname_text_box_id
        SeleniumCommonFunction.WaitElement(driver,contact_us_form_input_organisationname_text_box_id,20);
        SeleniumCommonFunction.SendKeys(contact_us_form_input_organisationname_text_box_id,orgName);
    }
    public void enterPhoneNumber(String phone)
    {
        SeleniumCommonFunction.WaitElement(driver,contact_us_form_input_cell_phone_text_box_id,20);
        SeleniumCommonFunction.SendKeys(contact_us_form_input_cell_phone_text_box_id,phone);
    }
    public void enterEmail(String email){
        SeleniumCommonFunction.WaitElement(driver,contact_us_form_input_email_text_box_id,20);
        SeleniumCommonFunction.SendKeys(contact_us_form_input_email_text_box_id,email);
    }
    public void enterJob(){
        SeleniumCommonFunction.WaitElement(driver,contact_us_form_input_job_role_text_box_id,20);
        SeleniumCommonFunction.ScrollToElement(driver,contact_us_form_input_job_role_text_box_id);
        /*SeleniumCommonFunction.Click(contact_us_form_input_job_role_text_box_id);
        SeleniumCommonFunction.ScrollToElement(driver,contact_us_form_input_job_role_executive_board_member_xpath);
        SeleniumCommonFunction.WaitElement(driver,contact_us_form_input_job_role_executive_board_member_xpath,20);
        SeleniumCommonFunction.Click(contact_us_form_input_job_role_executive_board_member_xpath);*/
        //Select select=new Select(contact_us_form_input_job_role_text_box_id);
        SeleniumCommonFunction.Selects(contact_us_form_input_job_role_text_box_id);

    }
    public void enterAddress(String address){
        SeleniumCommonFunction.ScrollToElement(driver,contact_us_form_input_submit_button_xpath);
        SeleniumCommonFunction.WaitElement(driver,contact_us_form_input_message_text_box_id,20);
        SeleniumCommonFunction.SendKeys(contact_us_form_input_message_text_box_id,address);
    }

    public void clickOnAgreement() throws InterruptedException{
        Thread.sleep(2000);
        SeleniumCommonFunction.WaitElementTillVisible(driver,contact_us_form_input_consent_agreed_radio_button_xpath,40);
        SeleniumCommonFunction.ScrollToElement(driver,contact_us_form_input_consent_agreed_radio_button_xpath);
        SeleniumCommonFunction.Click(contact_us_form_input_consent_agreed_radio_button_xpath);
    }
    public void clickOnSubmit(){
        SeleniumCommonFunction.WaitElement(driver,contact_us_form_input_submit_button_xpath,20);
        SeleniumCommonFunction.ScrollToElement(driver,contact_us_form_input_submit_button_xpath);
        SeleniumCommonFunction.Click(contact_us_form_input_submit_button_xpath);
    }
    public void verifyErrorMessage(String error){
        if(!(error.isEmpty() | error.isBlank() )) {
            SeleniumCommonFunction.WaitElementTillVisible(driver,contact_us_form_error_message_label,20);
            SeleniumCommonFunction.ScrollToElement(driver,contact_us_form_error_message_label);

            String text = SeleniumCommonFunction.GetText(contact_us_form_error_message_label);
            assertEquals(error, text);
        }
    }
}
