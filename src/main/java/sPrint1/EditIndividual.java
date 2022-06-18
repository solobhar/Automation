package sPrint1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditIndividual {

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
				
		//	4. Click on the Individuals tab 
				
				Thread.sleep(3000);
				//a[@class='slds-context-bar__label-action dndItem']
				//driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[1]/one-appnav[1]/div[1]/one-app-nav-bar[1]/nav[1]/div[1]/one-app-nav-bar-item-root[31]/a[1]/span[1]")).click();
				driver.findElement(By.xpath("//a[@class='slds-context-bar__label-action dndItem']")).click();
				Thread.sleep(5000);
				
				
		//	5. Search the Individuals 'Kumar'
				//driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[1]/one-appnav[1]/div[1]/one-app-nav-bar[1]/nav[1]/div[1]/one-app-nav-bar-item-root[31]/one-app-nav-bar-item-dropdown[1]/div[1]/one-app-nav-bar-menu-button[1]/div[1]/div[1]/slot[1]/one-app-nav-bar-menu-item[2]/a[1]/span[1]/span[1]")).click();
				//String ele1 = driver.findElement(By.xpath("//a[@title='Kumar']")).getText();
				/* driver.executeScript("arguments[0].scrollIntoView();", ele1);
				 
				Thread.sleep(3000);
				driver.executeScript("arguments[0].click();", ele1);
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[1]/one-appnav[1]/div[1]/one-app-nav-bar[1]/nav[1]/div[1]/one-app-nav-bar-item-root[31]/one-app-nav-bar-item-dropdown[1]/div[1]/one-app-nav-bar-menu-button[1]/div[1]/div[1]/slot[1]/one-app-nav-bar-menu-item[2]/a[1]/span[1]/span[1]")).click();
				Thread.sleep(5000);*/
				
		//	6. Click on the Dropdown icon and Select Edit
				driver.findElement(By.xpath("//body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/a[1]/lightning-icon[1]/lightning-primitive-icon[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@title='Edit'][1]")).click();
				Thread.sleep(5000);
				

				
				
				
		//	7.Select Salutation as 'Mr'
		//	8.Enter the first name as 'Ganesh'.
		//	9. Click on Save and Verify the first name as 'Ganesh'
		//	Expected Result:
		//	The Individuals is Edited Successfully
		
		
	}

}
