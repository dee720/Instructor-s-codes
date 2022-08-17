package com.automation.code;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceptions_While_Using_Id_ClassName_Name {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.canadalife.com/");
		driver.findElement (By.xpath("//*[@id=\"header-section\"]/div[1]/div[1]/div[2]/nav/div/div/div[2]/div/div/div/a")). click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		//driver.findElement(By.className("n-link-nav n-secondary-nav-bar__link is-hidden-sm-down")). click();
		driver.findElement(By.xpath("//div[@id = 'aem-card-6-content']/following-sibling::div[1]/child::a[1]")).click();
	}

}
