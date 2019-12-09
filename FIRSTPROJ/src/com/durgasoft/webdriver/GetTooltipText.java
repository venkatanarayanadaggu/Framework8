package com.durgasoft.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTooltipText {
	public static void main(String[] args)throws InterruptedException {  
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/advanced_search");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String toolTipText=driver.findElement(By.id("gbq1")).getAttribute("title");
	System.out.println(toolTipText);
		
	}

}
