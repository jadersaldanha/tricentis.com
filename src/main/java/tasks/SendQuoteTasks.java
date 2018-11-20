package tasks;

import org.openqa.selenium.WebDriver;

import appObjects.EnterVehicleDataAppObjects;
import appObjects.SendQuoteAppObjects;

public class SendQuoteTasks {
	private final SendQuoteAppObjects quote;
	private WebDriver driver;
	
	public SendQuoteTasks (WebDriver driver) {
		this.driver = driver;
		this.quote = new SendQuoteAppObjects (driver); 
	}
	
	public void setEmail () {
		this.quote.getEmail().sendKeys("teste@teste.com");
	}
	
	public void setPhone () {
		this.quote.getPhone().sendKeys("1231231231");
	}
	
	public void setUsername () {
		this.quote.getUsername().sendKeys("testes");
	}

	public void setPassword () {
		this.quote.getPassword().sendKeys("Alegrete12345");
	}
	
	public void setConfirmPassword () {
		this.quote.getConfirmPassword().sendKeys("Alegrete12345");
	}
	
	public void setSendEmail () {
		this.quote.getSendEmail().click();
	}
}
