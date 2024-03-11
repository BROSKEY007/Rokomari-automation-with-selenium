package com.rokomari.Rokomari;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.*;

public class checkoutProcess {
	

	public static void main(String[] args) throws InterruptedException {
		
		  	      
	      WebDriver driver = new EdgeDriver();
	      
		  driver.get("https://www.rokomari.com/book#_=_");
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  
		  //login with Gmail account
		  
		  WebElement SignIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		  SignIn.click();
		  Thread.sleep(2000);
		  
		  WebElement ClickGoogle = driver.findElement(By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));
		  ClickGoogle.click();
		  Thread.sleep(2000);	
		  
		  WebElement EmailIn = driver.findElement(By.xpath("//input[@id='identifierId']"));
	      EmailIn.sendKeys("autoemon101@gmail.com");
	      Thread.sleep(2000);	
	      
	      WebElement ClickNext = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		  ClickNext.click();
		  Thread.sleep(3000);
		  
		  WebElement PassIn = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	      PassIn.sendKeys("123qwe!@#QWE");
	      Thread.sleep(3000);
	      
	      WebElement ClickNext2 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		  ClickNext2.click();
		  Thread.sleep(3000);
	      
	      //hover "lekhok"
		  Actions action = new Actions(driver);
		  WebElement HoverLekhok = driver.findElement(By.xpath("//a[@id='js--authors']"));
		  action.moveToElement(HoverLekhok).perform();
		  Thread.sleep(4000);
		  
		  //select "Humayun ahmed"
		  WebElement ClickHumayun = driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
		  ClickHumayun.click();
		  Thread.sleep(4000);
		  
		  //scroll down
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  js.executeScript("window.scrollBy(0,500)" );
		  Thread.sleep(3000);
		  
		  //select "somokalin uponnash"
		  
		  WebElement ClickShomokalin = driver.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]"));
		  ClickShomokalin.click();  		  
		  Thread.sleep(4000);
		  
		  //scroll down
		  
		  js.executeScript("window.scrollBy(0,500)" );
		  Thread.sleep(3000);
		 
		  
		  //select "rochona"
		  
		  WebElement ClickRochona = driver.findElement(By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]"));
		  ClickRochona.click();
		  Thread.sleep(4000);
		  
		  //scroll down
		  
		  WebElement Find = driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[59]/div[1]/a[1]/div[1]/img[1]"));
		  js.executeScript("arguments[0].scrollIntoView()", Find);
		  Thread.sleep(4000);
		  
		  //goto next page
		  
		  WebElement ClickNextPage = driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[3]/a[1]"));
		  ClickNextPage.click();
		  Thread.sleep(4000);
		  
		  //scroll down
		  
		  js.executeScript("window.scrollBy(0,500)" );
		  Thread.sleep(3000);
		  
		  //add a book to cart
		  
		  WebElement HoverBook = driver.findElement(By.xpath("//h4[contains(text(),'সাজঘর')]"));
		  action.moveToElement(HoverBook).perform();
		  Thread.sleep(2000);	
		  
		  //select add to cart
		  
		  WebElement ClickAddToCart = driver.findElement(By.xpath("//body/div[7]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[3]/button[1]"));
		  ClickAddToCart.click();
		  Thread.sleep(4000);
		  
		  //click cart icon
		  WebElement ClickCart = driver.findElement(By.xpath("//body/div[7]/section[1]/div[1]/a[1]/div[1]/img[1]"));
		  ClickCart.click();
		  Thread.sleep(4000);
		  
		  //click place order
		  WebElement ClickOrder = driver.findElement(By.xpath("//a[@id='js-continue-to-shipping']"));
		  ClickOrder.click();
		  Thread.sleep(4000);
		
		  //add information
		  //clear name field
		  driver.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[1]/input[1]")).clear();
		  Thread.sleep(2000);
		  
		  //input name
		  
		  WebElement NameIn = driver.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[1]/input[1]"));
	      NameIn.sendKeys("Emon Ali");
	      Thread.sleep(2000);
		  
	      //input number
	      WebElement PhoneIn = driver.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[1]/input[1]"));
	      PhoneIn.sendKeys("01123456789");
	      Thread.sleep(2000);

		  //select city
	      
	      WebElement CityIn = driver.findElement(By.xpath("//select[@id='js--city']"));
	      CityIn.click();
	      Thread.sleep(2000);
	      
	      WebElement CityIn2 = driver.findElement(By.xpath("//option[contains(text(),'ঢাকা')]"));
	      CityIn2.click();
	      Thread.sleep(2000);
	      
	      //select area
	      WebElement AreaIn = driver.findElement(By.xpath("//select[@id='js--area']"));
	      AreaIn.click();
	      Thread.sleep(2000);
	      
	      WebElement AreaIn2 = driver.findElement(By.xpath("//option[contains(text(),'আদাবর')]"));
	      AreaIn2.click();
	      Thread.sleep(2000);
	      
	      //address input
	      WebElement AddressIn = driver.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]"));
	      AddressIn.click();
	      Thread.sleep(3000);
	      
	      //scroll down
	      js.executeScript("window.scrollBy(0,250)" );
		  Thread.sleep(3000);

	      
	      WebElement AddressIn2 = driver.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]"));
	      AddressIn2.sendKeys("PC Culture Housing, Shyamoli");
	      Thread.sleep(2000);      
	      
	      //scroll down
	      js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
		  Thread.sleep(3000);
		  
		  //sign out
		  WebElement SignOut = driver.findElement(By.xpath("//a[@id='dropdownMenu2']"));
	      SignOut.click();
	      Thread.sleep(2000);
	      
	      WebElement SignOut2 = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
	      SignOut2.click();
	      Thread.sleep(2000);
	      
	      driver.close();
	      
	      

	      
	      
	      

	 
	      
	      
	      
		  
		
		
		  
		  
		  
		  
	      
		
	      
	      
		  
		  
		  
		  
		  

       }
}
