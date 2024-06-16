package assignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		
		WebElement acc = driver.findElement(By.className("shortcuts"));
		acc.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("infotech");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select ind = new Select(industry);
        ind.selectByValue("IND_SOFTWARE");
        
        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select own = new Select(ownership);
        own.selectByVisibleText("S-Corporation");
        
        WebElement source = driver.findElement(By.name("dataSourceId"));
        Select src = new Select(source);
        src.selectByValue("LEAD_EMPLOYEE");
        
        WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
        Select mar = new Select(marketing);
        mar.selectByIndex(6);
        
        WebElement stateprovince = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select state = new Select(stateprovince);
        state.selectByValue("TX");
        
        driver.findElement(By.className("smallSubmit")).click();
        
        
        String name = driver.findElement(By.id("accountName")).getText();
         if (name == "infotech")
         {
        	 System.out.println("Account Name is displayed correctly");
         }
         else
         {
        	 System.out.println("Account Name is not displayed correctly");
         }
        
         driver.close();
        
        
		
	}

}
