package Testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import Agentlogin.Login;
import Testbase.Basepage;
import Util.Excelutil;

public class Test extends Login {

	Login l = new Login() ;
	
	//Excelutil e = new Excelutil();
	
	public Test () {
		super();
	}
	
	@BeforeMethod
	public void setup () {
		
		intialization(); 
			}
	
	 @org.testng.annotations.Test
	public void dataentry () throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		
		l.moblie(Excelutil.Excel(0, 0));
		
		l.password(Excelutil.Excel(1, 0));
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void finish () {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
