package sPrint1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIndividualwomandatory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//download the chromedriver and set the path
		WebDriverManager.chromedriver().setup();
				
		//Handle notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
				
				
		//1. Login to https://login.salesforce.com
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("makaia@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("BootcampSel@123");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//	2. Click on the toggle menu button from the left corner
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		
		//	3. Click View All and click Individuals from App Launcher
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement Indiv=driver.findElement(By.xpath("//span[@class='slds-truncate label-display']"));
		driver.executeScript("arguments[0].click();", Indiv);
		
		//	4. Click on the Dropdown icon in the Individuals tab
		
		//if (driver.findElement(By.xpath("(//span[text()='Individuals'])[1]")).isDisplayed()); 
		{
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[text()='Individuals'])[1]/following::a[1]")).click();
			Thread.sleep(5000);
		}
		
		{
			
		}
		
		
		//	5. Click on New Individual
		 WebElement NewInd = driver.findElement(By.xpath("//span[contains(text(),'New Individual')]"));
		 driver.executeScript("arguments[0].scrollIntoView();", NewInd);
		 
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", NewInd);
		Thread.sleep(5000);
		
		
		//	7.Select Salutation as 'Mr'
		driver.findElement(By.xpath("(//a[@class='select'])[1]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@title='Mr.']")).click();
		Thread.sleep(3000);
		
		
		//	8.Enter the first name as 'Ganesh'.
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		Thread.sleep(3000);
		
		
		//	9. Click on Save
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(3000);
		
		
		//	10. Verify the Alert message (Complete this field) displayed for the Last Name 
		
		String am = driver.findElement(By.xpath("//ul[@class='errorsList'] /following::li[1]")).getText();
		System.out.println(am);
		Thread.sleep(3000);
		
		
		//	Expected Result:
		//	Complete this field message should be displayed for last Name field
		if (am.contentEquals("Complete this field."))
		{
			System.out.println("Error message is displayed as expected");
			
		}
		else
		{
			System.out.println("Error message is NOT displayed as expected");
			
		}
		
	}

}
