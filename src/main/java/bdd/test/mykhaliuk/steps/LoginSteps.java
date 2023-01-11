package bdd.test.mykhaliuk.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @When("user enters user1 and password1")
    public void user_enters_user1_and_password1() {

        System.out.println("Inside step: user enters username: user1 and password: password1");

    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Inside step: user clicks login button");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("Inside step: user is navigated to the home page");
    }

    @When("user enters user2 and password2")
    public void user_enters_user2_and_password2() {
        System.out.println("Inside step: user enters username: user2 and password: password2");
    }


    @When("user enters user3 and password3")
    public void user_enters_user3_and_password3() {
        System.out.println("Inside step: user enters username: user3 and password: password3");
    }


    @When("user enters user4 and password4")
    public void user_enters_user4_and_password4() {
        System.out.println("Inside step: user enters username: user4 and password: password4");
    }


    @When("user enters user5 and password5")
    public void user_enters_user5_and_password5() {
        System.out.println("Inside step: user enters username: user5 and password: password5");
    }


    @When("user enters invalid username and password")
    public void userEntersInvalidUsernameAndPassword() {

        System.out.println("Inside step: user enters invalid username and password");
    }

    @Then("error message is displayed - Invalid Credentials")
    public void errorMessageIsDisplayedInvalidCredentials() {

    }


    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Inside step: user is on login page");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

        System.out.println("Inside step: user enters valid username and password");
    }

    @When("user enters user6 and password6")
    public void user_enters_user6_and_password6() {
        System.out.println("Inside step: user enters username: user6 and password: password6");
    }
}
