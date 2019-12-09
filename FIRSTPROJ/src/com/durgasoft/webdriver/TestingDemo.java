package com.durgasoft.webdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TestingDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium\\chromedriver.exe");
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//Enter URL
		driver.get("https://www.toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.name("firstname")).sendKeys("venkat");
        driver.findElement(By.id("lastname")).sendKeys("narayana");
		//driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='6']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("10/02/1993");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		//driver.findElement(By.id("continents")).equals(obj)
		new Select(driver.findElement(By.id("continents"))).selectByValue("AUS");
		//driver.findElement(By.id("submit3")).click();
		driver.findElement(By.xpath("//button[@id='submit2']")).click();
		
		//handle hyperlink
		//driver.findElement(By.linkText("Link Test")).click();
		//Partial Link Test
		//driver.findElement(By.linkText("Partial Link Test")).click();
		
		
		
		
	}

}
