package com.cryptocurrency;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 

public class loadTest01 {

  public WebDriver driver;
	
  @Test
  public void checkLaunch() {
	  
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals(title, "The CryptoCoin Guide – Your Guide to the World of CryptoCurrency");
	  
	 
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.get("https://thecryptocoinguide.com");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }


}
