package demoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMFile.LoginPom;

public class LoginPageTest {

	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
	driver.manage().window().maximize();
	
	LoginPom login = new LoginPom(driver);
	login.enterusername("aishaoberoi@gmail.com");
	login.enterpassword("123456");
	login.clicklogin();
	}
	
}
