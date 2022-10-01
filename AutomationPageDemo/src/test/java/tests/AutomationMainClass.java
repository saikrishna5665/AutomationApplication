package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.automationbase;
import pages.AutomationObjects;

@Test()
public class AutomationMainClass extends automationbase {
	
	public void VerifyMailAddress() {
	
		AutomationObjects  ao=new AutomationObjects(drive);
		Assert.assertTrue(ao.VerifySigninDispaly(),"sign button is not visible");
		ao.SigninButton();
		Assert.assertTrue(ao.verifyEmailDisplay(),"email is not visisble");
		ao.InputMail("Saikrishnareddy1@gmail.com");
		Assert.assertTrue(ao.VerifyCreateAccountDisplay(),"Create account is not displaying");
		ao.ClickCreateAccount();
		Assert.assertTrue(ao.PersonalInformation(),"personal information is not displayed");
		ao.verifygenderSelection();
		Assert.assertTrue(ao.FirstNameDispaly(),"Firstname is not diaplaying");
		ao.InputFirstName("sai");
		Assert.assertTrue(ao.LastnameDisplay(),"lastname is not displaying");
		ao.InputLastName("reddy");
		ao.Inputpass1("sai5665");
		Assert.assertTrue(ao.verifyDateofBirth());
		ao.DateofBirthSelection("15","8","1995");
		Assert.assertTrue(ao.Companydisplay(),"Comapny textbox is not displayed");
		ao.InputCompany("SAI");
		Assert.assertTrue(ao.AddressDisplay(),"Adress input box is not displayed");
		ao.InputAddress("Telangana,hyderabd");
		Assert.assertTrue(ao.Address2Dispaly(),"Address2 textbocx is dislayed");
		ao.InputAddress2("Siddipet,Srinivas nagar");
		Assert.assertTrue(ao.CityNameDisplay(),"Ciyt name is not displayed");
		ao.InputCity("Hyderabad");
		Assert.assertTrue(ao.statedisplay(),"state dropdown is not displayed");
		ao.InputState("Florida");
		Assert.assertTrue(ao.postcosediaplay(),"postcodemis not displayed");
		ao.Inputpostcode("50012");
		Assert.assertTrue(ao.CountryDisplay(),"Country is not displayed");
		ao.InputCountry("United States");
		Assert.assertTrue(ao.phonedisplay(),"phone number box is displayed");
		ao.InputPhone("9876543211");
		Assert.assertTrue(ao.RefrenceAddressDisplay(),"refrence address is not displayed");
		ao.InputRefrenceAdress("siddipet");
		Assert.assertTrue(ao.RegisterButtonDisplay(),"RegisteButton is not displayed");
		ao.RegisterClick();
		Assert.assertTrue(ao.AccountNameDisplay(),"Account Name is not displayed");
		ao.AccountNameText();
		Assert.assertTrue(ao.SignoutDisplay(),"Signout is not displayed");
		ao.Signoutclick();
	}
	//@Test(priority=2)
/*public void VerifyInvalidMail() {
	AutomationObjects  ao=new AutomationObjects(drive);
	Assert.assertTrue(ao.VerifySigninDispaly(),"sign button is not visible");
	ao.SigninButton();
	Assert.assertTrue(ao.verifyEmailDisplay(),"email is not visisble");
	ao.InputMail("xyzsad");
	Assert.assertTrue(ao.VerifyCreateAccountDisplay(),"Create account is not displaying");
	ao.ClickCreateAccount();
	Assert.assertTrue(ao.InvalidMailError());
	Assert.assertTrue(ao.PersonalInformation(),"personal information is not displayed");
	
	
	
}*/
}
