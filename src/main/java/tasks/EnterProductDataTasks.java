package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import appObjects.EnterProductDataAppObjects;

public class EnterProductDataTasks {
	
	private final EnterProductDataAppObjects productdata;
	private WebDriver driver;
	
	public EnterProductDataTasks (WebDriver driver) {
		this.driver = driver;
		this.productdata = new EnterProductDataAppObjects (driver); 
	}
	
	public void setStartDate (String start) {
		this.productdata.getStartDate().sendKeys(start);
	}
	
	public void setInsuranceSum (String sum) {
		this.productdata.getInsuranceSum().sendKeys(sum);
	}
	
	public void setMeritRating (String merit) {
		this.productdata.getMeritRating().sendKeys(merit);
	}
	
	public void setDamageInsurance (String damage) {
		this.productdata.getDamageInsurance().sendKeys(damage);
	}
	
	public void setOptionalProducts () {
		this.productdata.getOptionalProducts().click();
	}
	
	public void setCourtesyCar (String courtesy) {
		this.productdata.getCourtesyCar().sendKeys(courtesy);
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
