package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import support.Config;
import support.CsvDatapool;
import support.Drivers;
import support.IDatapool;
import support.Report;
import tasks.EnterInsurantDataTasks;
import tasks.EnterProductDataTasks;
import tasks.EnterVehicleDataTasks;
import tasks.SendQuoteTasks;



public class InsuranceTestCase {
	private static final String SYSTEM_URL = Config.get("environment.taglivros.areausuario");
	private static final String DATAPOOL = Config.get("datapool.pasta");
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private WebDriver driver;
	private IDatapool datapool;
	private EnterVehicleDataTasks vehicledata;
	private EnterInsurantDataTasks insurantdata;
	private EnterProductDataTasks productdata;
	private SendQuoteTasks quote;

	@Before
	public void setUp() {
		Report.startTest("Acesso a Area de Usuario");
		
		this.driver = Drivers.getChromeDriver();
		this.driver.get(SYSTEM_URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		datapool = new CsvDatapool(DATAPOOL);
		this.vehicledata = new EnterVehicleDataTasks(driver);
		this.insurantdata = new EnterInsurantDataTasks(driver);
		this.productdata = new EnterProductDataTasks(driver);
		this.quote = new SendQuoteTasks(driver);
	}
	
	@Test
	public void testMain() throws InterruptedException {
			this.vehicledata.setMake();
			this.vehicledata.setModel();
			this.vehicledata.setCylinderCapacity();
			this.vehicledata.setEnginePerformance();
			this.vehicledata.setDateOfManufacture();
			this.vehicledata.setNumberOfSeats();
			this.vehicledata.setRightHandDriver();
			this.vehicledata.setNumberOfSeats2();
			this.vehicledata.setFuelType();
			this.vehicledata.setPayload();
			this.vehicledata.setTotalWeight();
			this.vehicledata.setListPrice();
			this.vehicledata.setLicensePlate();
			this.vehicledata.setAnnualMileage();
			this.vehicledata.next();
			
			this.insurantdata.setFirstName();
			this.insurantdata.setLastName();
			this.insurantdata.setDateOfBirth();
			this.insurantdata.setGender();
			this.insurantdata.setStreetAddress();
			this.insurantdata.setCountry();
			this.insurantdata.setZipCode();
			this.insurantdata.setCity();
			this.insurantdata.setOccupation();
			this.insurantdata.setHobbies();
			this.insurantdata.setWebSite();
			this.insurantdata.setPicture();
			this.insurantdata.setNext();
			
			this.productdata.setStartDate();
			this.productdata.setInsuranceSum();
			this.productdata.setMeritRating();
			this.productdata.setDamageInsurance();
			this.productdata.setOptionalProducts();
			this.productdata.setCourtesyCar();
			this.productdata.setNext();
			this.productdata.selectSilver();			
			this.productdata.sendQuote();
			
			this.quote.setEmail();
			this.quote.setPhone();
			this.quote.setUsername();
			this.quote.setPassword();
			this.quote.setConfirmPassword();
			this.quote.setSendEmail();
	}
	
	@After
	public void tearDown() {
		Report.close();
		//this.driver.quit();
	}

}
