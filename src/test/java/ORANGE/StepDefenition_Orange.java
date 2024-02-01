package ORANGE;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class StepDefenition_Orange {

    static WebDriver driver;
    static ForgotPassword_Orange forgotPasswordOrange;

    @Before
    public void before(){
//        Prasanna local driver removed
//        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
        driver = DriverSetup_Orange.Getdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        forgotPasswordOrange=new ForgotPassword_Orange(driver);
    }
    @Given("user on orange login page")
    public void user_on_orange_login_page() {
        forgotPasswordOrange.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("user click the forgot password button")
    public void userClickTheForgotPasswordButton() {
    forgotPasswordOrange.forgetpassword();
    }

    @Then("site should redirect user to reset password page")
    public void siteShouldRedirectUserToResetPasswordPage() {
    forgotPasswordOrange.resetpassword();
    }

    @When("user provide his valid username")
    public void userProvideHisValidUsername() {
   forgotPasswordOrange.usernamereset("prasanna");
    }

    @And("click the reset password button")
    public void clickTheResetPasswordButton() {
    forgotPasswordOrange.restBTN();
    }

    @Then("site should redirect user to {string} page")
    public void siteShouldRedirectUserToPage(String arg0) {
    forgotPasswordOrange.mailsentpage();
    }
    @After
    public void after(Scenario scenario){
        scenario.log("STATUS: "+scenario.getStatus());
        driver.quit();
    }
    @AfterStep
    public void afterstep(Scenario scenario){
        final byte[] screenshotTaken = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshotTaken, "image/png", "Screenshot");

    }
}
