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
	private static final String SYSTEM_URL = Config.get("environment.tricentis.com");
	private static final String DATAPOOL_VEHICLEDATA = Config.get("datapool.vehicledata.pasta");
	private static final String DATAPOOL_INSURANTDATA = Config.get("datapool.vehicledata.pasta");
	private static final String DATAPOOL_INSURANTDATA = Config.get("datapool.vehicledata.pasta");
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private WebDriver driver;
	private IDatapool datapoolvehicledata;
	private IDatapool datapoolinsurantdata;
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
		
		
		datapoolvehicledata = new CsvDatapool(DATAPOOL_VEHICLEDATA);
		datapoolinsurantdata = new CsvDatapool(DATAPOOL_INSURANTDATA);
		this.vehicledata = new EnterVehicleDataTasks(driver);
		this.insurantdata = new EnterInsurantDataTasks(driver);
		this.productdata = new EnterProductDataTasks(driver);
		this.quote = new SendQuoteTasks(driver);
	}
	
	@Test
	public void testMain() throws InterruptedException {
			this.vehicledata.setMake(datapoolvehicledata.getValue("make"));
			this.vehicledata.setModel(datapoolvehicledata.getValue("model"));
			this.vehicledata.setCylinderCapacity(datapoolvehicledata.getValue("cylinder"));
			this.vehicledata.setEnginePerformance(datapoolvehicledata.getValue("engine"));
			this.vehicledata.setDateOfManufacture(datapoolvehicledata.getValue("date"));
			this.vehicledata.setNumberOfSeats(datapoolvehicledata.getValue("numberseats"));
			this.vehicledata.setRightHandDriver();
			this.vehicledata.setNumberOfSeats2(datapoolvehicledata.getValue("numberseats2"));
			this.vehicledata.setFuelType(datapoolvehicledata.getValue("fuel"));
			this.vehicledata.setPayload(datapoolvehicledata.getValue("payload"));
			this.vehicledata.setTotalWeight(datapoolvehicledata.getValue("total"));
			this.vehicledata.setListPrice(datapoolvehicledata.getValue("list"));
			this.vehicledata.setLicensePlate(datapoolvehicledata.getValue("license"));
			this.vehicledata.setAnnualMileage(datapoolvehicledata.getValue("annual"));
			this.vehicledata.next();
			
			this.insurantdata.setFirstName(datapoolvehicledata.getValue("first"));
			this.insurantdata.setLastName(datapoolvehicledata.getValue("last"));
			this.insurantdata.setDateOfBirth(datapoolvehicledata.getValue("date"));
			this.insurantdata.setGender();
			this.insurantdata.setStreetAddress(datapoolvehicledata.getValue("street"));
			this.insurantdata.setCountry(datapoolvehicledata.getValue("country"));
			this.insurantdata.setZipCode(datapoolvehicledata.getValue("zip"));
			this.insurantdata.setCity(datapoolvehicledata.getValue("city"));
			this.insurantdata.setOccupation(datapoolvehicledata.getValue("occupation"));
			this.insurantdata.setHobbies();
			this.insurantdata.setWebSite(datapoolvehicledata.getValue("website"));
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
