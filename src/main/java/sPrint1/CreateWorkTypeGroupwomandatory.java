package sPrint1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateWorkTypeGroupwomandatory {

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
		
		
		
		//	3. Click View All and click Work Type Groups from App Launcher 
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='View All']")).click();
				Thread.sleep(6000); 
				WebElement Wtg = driver.findElement(By.xpath("(//p[@class='slds-truncate'])[113]"));
				driver.executeScript("arguments[0].click();", Wtg);
				Thread.sleep(3000);
		
		//	4. Click on the Dropdown icon in the Work Type Groups tab 
				
				driver.findElement(By.xpath("(//span[text()='Work Type Groups'])[1]/following::a[1]")).click();
				Thread.sleep(3000);
		//	5. Click on New Work Type Group 
				driver.findElement(By.xpath("//span[text()='New Work Type Group']")).click();
				Thread.sleep(3000);
		
		//	7.Enter Description as 'Automation'. 
				driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).sendKeys("Automation");
				Thread.sleep(3000);
		
		//	8.Select Group Type as 'Capacity' 
				driver.findElement(By.xpath("//span[text()='Group Type']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@title='Capacity']")).click();
				Thread.sleep(3000);
				
		//	9. Click on Save 
				driver.findElement(By.xpath("(//span[text()='Save'])[1]")).click();
				Thread.sleep(3000);
		
		
		//	10. Verify the Alert message (Complete this field) displayed for Work Type Group Name
				driver.switchTo().window("New Work Type Group");
				Thread.sleep(3000);
				String WTFm = driver.findElement(By.xpath("(//span[text()='Work Type Group Name']/following::li[2]")).getText();
				if (WTFm=="Complete this field.")
				{
				System.out.println("The message is displayed for Work Type Group Name field");
				
				
					
				}
				else
					System.out.println("The message is displayed for Work Type Group Name field");
				
		//	Expected Result:
		//	Complete this field message should be displayed for Work Type Group Name field
		
		
	}

}
