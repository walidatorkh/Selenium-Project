package com.nice.pages;

import org.openqa.selenium.WebDriver;

public class SevenBonusPolicy {

	private WebDriver driver;
	
	public SevenBonusPolicy(WebDriver driver) {
		this.driver = driver;
		if(!driver.getTitle().contains("Policy")){
			System.out.println("Wrong Page");
		}
	}
	
	public void dummy(){
		
	}
}
