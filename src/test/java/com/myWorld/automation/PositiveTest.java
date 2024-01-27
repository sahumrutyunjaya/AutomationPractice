package com.myWorld.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * 
 * @author Mrutyunjay
 *
 */

public class PositiveTest {
	
	@Test
	public void verifyWelcomePage() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.quit();
	}
	
}
