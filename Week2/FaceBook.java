package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
			
		 driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
	         driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhuvin");
	         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Maran");
	         driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]")).sendKeys("9923456743");
	         driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("@123");
	         
	         WebElement dateofbirth = driver.findElement(By.name("birthday_day"));
	         Select dob = new Select(dateofbirth);
	         dob.selectByVisibleText("2");
	         
	         WebElement dateofmonth = driver.findElement(By.name("birthday_month"));
	         Select month = new Select(dateofmonth);
	         month.selectByVisibleText("Feb");
	         
	         WebElement dateofyear = driver.findElement(By.name("birthday_year"));
	         Select year = new Select(dateofyear);
	         year.selectByVisibleText("1990");
	         
	         driver.findElement(By.xpath("//input[@value='1']")).click();
	         Thread.sleep(2000);
	         driver.close();
	}

}
