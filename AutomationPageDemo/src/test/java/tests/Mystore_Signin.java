package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.automationbase;

public class Mystore_Signin extends automationbase{

	@Test
	public void Mystore_signinclicl() {
		Assert.assertTrue(mso.MyStoreSignin(),"Mystore login is not displeyed");
		mso.Signin_button();
	}
}
