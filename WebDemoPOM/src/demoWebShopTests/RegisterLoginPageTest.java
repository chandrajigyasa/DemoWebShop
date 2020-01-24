package demoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMFile.LoginPom;
import POMFile.RegistrationPom;

public class RegisterLoginPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void startapp() {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Register() {

		RegistrationPom register = new RegistrationPom(driver);
		
		register.pressregister();
		
		register.enterfirstname("aisha");
		register.enterlastname("oberoi");
	
		register.enteremail("aishaoberoi@gmail.com");
		register.enterpassword("123456");
		register.enterconfirmpassword("123456");

		register.clickregister();
		String title=driver.getTitle();
		String expectedtitle="Your registration completed";
		Assert.assertEquals(expectedtitle,title);
		
		
   	     }
	
	@Test
	public void checklogin() {
		LoginPom login = new LoginPom(driver);
		
		login.loginclick();
		
		login.enterusername("aishaoberoi@gmail.com");
		login.enterpassword("123456");
		login.clicklogin();
		String title=driver.getTitle(aishaoberoi@gmail.com);
		String expectedtitle="";
		Assert.assertEquals(expectedtitle, title);
		System.out.println(title);
	   
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
	
	
}
