package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterInsurantDataAppObject {
	
	private WebDriver driver; 
	
	public EnterInsurantDataAppObject (WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getFirstName () {
		return driver.findElement(By.id("firstname"));
	}
	
	public WebElement getLastName () {
		return driver.findElement(By.id("lastname"));
	}
	
	public WebElement getDateOfBirth () {
		return driver.findElement(By.id("birthdate"));
	}
	
	public WebElement getGender () {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
	}
	
	public WebElement getStreetAddress () {
		return driver.findElement(By.id("streetaddress"));
	}
	
	public WebElement getCountry () {
		return driver.findElement(By.id("country"));
	}
	
	public WebElement getZipCode () {
		return driver.findElement(By.id("zipcode"));
	}
	
	public WebElement getCity () {
		return driver.findElement(By.id("city"));
	}
	
	public WebElement getOccupation () {
		return driver.findElement(By.id("occupation"));
	}

	public WebElement getHobbies () {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
	}
	
	public WebElement getWebSite () {
		return driver.findElement(By.id("website"));
	}
	
	public WebElement getPicture () {
		return driver.findElement(By.id("picture"));
	}
	
	public WebElement getNext () {
		return driver.findElement(By.id("nextenterproductdata"));
	}

}
