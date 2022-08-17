package com.automation.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Browsers {

	public static WebDriver driver;

	public static void main(String[] args) {

		String Browser = "Chrome";

		if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.manage().window().maximize();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.ca");
		} else if (Browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.skyscanner.com");
		} else if (Browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.flipkart.com");

		} else {
			System.out.println("My browser does not exist");
		}

	}

}
