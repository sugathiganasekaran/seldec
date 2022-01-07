package week2.day1;



	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DeleteLead {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			
	       String title = driver.getTitle();
	       System.out.println(title);
	        WebElement username = driver.findElement(By.id("username"));
	        username.sendKeys("DemoSalesManager");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	       
	       
	        driver.findElement(By.xpath("//span[text()='Phone']")).click();
	   
	   driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	   
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       WebElement app = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	    app.click();
	  System.out.println("The title is:" +driver.getTitle());
	    
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	
	
	
	
	
}}
