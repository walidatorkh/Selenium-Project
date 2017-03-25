package com.nice.pages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowser {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\igorh\\Google Drive\\QA_automation\\Selenium\\Resources\\Exe\\IEDriverServer.exe");
//		//WebDriver driver = new InternetExplorerDriver();
//		driver = new IEDriverServer();
//
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\igorh\\Google Drive\\QA_automation\\Selenium\\Resources\\Exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("1");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("2");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public boolean Niptah() {
		System.out.println("3");
		System.out.println("Opened !");
		return false;
	}
//	public void test() {
//		
//	}

}
