package tasks;

import org.openqa.selenium.WebDriver;
import appObjects.SendQuoteAppObjects;

public class SendQuoteTasks {
	private final SendQuoteAppObjects quote;
	
	public SendQuoteTasks (WebDriver driver) {
		this.quote = new SendQuoteAppObjects (driver); 
	}
	
	public void setEmail (String email) {
		this.quote.getEmail().sendKeys("teste@teste.com");
	}
	
	public void setPhone (String phone) {
		this.quote.getPhone().sendKeys("1231231231");
	}
	
	public void setUsername (String username) {
		this.quote.getUsername().sendKeys("testes");
	}

	public void setPassword (String password) {
		this.quote.getPassword().sendKeys("Alegrete12345");
	}
	
	public void setConfirmPassword (String confirm) {
		this.quote.getConfirmPassword().sendKeys("Alegrete12345");
	}
	
	public void setSendEmail () {
		this.quote.getSendEmail().click();
	}
}
