package week3.assignment;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("the endpoint is:" + endpoint);

	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println(endpoint+"\n"+requestBody+"\n"+requestStatus);
	}
	
	public static void main(String[] args) {
		
		APIClient sc=new APIClient();
		sc.sendRequest("https://www.facebook.com");
		sc.sendRequest("amazon","success", true);
	}

}
