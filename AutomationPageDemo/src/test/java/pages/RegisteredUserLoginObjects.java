package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserLoginObjects {

	public RegisteredUserLoginObjects(WebDriver drive) {
	PageFactory.initElements(drive,this);
	}

@FindBy(xpath="//h3[text()='Already registered?']") WebElement AlReadyRegistered;
@FindBy(xpath="//input[@id='email']") WebElement Emailid;
@FindBy(xpath="//input[@id='passwd']") WebElement password;
@FindBy(xpath="//button[@id='SubmitLogin']") WebElement SigninAction;


	
public boolean AlRegisteredDisplay() {return AlReadyRegistered.isDisplayed();}
public boolean EmailAddressDisplay() {return Emailid.isDisplayed();}
public void EnterEmail(String mail) {Emailid.sendKeys(mail);}
public boolean PasswordDisplay() {return password.isDisplayed();}
public void EnterPassword(String pass) {password.sendKeys(pass);}
public boolean SigninDisplay() {return SigninAction.isDisplayed();}
public void SigninClick() { SigninAction.click();}
	
}
	


