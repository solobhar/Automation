package sPrint1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIndividual {

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
		driver.findElement(By.xpath("//input[@placeholder ='Search apps or items...']")).sendKeys("Individuals");
		driver.findElement(By.xpath("//input[@placeholder ='Search apps or items...']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@placeholder ='Search apps or items...']")).sendKeys("Individuals");
		//driver.findElement(By.xpath("//input[@placeholder ='Search apps or items...']")).click();
		driver.findElement(By.xpath("//input[@name='Individual-search-input']")).sendKeys("Kumar");
		//driver.findElement(By.xpath("//input[@name='Individual-search-input']")).submit();
		/*
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
		//	4. Click on the Individuals tab (//span[@class='title slds-truncate'])[3]
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Individuals']")).click();
		driver.findElement(By.xpath("(//span[@class='title slds-truncate'])[3]")).click();
		//	5. Search the Individuals 'Kumar' //a[@title='Kumar'][1]
		driver.findElement(By.xpath("Individual-search-input")).sendKeys("Kumar");
		driver.findElement(By.xpath("Individual-search-input")).submit();
		*/
		//	6. Click on the Dropdown icon and Select Delete 
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[@class='forceVirtualActionMarker forceVirtualAction'])[1]")).click();
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		Thread.sleep(3000);
		
		//	7.Click on the Delete option in the displayed popup window. 
		WebElement del = driver.findElement(By.xpath("//button[@title='Delete']"));
		driver.executeScript("arguments[0].click();", del);
		Thread.sleep(3000);
		
		
		
		//	8. Verify Whether Individual is Deleted using Individual last name 
		String toastmsg1 = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		//driver.findElement(By.xpath("//button[@title='Delete']")).isDisplayed();
		Thread.sleep(3000);
		System.out.println(toastmsg1);
		Thread.sleep(3000);
		if (toastmsg1.contains("deleted"))
		{
			System.out.println("Individual is deleted Successfully");
			
		}
		else
		{
			System.out.println("Individual is NOT deleted");
			
		}
		}
		//	Expected result:
		//	The Individual is deleted Successfully 
	}


