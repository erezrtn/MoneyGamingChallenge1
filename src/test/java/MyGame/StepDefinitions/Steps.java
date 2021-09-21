package MyGame.StepDefinitions;

import MyGame.Pages.HomePage;
import MyGame.Pages.JoinNowPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class Steps {
    @Given("The user should be able to navigate to https:\\/\\/moneygaming.qa.gameaccount.com")
    public void the_user_should_be_able_to_navigate_to_https_moneygaming_qa_gameaccount_com() {
        System.out.println("==========THE WEBSITE IS LAUNCHED===============");
    }
    @When("The user click on JOIN NOW! button")
    public void the_user_click_on_join_now_button() {
            HomePage homePage = new HomePage();
            homePage.setJoinNowButton();

            System.out.println("Fill all the blanks");
    }
    @Then("The user select the title value")
    public void the_user_select_the_title_value() {
        JoinNowPage joinNowPage = new JoinNowPage();
        joinNowPage.setTitle();
    }
    @Then("The user provide credentials")
    public void the_user_provide_credentials(Map<String, String> dataTable) {
        JoinNowPage joinNowPage = new JoinNowPage();
        joinNowPage.setFirstName(dataTable.get("FirstName"));


    }
    @Then("The user should be able to click JOIN NOW! button")
    public void the_user_should_be_able_to_click_join_now_button() {

    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {

    }
    @Then("The user should be agree the terms and conditions")
    public void the_user_should_be_agree_the_terms_and_conditions() {

    }
    @Then("The user should be able to click JOIN NOW! button with agree on terms and conditions")
    public void the_user_should_be_able_to_click_join_now_button_with_agree_on_terms_and_conditions() {

    }
}
