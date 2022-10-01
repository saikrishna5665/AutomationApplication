package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccount_PageObject {


	public MyAccount_PageObject(WebDriver drive) {
		PageFactory.initElements(drive,this);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="(//a[text()='T-shirts'])[2]") WebElement  T_Shirt ;
@FindBy(xpath="//div[@class='product-container']") WebElement Movetotshirt;
@FindBy(xpath="//span[normalize-space()='Add to cart']") WebElement addtocart;
@FindBy(xpath="//a[@title='Proceed to checkout']") WebElement Proceedtocheckout;
@FindBy(xpath="//h2[normalize-space()='Product successfully added to your shopping cart']") WebElement Successfull_Message;
@FindBy(xpath="//table[@id='cart_summary']/descendant::tr") List<WebElement> table;
@FindBy(xpath="//div/ul[@class='address first_item item box']/descendant::li") List<WebElement>DeliveryAddress;
@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]") WebElement Proceedto_checkouts;
@FindBy(xpath="//button[@name='processAddress']") WebElement Proceedto_check_03;
@FindBy(xpath="//input[@type='checkbox']") WebElement Terms_Conditions_checkbox;
@FindBy(xpath="//button[@name='processCarrier']") WebElement Prodeedto_checkout;
@FindBy(xpath="//a[@title='Pay by check.']") WebElement paybycheck;

public boolean T_Shirts_Display() {
	return T_Shirt.isEnabled();
	
}
public void T_shirts_click() {
	T_Shirt.click();
}
public void Movetotshirts(WebDriver drive) {
	Actions a=new Actions(drive);
	a.moveToElement(Movetotshirt).perform();
}
public boolean Addtocart_Display() {
	return addtocart.isDisplayed();
}
public void Addcart() {
	addtocart.click();
}
public boolean Success_msg() {
	return Successfull_Message.isDisplayed();
	
}
public void succes_msg() {
Assert.assertEquals(Successfull_Message.getText(),"Product successfully added to your shopping cart" );}

public boolean ProceedToCheckout_Display() {
	return Proceedtocheckout.isEnabled();
}
public void ProceedtoCheckout_click() {
	Proceedtocheckout.click();
}
public void tabledetails() {
	System.out.println("=================Shipping Details=================");
	for(WebElement e:table) {
		System.out.println(e.getText()+"\t");
	}
}
public void Delivery_Details() {
	System.out.print("==================DeliveryDetails====================");
	for(WebElement d:DeliveryAddress) {
		System.out.println(d.getText());
	}
}
public boolean Proceedto_Check() {
	return Proceedto_checkouts.isDisplayed();
}
public void ProceedToCheck_Click() {
	Proceedto_checkouts.click();
}
public boolean Proceedto_check_3() {
	return Proceedto_check_03.isDisplayed();
}
public void Proceedtocheck_click_03() {
	Proceedto_check_03.click();
}
public boolean Term_condtions_checkbox_Display() {
	return Terms_Conditions_checkbox.isDisplayed();
}
public void Terms_condtioons_button() {
	Terms_Conditions_checkbox.click();
}
public boolean ProceedtoCheckout_04() {
	return Prodeedto_checkout.isDisplayed();
}
public void Proceedtocheckout_Click_04(){
	Prodeedto_checkout.click();
	
}
public boolean PayCheck_Display() {
	return paybycheck.isDisplayed();
}
public void PayCheck_Click() {
	paybycheck.click();
}









}
