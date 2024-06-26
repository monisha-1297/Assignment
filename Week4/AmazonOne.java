package week.assignment4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOne {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		 driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();
		String onePlus = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		 System.out.println("rs: " +onePlus);
		 String ratings = driver.findElement(By.xpath("//span[text()='16']")).getText();
		 System.out.println("no of rating: " +ratings);
		 driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
		 String parent = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
			
			//convert set into list
			
			List<String> windows=new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(windows.get(1));
			
			Thread.sleep(3000);
		 
		 
		 
		
		 WebElement img = driver.findElement(By.id("landingImage"));
		 File scr = img.getScreenshotAs(OutputType.FILE);
		
			//step2 create path for snapshot added
			File trg=new File("./snaps/img1.png");
			
			//step 3
			FileUtils.copyFile(scr, trg);
			Thread.sleep(3000);
			
			driver.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(3000);
			
			String subT = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
			String[] split = subT.split("\\.");
			String expectedSubT = split[0];
			
			if(expectedSubT.contains(onePlus)) {
				System.out.println("Product price is same as Cart Subtotal");
			}
			else {
				System.out.println("Product price is not same as Cart Subtotal");
			}
			
			Thread.sleep(3000);
			
            driver.close();
			
			driver.switchTo().window(windows.get(0));
			
			driver.close();	
			
			
		 
		 
	}

}
