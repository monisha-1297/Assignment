package assignment.week2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ChechBox {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
        
		
		 ChromeDriver driver = new ChromeDriver();
			
		 driver.get("https://leafground.com/checkbox.xhtml");
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//span[text()='Basic']")).click();
		 driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		 String text=driver.findElement(By.xpath("//span[text()='Checked']")).getText(); 
		 if (text.equals("Checked")) {
				System.out.println("expected message is displayed. ");
			} else {
				System.out.println("expected message is not displayed. ");
			}
		 driver.findElement(By.xpath("//label[.='Python']")).click();
		 driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		 String stateVal=driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p")).getText();
		 System.out.println("Chosen Tri-State option is:" +stateVal);
		 driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch ui-widget')]//div)[2]")).click();
		 String toggle=driver.findElement(By.xpath("//span[text()='Checked']")).getText(); 
		 System.out.println("expected msg is:" + toggle);
		 boolean status = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isEnabled();
		 System.out.println(status);
		 if(status) {
	    	 System.out.println("Enabled");
	     }
	     else {
	    	 System.out.println("Disabled");
	     }
	     driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
	     List<WebElement> d = driver.findElements(By.xpath("//ul[@data-label='Cities']"));
	     for (WebElement c :d) {
	    	 if (c.getText().contains("London")) {
	    		 c.click();
	    	 }
	    	 if (c.getText().contains("Paris")) {
	    		 c.click();
	    	 }
	     
	    }
	     Thread.sleep(3000);
	     driver.close();
	     
	}
}
		 
	
		 
	         
	         
	         
	


