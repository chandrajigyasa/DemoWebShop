package POMFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPom {
	WebDriver driver;
	
	By loginpath = By.xpath("//a[@class='ico-login']");
	By username=By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By login=By.xpath("//input[@class='button-1 login-button']");
	
	public LoginPom(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void loginclick() {
		driver.findElement(loginpath).click();
	}
	
	public void enterusername(String UN){
		driver.findElement(username).sendKeys(UN);
	}

	public void enterpassword(String PWD){
		driver.findElement(password).sendKeys(PWD);
	}
	
	public void clicklogin(){
		driver.findElement(login).click();;
	}
	
	

}
