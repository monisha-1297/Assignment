package week3.assignment;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.executeQuery();
		jc.executeUpdate();
		jc.disconnect();
		
	}

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate");
	}

}
