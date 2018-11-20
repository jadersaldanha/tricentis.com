package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuoteAppObjects {
	
	private WebDriver driver; 
	
	public SendQuoteAppObjects (WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getEmail () {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getPhone () {
		return driver.findElement(By.id("phone"));
	}
	
	public WebElement getUsername () {
		return driver.findElement(By.id("username"));
	}
	
	public WebElement getPassword () {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getConfirmPassword () {
		return driver.findElement(By.id("confirmpassword"));
	}
	
	public WebElement getSendEmail () {
		return driver.findElement(By.id("sendemail"));
	}
	
	public WebElement getNumberOfSeats () {
		return driver.findElement(By.id("numberofseats"));
	}
	
	public WebElement getNumberOfSeats2 () {
		return driver.findElement(By.id("numberofseatsmotorcycle"));
	}
	
	public WebElement getFuelType () {
		return driver.findElement(By.id("fuel"));
	}

	public WebElement getPayload () {
		return driver.findElement(By.id("payload"));
	}
	
	public WebElement getTotalWeight () {
		return driver.findElement(By.id("totalweight"));
	}
	
	public WebElement getListPrice () {
		return driver.findElement(By.id("listprice"));
	}
	
	public WebElement getLicensePlate () {
		return driver.findElement(By.id("licenseplatenumber"));
	}
	
	public WebElement getAnnualMileage () {
		return driver.findElement(By.id("annualmileage"));
	}
	
	public WebElement getRightHandDrive () {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));
	}
	
	public WebElement getNext () {
		return driver.findElement(By.id("nextenterinsurantdata"));
	}

}
