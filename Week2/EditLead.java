package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		 ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			driver.findElement(By.xpath("//div[@id='button']")).click();
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Bhuvin");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bhu");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("vin");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Maran");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Medicine");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("DoctorLead");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
			
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	        Select sta = new Select(state);
	        sta.selectByVisibleText("New York");
	        
	        driver.findElement(By.name("submitButton")).click();
	        driver.findElement(By.linkText("Edit")).click();
	        driver.findElement(By.id("updateLeadForm_description")).clear();
	        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("nbshgdhz");
	        driver.findElement(By.name("submitButton")).click();
	        String title = driver.getTitle();
	        System.out.println("Title is "+ title);
	        driver.close();
	        
			
			
			
			
			
	}

}
