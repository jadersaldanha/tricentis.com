package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appObjects.EnterInsurantDataAppObject;
import appObjects.EnterVehicleDataAppObjects;

public class EnterInsurantDataTasks {
	
	private final EnterInsurantDataAppObject insurantdata;
	private WebDriver driver;
	
	public EnterInsurantDataTasks (WebDriver driver) {
		this.driver = driver;
		this.insurantdata = new EnterInsurantDataAppObject (driver); 
	}
	
	public void setFirstName () {
		this.insurantdata.getFirstName().sendKeys("jader");
	}
	
	public void setLastName () {
		this.insurantdata.getLastName().sendKeys("saldanha");
	}
	
	public void setDateOfBirth () {
		this.insurantdata.getDateOfBirth().sendKeys("12/10/1990");
	}
	
	public void setGender () {
		this.insurantdata.getGender().click();
	}
	
	public void setStreetAddress () {
		this.insurantdata.getStreetAddress().sendKeys("colombia");
	}
	
	public void setCountry () {
		this.insurantdata.getCountry().sendKeys("brazil");
	}
	
	public void setZipCode () {
		this.insurantdata.getZipCode().sendKeys("98128999");
	}
	
	public void setCity () {
		this.insurantdata.getCity().sendKeys("porto alegre");
	}
	
	public void setOccupation () {
		this.insurantdata.getOccupation().sendKeys("Employee");
	}

	public void setHobbies () {
		this.insurantdata.getHobbies().click();
	}
	
	public void setWebSite () {
		this.insurantdata.getWebSite().sendKeys("www.com.br");
	}
	
	public void setPicture () {
		this.insurantdata.getPicture().sendKeys("c:\\");
	}
	
	public void setNext () {
		this.insurantdata.getNext().click();
	}

}
