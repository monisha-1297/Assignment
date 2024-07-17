package week5.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitechCerti {
      
	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
			driver.findElement(By.id("password")).sendKeys("testleaf@2024");
			driver.findElement(By.id("Login")).click();

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
			
			 driver.close();
			 driver.switchTo().window(windows.get(0));
			 driver.quit();

				}
			
		
			 
			 
			 
			 
			 
			 
			 
	}


