package automationselium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class registration {
	public static void main(String[] args) throws Exception{
	 	//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

	    	//Launch  Website
	        driver.navigate().to("http://www.google.com/");
//driver.manage().window().maximize();
		//Click on the search text box and send value
		WebElement element = driver.findElement(By.name("q"));
	   	element.sendKeys("Amazon");
	   	driver.navigate().to("https://www.amazon.in/");
	   	WebElement element1 =  driver.findElement(By.id("nav-signin-tooltip"));
	   	element1.click();
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]"));
		element2.click();
		WebElement element3 = driver.findElement(By.id("ap_customer_name"));
		element3.sendKeys("alien");
		WebElement element4 = driver.findElement(By.id("ap_phone_number"));
		element4.sendKeys("7742466433");				
		WebElement element5 = driver.findElement(By.name("secondaryLoginClaim"));
		element5.sendKeys("hello_there@gmail.com");
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		element6.sendKeys("hello_nonu");		
		WebElement element7 = driver.findElement(By.id("continue"));
		element7.click();
	}
}
