package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AutomationObjects;
import pages.MyAccount_PageObject;
import pages.MystoreObjectsSignin;
import pages.RegisteredUserLoginObjects;

public class automationbase {
	public MystoreObjectsSignin mso;
	public AutomationObjects ao;
	public RegisteredUserLoginObjects validuser;
	public MyAccount_PageObject shop;
public static WebDriver drive;
	
	@BeforeMethod(alwaysRun=true)
	public  void browse() {
	
			WebDriverManager.chromedriver().setup();
			drive = new ChromeDriver();
		
		drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		drive.manage().window().maximize();
		drive.get("http://automationpractice.com");
		mso=new MystoreObjectsSignin(drive);
		validuser=new RegisteredUserLoginObjects(drive);
		shop=new MyAccount_PageObject(drive);
		ao=new AutomationObjects(drive);
		
		

	}
@AfterMethod
public void turndown() {
//drive.close();	
}

	
	

}
