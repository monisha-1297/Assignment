package week3.assignment;

public class LoginTestData extends TestData {
	  String username="moni";
	  String password="123";
	public void enterUsername() {
		System.out.println("Username:"+ username );
	}
	public void enterPassword() {
		System.out.println("password:"+ password );
	}
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login=new LoginTestData();
		login.enterUsername();
		login.enterPassword();
		login.enterCredentials();
		login.navigateToHomePage();
		int c = 0;
		System.out.println(c);
		
	}

}
