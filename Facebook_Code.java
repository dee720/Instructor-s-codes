package com.automation.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Code {

	public static WebDriver driver;
	public static Select select;
	public static WebDriverWait wait;

	@Test
	public void checkDOB() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();


		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
        driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		
    	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("reg_email__")));
		driver.findElement(By.name("reg_email__")).sendKeys("seleniumpanda@rediffmail.com");
		
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("reg_email_confirmation__")));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("seleniumpanda@rediffmail.com");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password_step_input")));
	    driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");
		

	    Thread.sleep(1000);
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");

		Thread.sleep(1000);
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");

		Thread.sleep(1000);
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("2002");

		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), 'Female')]")));
        driver.findElement(By.xpath("//label[contains(text(), 'Female')]")).click();
	
    	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name = 'websubmit']")));
        driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
		
       
		//driver.findElement(By.name("reset_action")).click();

	}

}
