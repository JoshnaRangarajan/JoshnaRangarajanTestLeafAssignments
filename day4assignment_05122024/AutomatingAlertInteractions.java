package week3.day4assignment_05122024;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteractions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Loading the URL
				driver.get("http://leafground.com/alert.xhtml");
				
		      //Maximize the Browser
				driver.manage().window().maximize();
				// Add an implicit wait to ensure the webpage elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.findElement(By.xpath("(//span[(text()='Show')])[5]")).click();
				
				//Transfer focus to alert
				Alert promptAlert = driver.switchTo().alert();
				promptAlert.sendKeys("Joshna");
				promptAlert.dismiss();
				//
				String alertconfirmation = driver.findElement(By.xpath("//span[(text()='User cancelled the prompt.')]")).getText();
				System.out.println(alertconfirmation);
				

	}

}
