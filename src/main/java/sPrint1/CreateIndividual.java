package sPrint1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIndividual {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generatd method stub

		
		
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
		
		
		
		
		//2. Click on the toggle menu button from the left corner
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		//3. Click View All and click Individuals from App Launcher
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='Search apps or items...']")).sendKeys("Individuals");
		driver.findElement(By.xpath("//input[@placeholder ='Search apps or items...']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		WebElement Indiv=driver.findElement(By.xpath("//span[@class='slds-truncate label-display']"));
		driver.executeScript("arguments[0].click();", Indiv);
		//4. Click on the Dropdown icon in the Individuals tab
		Thread.sleep(5000);
		
		//WebElement Indivm=driver.findElement(By.xpath("(//span[text()='Individuals'])[1]"));
		//driver.executeScript("arguments[0].click();", Indivm);
		//driver.findElement(By.xpath("(//span[tex(//span[text()='Individuals'])[1]t()='Individuals'])[1]/following::a[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Individuals'])[1]/following::a[1]")).click();
		//WebElement ele = driver.findElement(By.xpath("//label[text()='Individuals Menu']/following::lightning-primitive-icon[1]"));
		//WebElement ele = driver.findElement(y.xpath("//label[text()='Individuals Menu']/following::lightning-primitive-icon[1]"));
		//WebElement ele = driver.findElement(By.xpath("//span[@button='Individuals Menu']/following::lightning-primitive-icon[20]"));
		//driver.executeScript("arguments[0].click();", ele);
		//setTimeout(function(){debugger;},5000);
		
		Thread.sleep(5000);
		//5. Click on New Individual //span[contains(text(),'New Individual')]
		 
		 WebElement ele1 = driver.findElement(By.xpath("//span[contains(text(),'New Individual')]"));
		 driver.executeScript("arguments[0].scrollIntoView();", ele1);
		 
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", ele1);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[contains(text(),'New Individual')]")).click();
		//6. Enter the Last Name as 'Kumar' //input[@id='133:1667;a']
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");	
		Thread.sleep(3000);
		//7.Click save and verify Individuals Name //button[@title='Save']
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		Thread.sleep(3000);
		//Expected result: The Individuals is created Successfully
		String toastmsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		//WebElement ele2 = driver.findElement(By.xpath("//span[contains(text(),'Kumar')][1]"));	
		//driver.executeScript("arguments[0].gettext();", ele2);
		System.out.println(toastmsg);
		Thread.sleep(3000);
		if (toastmsg.contains("Kumar"))
		{
			System.out.println("Individual is created Successfully");
			
		}
		else
		{
			System.out.println("Individual is NOT created Successfully");
			
		}
		}
	}


