package tasks;

import org.openqa.selenium.WebDriver;

import appObjects.EnterVehicleDataAppObjects;

public class EnterVehicleDataTasks {
	
	private final EnterVehicleDataAppObjects vehicledata;
	private WebDriver driver;
	
	public EnterVehicleDataTasks (WebDriver driver) {
		this.driver = driver;
		this.vehicledata = new EnterVehicleDataAppObjects(driver); 
	}
	
	public void setMake () {
		this.vehicledata.getMake().sendKeys("Audi");
	}
	
	public void setModel () {
		this.vehicledata.getModel().sendKeys("Scooter");
	}
	
	public void setCylinderCapacity () {
		this.vehicledata.getCylinderCapacity().sendKeys("99");
	}

	public void setEnginePerformance () {
		this.vehicledata.getEngine().sendKeys("99");
	}
	
	public void setDateOfManufacture () {
		this.vehicledata.getDate().sendKeys("14/10/1990");
	}
	
	public void setNumberOfSeats () {
		this.vehicledata.getNumberOfSeats().sendKeys("2");
	}
	
	public void setNumberOfSeats2 () {
		this.vehicledata.getNumberOfSeats2().sendKeys("2");
	}
	
	public void setFuelType () {
		this.vehicledata.getFuelType().sendKeys("Petrol");
	}
	
	public void setPayload () {
		this.vehicledata.getPayload().sendKeys("90");
	}
	
	public void setTotalWeight () {
		this.vehicledata.getTotalWeight().sendKeys("90");
	}
	
	public void setListPrice () {
		this.vehicledata.getListPrice().sendKeys("900");
	}
	
	public void setLicensePlate () {
		this.vehicledata.getLicensePlate().sendKeys("asd2312");
	}
	
	public void setAnnualMileage () {
		this.vehicledata.getAnnualMileage().sendKeys("900");
	}
	
	public void setRightHandDriver () {
		this.vehicledata.getRightHandDrive().click();
	}
}
