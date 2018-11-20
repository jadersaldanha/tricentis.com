package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterProductDataAppObjects {
	private WebDriver driver; 
	
	public EnterProductDataAppObjects (WebDriver driver) {
		this.driver = driver;		
	}

	public WebElement getStartDate () {
		return driver.findElement(By.id("startdate"));
	}
	
	public WebElement getInsuranceSum () {
		return driver.findElement(By.id("insurancesum"));
	}
	
	public WebElement getMeritRating () {
		return driver.findElement(By.id("meritrating"));
	}
	
	public WebElement getDamageInsurance () {
		return driver.findElement(By.id("damageinsurance"));
	}
	
	public WebElement getOptionalProducts () {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"));
	}
	
	public WebElement getCourtesyCar () {
		return driver.findElement(By.id("courtesycar"));
	}
	
	public WebElement getNext () {
		return driver.findElement(By.id("nextselectpriceoption"));
	}
	
	public WebElement getSelectSilver () {
		return driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span"));
	}
	
	public WebElement getNextSendQuote () {
		return driver.findElement(By.id("nextsendquote"));
	}
	
	
}
