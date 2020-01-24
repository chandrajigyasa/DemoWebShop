package demoWebShopTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMFile.RegistrationPom;

public class RegisterPageTest {
	@Test
	public void Register()
	{

		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/register");
	
    driver.manage().window().maximize();

    RegistrationPom register = new RegistrationPom(driver);
    register.enterfirstname("aishaa");
	register.enterlastname("oberoii");
	
    register.enteremail("aishaoberoiii@gmail.com");
    register.enterpassword("1234567");
    register.enterconfirmpassword("1234567");

    register.clickregister();

	}


}
