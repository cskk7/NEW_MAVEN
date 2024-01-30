package ORANGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ForgotPassword_Orange {

    static WebDriver driver;

    public ForgotPassword_Orange(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH,using = "//p[text()='Forgot your password? ']")
    protected WebElement ForgetPasswordBTN;

    @FindBy(how = How.XPATH,using = "//h6[text()='Reset Password']")
    protected WebElement ResetPasswordTXT;

    @FindBy(how = How.XPATH,using = "//input[@name='username']")
    protected WebElement EnterUsernameInReset;

    @FindBy(how = How.XPATH,using = "//button[@type='submit']")
    protected WebElement ClickResetBTN;

    @FindBy(how = How.XPATH,using = "//h6[text()='Reset Password link sent successfully']")
    protected WebElement MailSentSuccessTXT;

    public void launchURL(String strURL){
        driver.get(strURL);
    }

    public void forgetpassword (){
        ForgetPasswordBTN.click();
    }

    public void resetpassword(){
        Assert.assertTrue( ResetPasswordTXT.isDisplayed());
        System.out.println( ResetPasswordTXT.getText());
    }
    public void usernamereset(String struserreset){
        EnterUsernameInReset.sendKeys(struserreset);

    }
    public void restBTN(){
        ClickResetBTN.click();

    }
    public void mailsentpage(){
        Assert.assertTrue( MailSentSuccessTXT.isDisplayed());
        System.out.println( MailSentSuccessTXT.getText());
    }
}
