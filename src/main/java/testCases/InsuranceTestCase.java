package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import support.Config;
import support.CsvDatapool;
import support.Drivers;
import support.Generator;
import support.IDatapool;
import support.Report;
import support.Screenshot;
import tasks.EnterInsurantDataTasks;
import tasks.EnterProductDataTasks;
import tasks.EnterVehicleDataTasks;
import tasks.SendQuoteTasks;
import verificationPoints.ValidarMensagemEmailVerificationPoint;



public class InsuranceTestCase {
	private static final String SYSTEM_URL = Config.get("environment.tricentis.com");
	private static final String DATAPOOL_VEHICLEDATA = Config.get("datapool.vehicledata.pasta");
	private static final String DATAPOOL_INSURANTDATA = Config.get("datapool.insurantdata.pasta");
	private static final String DATAPOOL_PRODUCTDATA = Config.get("datapool.productdata.pasta");
	private static final String DATAPOOL_QUOTEDATA = Config.get("datapool.quotedata.pasta");
	private static final String IMAGEPATH = Config.get("screenshot.pasta");
	private WebDriver driver;
	private IDatapool datapoolvehicledata;
	private IDatapool datapoolinsurantdata;
	private IDatapool datapoolproductdata;
	private IDatapool datapoolquotedata;
	private EnterVehicleDataTasks vehicledata;
	private EnterInsurantDataTasks insurantdata;
	private EnterProductDataTasks productdata;
	private SendQuoteTasks quote;
	private ValidarMensagemEmailVerificationPoint validar;

	@Before
	public void setUp() {
		Report.startTest("Filling form");
		
		this.driver = Drivers.getChromeDriver();
		this.driver.get(SYSTEM_URL);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		datapoolvehicledata = new CsvDatapool(DATAPOOL_VEHICLEDATA);
		datapoolinsurantdata = new CsvDatapool(DATAPOOL_INSURANTDATA);
		datapoolproductdata = new CsvDatapool(DATAPOOL_PRODUCTDATA);
		datapoolquotedata = new CsvDatapool(DATAPOOL_QUOTEDATA);
		this.vehicledata = new EnterVehicleDataTasks(driver);
		this.insurantdata = new EnterInsurantDataTasks(driver);
		this.productdata = new EnterProductDataTasks(driver);
		this.quote = new SendQuoteTasks(driver);
		this.validar = new ValidarMensagemEmailVerificationPoint(this.driver);
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
			String screenshotArquivo1 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
			Screenshot.Tirar(driver, screenshotArquivo1);
			Report.log(Status.PASS, "Preencheu Vehicle Data", screenshotArquivo1);
			this.vehicledata.next();
			
			this.insurantdata.setFirstName(datapoolinsurantdata.getValue("first"));
			this.insurantdata.setLastName(datapoolinsurantdata.getValue("last"));
			this.insurantdata.setDateOfBirth(datapoolinsurantdata.getValue("date"));
			this.insurantdata.setGender();
			this.insurantdata.setStreetAddress(datapoolinsurantdata.getValue("street"));
			this.insurantdata.setCountry(datapoolinsurantdata.getValue("country"));
			this.insurantdata.setZipCode(datapoolinsurantdata.getValue("zip"));
			this.insurantdata.setCity(datapoolinsurantdata.getValue("city"));
			this.insurantdata.setOccupation(datapoolinsurantdata.getValue("occupation"));
			this.insurantdata.setHobbies();
			this.insurantdata.setWebSite(datapoolinsurantdata.getValue("wesite"));
			this.insurantdata.setPicture();
			String screenshotArquivo2 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
			Screenshot.Tirar(driver, screenshotArquivo2);
			Report.log(Status.PASS, "Preencheu Insurant Data", screenshotArquivo2);
			this.insurantdata.setNext();
			
			this.productdata.setStartDate(datapoolproductdata.getValue("start"));
			this.productdata.setInsuranceSum(datapoolproductdata.getValue("insurance"));
			this.productdata.setMeritRating(datapoolproductdata.getValue("merit"));
			this.productdata.setDamageInsurance(datapoolproductdata.getValue("damage"));
			this.productdata.setOptionalProducts();
			this.productdata.setCourtesyCar(datapoolproductdata.getValue("courtesy"));
			this.productdata.setNext();
			this.productdata.selectSilver();
			String screenshotArquivo3 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
			Screenshot.Tirar(driver, screenshotArquivo3);
			Report.log(Status.PASS, "Preencheu Product Data", screenshotArquivo3);
			this.productdata.sendQuote();
			
			this.quote.setEmail(datapoolquotedata.getValue("email"));
			this.quote.setPhone(datapoolquotedata.getValue("phone"));
			this.quote.setUsername(datapoolquotedata.getValue("username"));
			this.quote.setPassword(datapoolquotedata.getValue("password"));
			this.quote.setConfirmPassword(datapoolquotedata.getValue("confirm"));
			this.quote.setSendEmail();
			String screenshotArquivo4 = IMAGEPATH + Generator.dataHoraParaArquivo() +  ".png";
			Screenshot.Tirar(driver, screenshotArquivo4);
			Report.log(Status.PASS, "Preencheu Quote Data", screenshotArquivo4);
			
			WebDriverWait wait = new WebDriverWait(this.driver, 30);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[4]/h2"))));
			validar.validarMensagemErro("Sending e-mail success!");	
	}
	
	@After
	public void tearDown() {
		Report.close();
		this.driver.quit();
	}

}
