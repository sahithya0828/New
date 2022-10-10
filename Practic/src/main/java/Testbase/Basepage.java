package Testbase;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Util.Timeouts;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Basepage {

	
	public   static    WebDriver driver ;
	
	    public static  Properties pr ;
	
 
	
	public Basepage () {
		
		try {
			
			pr = new Properties();
			
		FileInputStream file = new FileInputStream("C:\\Users\\304962\\eclipse-workspace\\Practic\\src\\main\\java\\Property\\config.property");	
		pr.load(file); }
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void intialization() {
		
		String browsername = pr.getProperty("browser");
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
		WebDriverManager. chromedriver().setup();
			
			
			 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\304962\\eclipse-workspace\\Practic\\Browsers\\chromedriver_win32\\chromedriver.exe");
	            driver = new ChromeDriver();
	            	
	            }
		else if(browsername.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\304962\\Downloads\\edgedriver_win64.exe");
			
			driver = new EdgeDriver();
			}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Timeouts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Timeouts.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(pr.getProperty("url"));
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
