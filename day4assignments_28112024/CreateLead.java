package week2.day4assignments_28112024;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
		      //Maximize the Browser
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
				//Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click the login button
				driver.findElement(By.className("decorativeSubmit")).click();
			
			    //Click the CRMSFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the "Leads" tab.
				driver.findElement(By.linkText("Leads")).click();
				
				//Click on the "Create Lead" button.
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter a FirstName.
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joshna");
				
				//Enter a LastName.
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rangarajan");
				
				// Enter a CompanyName.
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				//driver.findElement(By.name("companyName")).sendKeys("TestLeaf");
				
				
				//Enter a Title .
				driver.findElement(By.name("generalProfTitle")).sendKeys("TestLeafAssignment");
				
				//Click the "Create Lead" button.
				//driver.findElement(By.className("smallSubmit")).click();
				driver.findElement(By.name("submitButton")).click();
				
				// Verify that the Title is displayed correctly.
				//Close the browser window.
				driver.close();
				
	}

}
