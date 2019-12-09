package com.durgasoft.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetText {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String Contact= driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[2]")).getText();
		System.out.println(Contact);
		String expectedName = "Maria Anders";
		if (expectedName.equalsIgnoreCase(Contact)) {
			System.out.println("Test case is pass: ");
			}else {
				System.out.println("TestingDemo case fail:");
			
		}
	
	}

}
