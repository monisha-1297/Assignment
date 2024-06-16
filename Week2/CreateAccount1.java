package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.id("button")).click();
			driver.findElement(By.linkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Aascii");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.xpath("//input[contains(@id,'numberEmployees')]")).sendKeys("2");
			driver.findElement(By.xpath("//input[contains(@id,'officeSiteName')]")).sendKeys("LeafTaps");
			driver.findElement(By.xpath("//input[@value='Create Account']")).click();
			System.out.println("Title: "+ driver.getTitle());
			
			driver.close();
			
			
			
			
			
	}

}
