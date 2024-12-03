package week3.day2assignments_03122024;

public class BasePage {
	public void findElement() {
		System.out.println("Finding an Element");

	}
	public void clickElement() {
		System.out.println("Clicking an Element");

	}
	public void enterText() {
		System.out.println("Enter an Text");

	}
	public void performCommonTask() {
		System.out.println("Performing a common Task");

	}
	

	public static void main(String[] args) {
		BasePage object = new BasePage();
		object.clickElement();
		object.enterText();
		object.findElement();
		object.performCommonTask();

	}

}
