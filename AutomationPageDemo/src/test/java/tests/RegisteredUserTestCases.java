package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.automationbase;
import pages.RegisteredUserLoginObjects;

public class RegisteredUserTestCases extends automationbase{
@Test
	public void Verify_Valid_RegisteredUserDetails() {
	
	    mso.Signin_button();
		RegisteredUserLoginObjects validuser=new RegisteredUserLoginObjects(drive);
		Assert.assertTrue(validuser.AlRegisteredDisplay(),"AlreadyRegistered Name is not  Visible ");
		Assert.assertTrue(validuser.EmailAddressDisplay(), "Emailid is not displayed");
		validuser.EnterEmail("Saikrishnareddy123@gmail.com");
		Assert.assertTrue(validuser.PasswordDisplay(),"Password textbox is not Enabled");
		validuser.EnterPassword("sai5665");
		Assert.assertTrue(validuser.SigninDisplay(),"Signin button is not Enabled");
		validuser.SigninClick();
		Assert.assertTrue(shop.T_Shirts_Display(),"Tshirts logo is not displayed");
		shop.T_shirts_click();
		shop.Movetotshirts(drive);
		Assert.assertTrue(false,"add cart is displaying");///its is wantedly falied to take screen shot
		shop.Addcart();
		//Assert.assertTrue(shop.Success_msg(),"After addtocart succes message is not displaying");
		//shop.succes_msg();
		Assert.assertTrue(shop.ProceedToCheckout_Display(),"Proceed to checkout is unable to Display");
		shop.ProceedtoCheckout_click();
		shop.tabledetails();
		shop.Delivery_Details();
		Assert.assertTrue(shop.Proceedto_Check(),"PReceed to checkuout is not displayed");
		shop.ProceedToCheck_Click();
		Assert.assertTrue(shop.Proceedto_check_3(),"proceedto check is displayed");
		shop.Proceedtocheck_click_03();
		//Assert.assertTrue(shop.Term_condtions_checkbox_Display(),"Terms and conditions checkbox is not visisble to accept it");
		shop.Terms_condtioons_button();
		Assert.assertTrue(shop.ProceedtoCheckout_04(),"After terms and conditons proceedcheckout is notvisible" );
		shop.Proceedtocheckout_Click_04();
		Assert.assertTrue(shop.PayCheck_Display(),"PayBycheck logo is not displayed");
		shop.PayCheck_Click();
		
		
	}
}
