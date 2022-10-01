package pages;

import java.util.List;

import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomationObjects {

	
public AutomationObjects(WebDriver drive) {
	PageFactory.initElements(drive, this);
}
@FindBy(xpath="//a[@title='Log in to your customer account']") WebElement signin;
@FindBy(xpath="//input[@id='email_create']")WebElement mail;
@FindBy(xpath="//button[@id='SubmitCreate']")WebElement createaccount;
@FindBy(xpath="//p[text()='Please enter your email address to create an account.']")WebElement ivalidmail;
@FindBy(xpath="//h3[text()='Your personal information']")WebElement personalinfo;
@FindBy(xpath="(//input[@name='id_gender'])[1]") WebElement Gender;
@FindBy(xpath="//input[@id=\"customer_firstname\"]")WebElement firstname;
@FindBy(xpath="//input[@id=\"customer_lastname\"]") WebElement lastname;
@FindBy(xpath="//input[@id=\"passwd\"]") WebElement password;
@FindBy(xpath="//select[@id='days']") WebElement day;
@FindBy(xpath="//select[@id=\"months\"]") WebElement month;
@FindBy(xpath="//select[@id=\"years\"]") WebElement year;
@FindBy(xpath="//input[@id='company']") WebElement company;
@FindBy(xpath="//input[@id='address1']") WebElement Address;
@FindBy(xpath="//input[@id='address2']") WebElement Address2;
@FindBy(xpath="//input[@id='city']") WebElement cityname;
@FindBy(xpath="//select[@id='id_state']") WebElement statename;
@FindBy(xpath="//input[@id='postcode']") WebElement postcode;
@FindBy(xpath="//select[@id='id_country']") WebElement Country;
@FindBy(xpath="//input[@id='phone_mobile']") WebElement phone;
@FindBy(xpath="//input[@id='alias']") WebElement refrenceaddress;
@FindBy(xpath="//button[@id='submitAccount']") WebElement RegisterButton;
@FindBy(xpath="//a[@class='account']/span") WebElement AccountName;
@FindBy(xpath="//a[@title='Log me out']") WebElement Signout;






	
public boolean VerifySigninDispaly() {
	return signin.isDisplayed();
}
public void SigninButton() {
	signin.click();
}
public boolean verifyEmailDisplay() {
	return mail.isEnabled();
	
}
public void InputMail(String mailid) {
mail.sendKeys(mailid);
}
public boolean VerifyCreateAccountDisplay() {
	return createaccount.isDisplayed();
	
}
public void ClickCreateAccount() {
	createaccount.click();
}
public boolean InvalidMailError() {
	return ivalidmail.isDisplayed();
}
public boolean PersonalInformation() {
	return personalinfo.isDisplayed();
}
public boolean verifygenderclick() {
	return Gender.isSelected();
	
}
public void  verifygenderSelection() {
 if(Gender.isSelected()==false) {
		Gender.click();
}

}
public boolean FirstNameDispaly() {
	return firstname.isDisplayed();
	
}
public void InputFirstName(String fname) {
	firstname.sendKeys(fname);
}
public boolean LastnameDisplay() {
	return lastname.isDisplayed();
}
public void InputLastName(String lname) {
	lastname.sendKeys(lname);
}
public void Inputpass1(String pass2) {
	password.sendKeys(pass2);
	Assert.assertTrue(pass2.length()>=5,"please enter  minimum 6 charectars for password");
}
public boolean verifyDateofBirth() {
	return day.isEnabled();
}
public void DateofBirthSelection(String k,String m,String y) {
 
 day.click();
 Select s=new Select(day);
 s.selectByValue(k);
 
 month.click();
 Select p=new Select(month);
 p.selectByValue(m);
 
 year.click();
 Select r=new Select(year);
 r.selectByValue(y);
 year.click();
 }
public boolean Companydisplay() {
	return company.isDisplayed();
}
public void InputCompany(String Organization) {
	
  company.sendKeys(Organization);
  Assert.assertEquals(Organization, Organization.toUpperCase(),"please enter the companyname in uppercase ");
}
public boolean AddressDisplay() {
	return Address.isDisplayed();
	
}
public void InputAddress(String locationInput) {
	Address.sendKeys(locationInput);
	Assert.assertTrue(locationInput.length()>=10,"please enter minimum 10 charectars for address");
}
public boolean Address2Dispaly() {
	return Address2.isDisplayed();
}
public void InputAddress2(String address2) {
	Address2.sendKeys(address2);
}
public boolean CityNameDisplay() {
	return cityname.isDisplayed();
}
public void InputCity(String city) {
	cityname.sendKeys(city);
}
public boolean statedisplay() {
	return statename.isEnabled();
}
public void InputState(String state) {
	statename.click();
	Select s=new Select(statename);
	s.selectByVisibleText(state);
	
}
public boolean postcosediaplay() {
	return postcode.isDisplayed();
}
public void Inputpostcode(String citycode) {
	postcode.sendKeys(citycode);
	
}
public boolean CountryDisplay() {
	return Country.isEnabled();
}
public void InputCountry(String countryname) {
	Country.click();
	Select s=new Select(Country);
	s.selectByVisibleText(countryname);
}
public boolean phonedisplay() {
	return phone.isDisplayed();
}
public void InputPhone(String phonenum) {
	phone.sendKeys(phonenum);
	Assert.assertTrue(phonenum.length()==10,"please Enter the 10 digit phone number");
}
public boolean RefrenceAddressDisplay() {
	return refrenceaddress.isDisplayed() ;
}
public void InputRefrenceAdress(String ReferenceAdd) {
	refrenceaddress.clear();
	refrenceaddress.sendKeys(ReferenceAdd);
}
public boolean RegisterButtonDisplay() {
	return RegisterButton.isDisplayed();
	
}
public void RegisterClick() {
	RegisterButton.click();
}
public boolean AccountNameDisplay() {
	return AccountName.isDisplayed();
}
public void AccountNameText() {
	System.out.println(AccountName.getText()+" AccountName created ");
}
public boolean SignoutDisplay() {
	return Signout.isEnabled();
	
}
public void Signoutclick() {
	Signout.click();
}








}



 

