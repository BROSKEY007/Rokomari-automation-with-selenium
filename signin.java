package com.rokomari.Rokomari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class signin {
	

	public static void main(String[] args) throws InterruptedException {
		
		  	      
	      WebDriver driver = new EdgeDriver();
	      
		  driver.get("https://www.rokomari.com/book#_=_");
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		  WebElement SignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		  SignIn.click();
		  Thread.sleep(2000);
		  
		  WebElement ClickGoogle = driver.findElement(By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));
		  ClickGoogle.click();
		  Thread.sleep(2000);	
		  
		  WebElement EmailIn = driver.findElement(By.xpath("//input[@id='identifierId']"));
	      EmailIn.sendKeys("autoemon101@gmail.com");
	      Thread.sleep(1000);	
	      
	      WebElement ClickNext = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		  ClickNext.click();
		  Thread.sleep(2000);
		  
		  WebElement PassIn = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	      PassIn.sendKeys("123qwe!@#QWE");
	      Thread.sleep(1000);
	      
	      WebElement ClickNext2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		  ClickNext2.click();
		  Thread.sleep(2000);
	      
	      
	      
	      
	      
	      
		  
		  
		  
		  
		  

       }
}
