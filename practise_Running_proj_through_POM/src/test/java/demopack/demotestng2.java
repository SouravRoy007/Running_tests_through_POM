package demopack;


import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demotestng2 {
	
	WebDriver d;
	


  @Test(priority=1)
	 
		
	void setup() throws IOException {
	  
//	  	lg.debug("application started");
		
		System.setProperty("driver.chrome.driver","C:\\Users\\User\\Desktop\\Selenium\\chromedriver.exe");
		
		d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		

	
	  
  }
}
