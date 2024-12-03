package week3.day2assignments_03122024;

public class LoginPage extends BasePage{
	public void performCommonTask() {
		super.performCommonTask();
		System.out.println("Common Task");

	}
	
	public static void main(String[] args) {
		LoginPage object1 = new LoginPage();
		object1.performCommonTask();
		object1.enterText();
		object1.clickElement();
		object1.findElement();

	}

}
