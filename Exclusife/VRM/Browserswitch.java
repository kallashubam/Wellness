package VRM;



import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//import javax.xml.bind.JAXBElement.GlobalScope;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




 public class Browserswitch

{

	 static WebDriver driver;
	 WebElement Firstname;
	 public   void Login() 
	 {
		/*System.setProperty("webdriver.gecko.driver","D:\\Devesh automation\\geckodriver.exe");
	    driver = new FirefoxDriver();*/
		 
		 System.setProperty("webdriver.chrome.driver","D:\\Devesh automation\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
		 
		driver.get("https://aarush.wellnessforever.in/");
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"buser\"]")).sendKeys("8076444747");
	    driver.findElement(By.xpath("//input[@class='get-started-btna large']")).click();
	   }
	 
	 public  void OTP() throws InterruptedException
	 {    	
		 	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//*[@id=\"aTextbox1\"]")).sendKeys("138913"); //enter otp
	        driver.findElement(By.xpath("//*[@id=\"aTextbox\"]")).sendKeys("123456"); //enter passwrd
	        driver.findElement(By.xpath("//*[@id=\"subclick\"]")).click();
     } 
 public void click_Register() 
 
 {
	 driver.findElement(By.id("registerlink")).click();
	    	System.out.print("Enter Mobile Number");
	 		Scanner input = new Scanner(System.in);
	 		String Mobile_Number = input.next();
	 driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Mobile_Number);
	    driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[1]/section/div[2]/input")).click();
	   
}
	 public  void Register_Customer() throws InterruptedException
	 {
		 Firstname=driver.findElement(By.cssSelector("input#name"));
 		Firstname.clear();
		    
				Firstname.sendKeys("Devesh");// firstName
		    		
				 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Kumar");	
	        driver.findElement(By.id("customer_address")).clear(); 
	        driver.findElement(By.id("customer_address")).sendKeys("Noida Sec 63");										// Address
		     
 		    Select dropdown = new Select(driver.findElement(By.id("gender")));											// gender selection 
                 dropdown.selectByVisibleText("Male"); 																	// gender 
                 driver.findElement(By.id("popupDatepicker")).click();
                 driver.findElement(By.xpath("/html/body/div[16]/div/div[2]/div/table/tbody/tr[4]/td[3]/a")).click();
                 
                
             driver.findElement(By.xpath("//*[@id=\"comments_by_business\"]")).sendKeys("Comment");
           
             Select dropdown1 = new Select(driver.findElement(By.id("users_tagging")));									// user selection 
             dropdown1.selectByVisibleText("na na na na naaa reeee"); 													// user 
             driver.findElement(By.id("sale_amount")).sendKeys("1000");
             Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"uniform-undefined\"]/select")));  	//category
             dropdown2.selectByVisibleText("Yes");
             Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id=\"re_category\"]")));  //Request
             dropdown3.selectByVisibleText("Hot");
             
             driver.findElement(By.xpath("//*[@id=\"request_date\"]")).click();
             driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[3]/section/div/section/aside[2]/ul/li[6]/div[1]/div/div[2]/div[1]/table/tbody/tr[6]/td[5]")).click();
             driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[3]/section/div/section/aside[2]/ul/li[6]/div[1]/div/div[2]/div[2]/div[12]")).click();

             driver.findElement(By.xpath("//*[@id=\"request_text\"]")).click();
             driver.findElement(By.xpath("//*[@id=\"request_text\"]")).sendKeys("Reqst Txt");
             
             driver.findElement(By.xpath("//*[@id=\"register_customer\"]/div[2]/div[6]/div/input[3]")).click();
           
	 }

	 public void Simple_Cmpn() throws InterruptedException 
	 {
         driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/a/span")).click();
         driver.findElement(By.xpath("//*[@id=\"vmenu\"]/ul/li[2]/div/ul/li[2]/a")).click();
         driver.findElement(By.xpath("//*[@id=\"vhld\"]/section/aside[2]/div[1]/a")).click();
         driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/div[1]/div[1]/ul/li[1]/input")).sendKeys("NewCmpn");      		//Cmpn name
         driver.findElement(By.xpath(" //*[@id=\"chars_new\"]")).sendKeys("Text For Cmpn");										//Text For Cmpn
        
         driver.findElement(By.xpath("//*[@id=\"popupDatepicker\"]")).sendKeys("Text For Cmpn");								//date popup
         driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
         Select dropdown1 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[2]")));			//year
         dropdown1.selectByVisibleText("2022");
         Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[1]")));			//month
         dropdown2.selectByVisibleText("May");
         driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/table/tbody/tr[3]/td[4]/a")).click();					//date
         
         driver.findElement(By.xpath(" //*[@id=\"campaign-left\"]/ul/li/h5")).click();											//Advance option
         
         driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
         driver.findElement(By.name("coupon_flag")).click();
         Select dropdown3 = new Select(driver.findElement(By.name("discount_type")));
         dropdown3.selectByVisibleText("Rs.");																					//dscnt type
         
         driver.findElement(By.xpath(" //*[@id=\"campaign-left\"]/ul/li/span/div/div[2]/ul/li[2]/input")).sendKeys("10"); 		//dscnt %
         
         driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/ul/li/span/div/div[2]/ul/li[3]/input")).sendKeys("1000");		//max dscnt
      
         driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/ul/li/span/div/div[2]/ul/li[4]/input")).sendKeys("1000");		//On min Bill
         
         Select dropdown4 = new Select(driver.findElement(By.name("discount_applicable_type")));
         dropdown4.selectByVisibleText("Exclude Items");	
         driver.findElement(By.xpath("//*[@id=\"popupContact1\"]/div[2]/section/div/div[2]/div/div/ul/li[2]/strong/a")).click(); 
         
         driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
         driver.findElement(By.id("orderproduct_id_48_2774")).click();
        
         driver.findElement(By.id("apply_service")).click();
         
         driver.findElement(By.xpath("//*[@id=\"popupDatepicker1\"]")).click(); 
         
         Thread.sleep(500);
         driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
         Select dropdown5 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[2]")));		//year
         dropdown5.selectByVisibleText("2022");
         Select dropdown6 = new Select(driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div/select[1]")));			//month
         dropdown6.selectByVisibleText("May");
         driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/table/tbody/tr[3]/td[6]/a")).click();		
       
         Thread.sleep(1000);
         Select dropdown7 =new Select(driver.findElement(By.name("hour")));   
         dropdown7.selectByVisibleText("12");
         
         driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
         Select dropdown8 =new Select(driver.findElement(By.name("minut")));   
         dropdown8.selectByVisibleText("30");
         
         driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
         Select dropdown9 =new Select(driver.findElement(By.name("gender")));   
         dropdown9.selectByVisibleText("Male");
         
         driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
         Select dropdown10 =new Select(driver.findElement(By.name("customer_source")));   
         dropdown10.selectByVisibleText("Upload");
         
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,200)");
         Thread.sleep(1000);
         
        
         
         
         js.executeScript("window.scrollBy(0,400)");
         Thread.sleep(1000);
       
         
        // driver.findElement(By.name("visit_type")).click();
         Select dropdown11 = new Select(driver.findElement(By.name("visit_type")));
         dropdown11.selectByIndex(1);
         Thread.sleep(1000);
                
        
                  
         driver.findElement(By.xpath("//*[@id=\"campaign-left\"]/ul/li/span/div/div[5]/ul/li[1]/div[2]/input\r\n")).sendKeys("2");
         
         driver.findElement(By.name("business_users[]")).click();
         Thread.sleep(1200);
        driver.findElements(By.name("business_users[]")).get(1).click();
        driver.findElements(By.name("business_users[]")).get(2).click();
     
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        driver.findElements(By.name("campaign_target_code")).get(2).click();
        
        //driver.findElement(By.xpath("//*[@id=\"campaign_product_ids\"]")).click();
        //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
       // Select dropdown14 =new Select(driver.findElement(By.xpath("//*[@id=\"campaign_product_ids\"]")));   
       // dropdown14.selectByVisibleText("Exclude Items");
        
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id=\"popupContact2\"]/div[2]/section/div/div[2]")).click();
       // driver.findElement(By.id("ordercategory_id_117")).click();
        
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(1000);
        Select dropdown15 = new Select(driver.findElement(By.id("uniform-undefined")));
        dropdown15.selectByVisibleText("Yes");
        
        
        
      
        
       
	 }
	 
	
		 
		 
		 
		 
	 }
	
 	
	 
 
