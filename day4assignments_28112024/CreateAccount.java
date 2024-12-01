package week2.day4assignments_28112024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
				
				//Click on the "Create Account" button.
				driver.findElement(By.linkText("Create Account")).click();
				
				//Enter an account name.
				driver.findElement(By.id("accountName")).sendKeys("JoshnaAccount");
				
				//Enter a description as "Selenium Automation Tester."
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				
				//Select "ComputerSoftware" as the industry.
				WebElement IndustryDropdown = driver.findElement(By.name("industryEnumId"));
				Select Industry=new Select(IndustryDropdown);
				Industry.selectByValue("IND_SOFTWARE");
				
				
				//Select "S-Corporation" as ownership using SelectByVisibleText.
				WebElement OwnershipDropdown = driver.findElement(By.name("ownershipEnumId"));
				Select Ownership =new Select(OwnershipDropdown);
				Ownership.selectByVisibleText("S-Corporation");
				
				//Select "Employee" as the source using SelectByValue.
				
				WebElement SourceDropdown = driver.findElement(By.id("dataSourceId"));
				Select Source =new Select(SourceDropdown);
				Source.selectByValue("LEAD_EMPLOYEE");
				
				
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement MarketingCampaignDropdown = driver.findElement(By.id("marketingCampaignId"));
				Select MarketingCampaign =new Select(MarketingCampaignDropdown);
				MarketingCampaign.selectByIndex(6);
				
			
				//Select "Texas" as the state/province using SelectByValue.
				WebElement StateProvinceDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select StateProvince =new Select(StateProvinceDropdown);
				StateProvince.selectByValue("TX");
				
				//Click the "Create Account" button.
				
				driver.findElement(By.className("smallSubmit")).click();
				
				//Verify that the account name is displayed correctly.
				
				// Close the browser window.
				driver.close();
				

				
				
	}

}
