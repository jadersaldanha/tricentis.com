package tasks;

import org.openqa.selenium.WebDriver;

import appObjects.EnterVehicleDataAppObjects;

public class EnterVehicleDataTasks {
	
	private final EnterVehicleDataAppObjects vehicledata;	
	
	public EnterVehicleDataTasks (WebDriver driver) {
		this.vehicledata = new EnterVehicleDataAppObjects(driver); 
	}
	
	public void setMake (String make) {
		this.vehicledata.getMake().sendKeys(make);
	}
	
	public void setModel (String model) {
		this.vehicledata.getModel().sendKeys(model);
	}
	
	public void setCylinderCapacity (String cylinder) {
		this.vehicledata.getCylinderCapacity().sendKeys(cylinder);
	}

	public void setEnginePerformance (String engine) {
		this.vehicledata.getEngine().sendKeys(engine);
	}
	
	public void setDateOfManufacture (String date) {
		this.vehicledata.getDate().sendKeys(date);
	}
	
	public void setNumberOfSeats (String seats) {
		this.vehicledata.getNumberOfSeats().sendKeys(seats);
	}
	
	public void setNumberOfSeats2 (String seats2) {
		this.vehicledata.getNumberOfSeats2().sendKeys(seats2);
	}
	
	public void setFuelType (String fuel) {
		this.vehicledata.getFuelType().sendKeys(fuel);
	}
	
	public void setPayload (String payload) {
		this.vehicledata.getPayload().sendKeys(payload);
	}
	
	public void setTotalWeight (String weight) {
		this.vehicledata.getTotalWeight().sendKeys(weight);
	}
	
	public void setListPrice (String list) {
		this.vehicledata.getListPrice().sendKeys(list);
	}
	
	public void setLicensePlate (String license) {
		this.vehicledata.getLicensePlate().sendKeys(license);
	}
	
	public void setAnnualMileage (String annual) {
		this.vehicledata.getAnnualMileage().sendKeys(annual);
	}
	
	public void setRightHandDriver () {
		this.vehicledata.getRightHandDrive().click();
	}
	
	public void next () {
		this.vehicledata.getNext().click();
	}
}
