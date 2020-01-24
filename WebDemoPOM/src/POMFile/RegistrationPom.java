package POMFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class RegistrationPom {
       WebDriver driver;

       By registerpath = By.xpath("//a[@class='ico-register']");
 
       By firstname=By.xpath("//input[@id='FirstName']");
       By lastname=By.xpath("//input[@id='LastName']");

       By email=By.xpath("//input[@id='Email']");
       By password=By.xpath("//input[@id='Password']");
       By confirmpassword=By.xpath("//input[@id='ConfirmPassword']");

       By register=By.xpath("//input[@id='register-button']");
	
	public RegistrationPom(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void pressregister() {
		driver.findElement(registerpath).click();
	}
	
	
	public void enterfirstname(String FN){
		driver.findElement(firstname).sendKeys(FN);
	}

	public void enterlastname(String LN){
		driver.findElement(lastname).sendKeys(LN);
	}
	
	public void enteremail(String EM){
		driver.findElement(email).sendKeys(EM);
	}
	
	public void enterpassword(String PW){
		driver.findElement(password).sendKeys(PW);
	}
	
		public void enterconfirmpassword(String CPW){
			driver.findElement(confirmpassword).sendKeys(CPW);
		}
	
	public void clickregister(){
		driver.findElement(register).click();;

		
	}
	

}
