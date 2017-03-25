package table;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class getTableCellText {

	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\igorh\\Downloads\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	 
	@AfterClass
	public static void tearDownClass() {
		driver.quit();
	}
	
	@Test
	public void testblabla() {
		System.out.println(VerifyForTable(0, "Ernst Handel", 2, "Austria"));
	}
	
	
	
	public boolean VerifyForTable(int iSearchCol, String sSearchText, int iVerifyCol, String sVerifyText) {
			WebElement table = driver.findElement(By.id("myTable"));
			List<WebElement> allRows = table.findElements(By.tagName("td"));
			int rowsNum = allRows.size();
			System.out.println("++++++++++++");
			for (int i = 0; i < rowsNum; i++) {
				List<WebElement> allCells = table.findElements(By.tagName("td"));
				int cellsNum = allCells.size();
				for (int j = 0; j < cellsNum; j++) {
				System.out.println(allCells.get(j).getText());
		
				}
			}
			return true;
	}
	}
