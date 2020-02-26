package VRM;

public class Simple {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		Browserswitch Camp = new Browserswitch();
        Camp.Login();
        Thread.sleep(2000);
        Camp.OTP();
        Camp.Simple_Cmpn();
	}

}
