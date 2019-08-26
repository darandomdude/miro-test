package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {

    @Given("^I have login page opened$")
    public void i_have_login_page_opened() throws InterruptedException {

        open("https://miro.com/login/"); //open login page in system's default browser
        //Thread.sleep(50000);
        System.out.print("checking start page...");

        //check if it loads
        try {
            $(By.id("email")).waitUntil(visible, 15000);
        }
        catch (NullPointerException e) {
            System.out.print("NullPointerException caught");
        }
    }

    @When("^I enter valid login and password$")
    public void i_enter_valid_login_and_password() throws Throwable {
        System.out.print("checking login...");

       $(("#email")).sendKeys("mr.rostar@gmail.com");   //enter login info
       $(("#password")).sendKeys("Qwerzxcvty");         //enter password
       $(By.cssSelector("body > div.overlay-signup > div > div.overlay-signup__form > div.overlay-signup__form-container > div > div > form > button")).click();
    }

    @Then("^I see board select menu$")
    public void i_see_board_select_menu() throws Exception {
        $(By.className("user-profile")).waitUntil(visible, 15000);
    }

}
