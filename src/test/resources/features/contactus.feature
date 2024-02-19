@Contactus
Feature: Contact us feature verification
  @Contactusverify
  Scenario Outline: Contact us
    Given user access the website and verify home page
    When user click on contact
    And user click on marketing option
    Then user verify form feed displayed
    When user enter '<fullname>' in fullname text box
    And user enter '<organization>' in organization text box
    And user enter '<phonenumber>' in phone text box
    And user enter '<email>' in email text box
    And user enter job role
    And user enter '<message>' in text area
    And Select the agreement radio
    When click on submit button
    Then verify the '<error>' in error message area
    Examples:
    |fullname||organization||phonenumber||email||message||error|
    |        John||        Gmail||      9198789678||john@gmail.com||1234-A, Mumbai||Form has been submitted successfully!|
    |        Jenny||        Yahoo||      4556789234||jenny@yahoo.com||||Sorry, there was an error submitting the form. Please try again.|
    |        Jenny||        Yahoo||      4556789234||||||Sorry, there was an error submitting the form. Please try again.|
    |        Jenny||        Yahoo||      ||||||Sorry, there was an error submitting the form. Please try again.|
    #|        Jenny||        ||      ||||||Sorry, there was an error submitting the form. Please try again.|
    #|        ||        ||      ||||||Sorry, there was an error submitting the form. Please try again.|
    #|        John||        Gmail||      9198789678||john@gmail.com||1234-A, Mumbai||No data found|
