package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appObjects.EnterInsurantDataAppObject;
import appObjects.EnterProductDataAppObjects;

public class EnterProductDataTasks {
	
	private final EnterProductDataAppObjects productdata;
	private WebDriver driver;
	
	public EnterProductDataTasks (WebDriver driver) {
		this.driver = driver;
		this.productdata = new EnterProductDataAppObjects (driver); 
	}
	
	public void setStartDate () {
		this.productdata.getStartDate().sendKeys("10/12/2019");
	}
	
	public void setInsuranceSum () {
		this.productdata.getInsuranceSum().sendKeys("3.000.000,00");
	}
	
	public void setMeritRating () {
		this.productdata.getMeritRating().sendKeys("Super Bonus");
	}
	
	public void setDamageInsurance () {
		this.productdata.getDamageInsurance().sendKeys("No coverage");
	}
	
	public void setOptionalProducts () {
		this.productdata.getOptionalProducts().click();
	}
	
	public void setCourtesyCar () {
		this.productdata.getCourtesyCar().sendKeys("yes");
	}
	
	public void setNext () {
		this.productdata.getNext().click();
	}
	
	public void selectSilver () {
		WebDriverWait wait = new WebDriverWait(this.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")));
		this.productdata.getSelectSilver().click();
	}
	
	public void sendQuote () {		
		this.productdata.getNextSendQuote().click();
	}
}
