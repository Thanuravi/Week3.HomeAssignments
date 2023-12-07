package Week3HomeAssignment.Day2;

public abstract interface DatabaseConnection {
	
	public  void connect();
	
	public  void disconnect();
	
	public  void executeUpdate();

}
