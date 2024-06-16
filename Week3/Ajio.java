package week3.assignment;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.ajio.com");
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//label[text()='Fashion Bags (1,144)']")).click();
		 Thread.sleep(3000);
		 WebElement itemCountElement = driver.findElement(By.xpath("//div[@class='length']//strong"));
         String itemCountText = itemCountElement.getText();
         System.out.println("Count of items found: " + itemCountText);
         
         List<WebElement> brandElements = driver.findElements(By.cssSelector(".brand"));
         System.out.println("\nList of brands:");
         for (WebElement brandElement : brandElements) {
             System.out.println(brandElement.getText());
         }
         
         List<WebElement> nameElements = driver.findElements(By.className("nameCls"));
         
         System.out.println("Bag Names:");
         
         for (WebElement nameElement : nameElements) {
             System.out.println(nameElement.getText());
         }
         

	}

}
