package crome.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class cromeTest {
	//System.setProperty
	private static WebDriver driver;

	
	@BeforeClass
	public static void blabla() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\igorh\\Downloads\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.yahoo.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	}
	
	@AfterClass
	public static void blablya() {
		driver.quit();
	}

	private WebElement searchField;
	

	@Test
	public void testBlabla() {
	try {
		WebElement searchField;
		searchField = driver.findElement(By.id("uh-search-box"));
		searchField.clear();
		searchField.sendKeys("JOPA");
		
		String name =searchField.getAttribute("name");
		System.out.println("Name is " + name);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	}
	
	@Test
	public void testBlabla1() {
	try {
		driver.findElement(By.className("buttonLargeAlt")).click();	
		String name = searchField.getAttribute("name");
		System.out.println("Name is " + name);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
