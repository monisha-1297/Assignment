package week5.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SalesforceTC {

public ChromeDriver driver;
	
	@Parameters({"url","password","username"})

	 @BeforeMethod
	 public void presetup(String url,String passwd,String uName ) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.id("Login")).click();
	}
	 @Test(invocationCount = 1,priority = 2,dependsOnMethods = "archiCert")	
	public void adminCert() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		String parent = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
			
			List<String> windows=new ArrayList<String>(windowHandles);
			
		driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		Shadow dom = new Shadow(driver);
		WebElement learn= dom.findElementByXPath("//span[text()='Learning']");
		learn.click();
		Thread.sleep(3000);
		Shadow dom1 = new Shadow(driver);
		WebElement mouseover= dom1.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act=new Actions(driver);
		act.moveToElement(mouseover).perform();
		Thread.sleep(3000);
		 WebElement sales = dom.findElementByXPath("//a[contains(text(),'Salesforce Certification')]");
		 act.scrollToElement(sales).perform();
		 act.click(sales).perform();
		 Thread.sleep(3000);
		 dom.findElementByXPath("//a[contains(text(),'Administrator')]").click();
		 Thread.sleep(3000);
         System.out.println("page title is "+ driver.getTitle());
         Thread.sleep(3000);
	     
	      
         List<WebElement> admin = driver.findElements(By.xpath("//div[contains(@class,'credentials-card_title')]/a"));

         for (int i = 0; i < admin.size(); i++) {
        	 String text = admin.get(i).getText();
        	 System.out.println(text);
			}
	         Thread.sleep(3000);
	}
	 @Test(priority = 1)	
	public void archiCert() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		String parent = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
			
			List<String> windows=new ArrayList<String>(windowHandles);
			
		driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		Shadow dom = new Shadow(driver);
		WebElement learn= dom.findElementByXPath("//span[text()='Learning']");
		learn.click();
		Thread.sleep(3000);
		Shadow dom1 = new Shadow(driver);
		WebElement mouseover= dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions act=new Actions(driver);
		act.moveToElement(mouseover).perform();
		Thread.sleep(3000);
		 WebElement sales = dom.findElementByXPath("//a[contains(text(),'Salesforce Certification')]");
		 act.scrollToElement(sales).perform();
		 act.click(sales).perform();
		 Thread.sleep(3000);
		 
         driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]")).click();
         Thread.sleep(3000);
         System.out.println( driver.findElement(By.xpath("//div[contains(@class,'cert-whatIs_description')]")).getText());
         
         List<WebElement> architech = driver.findElements(By.xpath("//div[contains(@class,'credentials-card_title')]/a"));

         for (int i = 0; i < architech.size(); i++) {
        	 String text = architech.get(i).getText();
        	 System.out.println(text);
			
		}
		
		
	}

		@AfterMethod
        public void postSetup() {
        	driver.quit();
}
}
