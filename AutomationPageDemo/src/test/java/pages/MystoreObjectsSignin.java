package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MystoreObjectsSignin {

public MystoreObjectsSignin(WebDriver drive) {
PageFactory.initElements(drive, this);
}
@FindBy(xpath="//a[@title='Log in to your customer account']") WebElement MystoreSignin;


public boolean MyStoreSignin() {return MystoreSignin.isDisplayed();}
public void Signin_button() {MystoreSignin.click();}


}
