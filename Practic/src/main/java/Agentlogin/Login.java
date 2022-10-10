package Agentlogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testbase.Basepage;

public class Login extends Basepage {

@FindBy(id="username")
	
 private	WebElement username;
	
	
	@FindBy (id="password")
	
	WebElement password ;
	
	
	
	public Login () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
public void moblie (String nmbr) {
		username.sendKeys( nmbr);
	}
	
	
	public void password (String pswd) {
		password.sendKeys(pswd);
	}
	
	public void cap (){
	}
	
	
	
	
	
	
}
