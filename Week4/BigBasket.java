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
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		 Thread.sleep(3000);
		 WebElement mouseover = driver.findElement(By.xpath("(//a[@href='/cl/foodgrains-oil-masala/?nc=nb'])[2]"));
			
			Actions act=new Actions(driver);
			
			act.moveToElement(mouseover).perform();
			Thread.sleep(3000);
		WebElement mouseover1 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act.moveToElement(mouseover1).perform();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		 Thread.sleep(5000);
		 WebElement filter = driver.findElement(By.xpath("//label[text()='BB Royal']"));
		 act.scrollToElement(filter).perform();
		 act.click(filter).perform();
		 WebElement ponnirice = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"));
		 act.click(ponnirice).perform();
		 
		
		//getwindowhandle
			String parent = driver.getWindowHandle();
			System.out.println("parent window address "+parent );
			String parentTitle = driver.getTitle();
			System.out.println("parent tiltle "+parentTitle);
			
			//getwindowhandles
			
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			//convert set into list
			
			List<String> windows=new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(windows.get(1));
			String childTitle = driver.getTitle();
			System.out.println("child window title"+childTitle);
			Thread.sleep(3000);
         
			 WebElement kg = driver.findElement(By.xpath("//span[text()='5 kg']"));
			 act.moveToElement(kg).perform();
			 act.click(kg).perform();
	 
			 WebElement price = driver.findElement(By.xpath("//td[text()='Price: ']"));
			 act.moveToElement(price).perform();
			 System.out.println(price.getText());
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
			String textmsg= driver.findElement(By.xpath("//p[.='An item has been added to your basket successfully']")).getText();
			System.out.println(textmsg);
			
			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			
			File file = new File("./snaps/img.png");
			
			FileUtils.copyFile(screenshotAs, file);
			driver.close();
			
			driver.switchTo().window(windows.get(0));
			
			driver.close();	
				
	}
	
	

}
