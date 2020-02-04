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
		driver.get("https://smartpay.allsectech.com/accenturelogin/SmartTax_Ver1/TaxVouchingHome.aspx");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("gvTaxHomePage_lnkViewEdit_0")).click();
		driver.findElement(By.id("gvTaxDashBoard_lnkEndit_6")).click();
		new Select(driver.findElement(By.id("ddl_20_1_2"))).selectByValue("Hyderabad");
		driver.findElement(By.name("txt_20_1_3")).sendKeys("Pothineni Ram mohan rao");
		driver.findElement(By.name("txt_20_1_4")).sendKeys("8300");
		driver.findElement(By.name("txt_20_1_8")).sendKeys("H-N0:93 MIG-1 KPHB Phase9  Kukatpally Hyderabad PIN CODE:500085,Telangana");
		driver.findElement(By.name("txt_20_1_7")).sendKeys("H-NO:104, Siva kalyan 1 building, bhagya nagar colony, KPHB Phase1, Kukatpally,Hyderabad, Pincode:500072,Telangana");
		driver.findElement(By.id("lnkSave")).click();
		Thread.sleep(4000);
		
        /*driver.findElement(By.id("lastname")).sendKeys("narayana");
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
*/		
		
		
		
	}

}
