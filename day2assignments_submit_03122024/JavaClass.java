package week3.day2assignments_03122024;

public class JavaClass {
	public void reportStep(String msg, String status) {
		System.out.println(msg+ " " + status);
		

	}
public void reportStep(String msg, String status, boolean snap) {
	System.out.println(msg+ " " + status+ " " +snap);

	}

	public static void main(String[] args) {
		JavaClass object = new JavaClass();
		object.reportStep("Message1", "Status1");
		object.reportStep("Message2", "Status2", false);
		
	}

}
