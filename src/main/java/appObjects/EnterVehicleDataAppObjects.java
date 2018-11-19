package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterVehicleDataAppObjects {
	
	private WebDriver driver; 
	
	public EnterVehicleDataAppObjects (WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getMake () {
		return driver.findElement(By.id("make"));
	}
	
	public WebElement getModel () {
		return driver.findElement(By.id("model"));
	}
	
	public WebElement getCylinderCapacity () {
		return driver.findElement(By.id("cylindercapacity"));
	}
	
	public WebElement getEngine () {
		return driver.findElement(By.id("engineperformance"));
	}
	
	public WebElement getDate () {
		return driver.findElement(By.id("dateofmanufacture"));
	}
	
	public WebElement getNumber () {
		return driver.findElement(By.id("numberofseats"));
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
		return driver.findElement(By.className(""));
	}
}
