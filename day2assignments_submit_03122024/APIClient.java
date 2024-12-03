package week3.day2assignments_03122024;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println(endpoint+ " ");

	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint+ " " + requestBody+ " " +requestStatus);

	}


	public static void main(String[] args) {
		APIClient object = new APIClient();
		object.sendRequest("Testing Endpoints");
		object.sendRequest("Testing Endpoint is good,","Testing Request Body,", false);
	}

}
