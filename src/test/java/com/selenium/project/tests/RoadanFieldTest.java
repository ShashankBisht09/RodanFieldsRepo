package com.selenium.project.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RoadanFieldTest {
	@Test
	public void testRoadan(){
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rodanandfields.com/ca");
		driver.findElement(By.xpath("//li[@id='BusinessSystemBar']")).click();
		driver.findElement(By.xpath(".//*[@id='main-content']/div[5]/div[2]/p/span")).click();
		
		driver.findElement(By.xpath("//input[@id='sponserparam']")).sendKeys("Mary");
		driver.findElement(By.xpath("//button[@id='search-sponsor-button']")).click();
		driver.findElement(By.xpath("//a[@class='next']")).click();
		String s=driver.findElement(By.xpath("//span[text()=2]")).getText();
		Assert.assertTrue(s.contains("2"));
		System.out.print("verified, we are in 2nd navigation page");
	    driver.close();
	}
	@Test
	public void testRoadan1() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rodanandfields.com/ca");
		driver.findElement(By.xpath(".//*[@id='our-products']")).click();
		driver.findElement(By.xpath(".//*[@id='dropdown-menu']/li[7]/div/a")).click();
		driver.findElement(By.xpath("//input[@tabindex='2']")).click();
		driver.findElement(By.xpath(".//*[@id='quick-refine']/div[2]/div[2]/ul/li[2]/form/div/div[1]/div[2]/div")).click();
	    Thread.sleep(2000);
	    String price=driver.findElement(By.xpath(".//*[@id='main-content']/div[5]/div[2]/p/span")).getText();
	    Assert.assertTrue(price.contains("CAD$ 81.00"));
	    System.out.print("verified");
	    driver.findElement(By.xpath("//select[@id='sortOptions']")).click();
	   
	    
	}

}
