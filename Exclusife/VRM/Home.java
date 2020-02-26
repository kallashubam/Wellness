package VRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) throws InterruptedException  
	
	
	
	{
		Browserswitch Bs= new Browserswitch();
		Bs.Login();
	//	Bs.OTP();

	//	Bs.click_Register();
		Bs.Register_Customer();
    }
}



