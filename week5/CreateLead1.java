package week5.assignment;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class CreateLead1 extends LeaftapsTC{
   
	
	@DataProvider(name="getValue")
	public String[][] fetchData() throws IOException {
	//step 5
		//static keyword -without creating object will call the method
 //ClassName.methodName
		return parameterizationCL.readExcel();
	
	}
	@Test(dataProvider ="getValue")
	public  void runCreateLead(String Cname,String Firstname,String Lastname,String Phnum) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phnum);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		driver.close();


	}

}
