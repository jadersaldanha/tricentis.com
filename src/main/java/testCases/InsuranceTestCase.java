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
import tasks.EnterVehicleDataTasks;



public class InsuranceTestCase {
	private static final String SYSTEM_URL = Config.get("environment.taglivros.areausuario");
	private static final String DATAPOOL = Config.get("datapool.pasta");
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private WebDriver driver;
	private IDatapool datapool;
	private EnterVehicleDataTasks vehicledata;

	@Before
	public void setUp() {
		Report.startTest("Acesso a Area de Usuario");
		
		this.driver = Drivers.getChromeDriver();
		this.driver.get(SYSTEM_URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		datapool = new CsvDatapool(DATAPOOL);
		this.vehicledata = new EnterVehicleDataTasks(driver);
	
	}
	
	@Test
	public void testMain() throws InterruptedException {
			this.vehicledata.setMake();
			this.vehicledata.setModel();
			this.vehicledata.setCylinderCapacity();
			this.vehicledata.setEnginePerformance();
			this.vehicledata.setDateOfManufacture();
			this.vehicledata.setNumberOfSeats();
			//sthis.vehicledata.setRightHandDriver();
			this.vehicledata.setNumberOfSeats2();
			this.vehicledata.setFuelType();
			this.vehicledata.setPayload();
			this.vehicledata.setTotalWeight();
			this.vehicledata.setListPrice();
			this.vehicledata.setLicensePlate();
			this.vehicledata.setAnnualMileage();
	}
	
	@After
	public void tearDown() {
		Report.close();
		//this.driver.quit();
	}

}
