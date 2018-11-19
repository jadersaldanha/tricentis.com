package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
	public static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
	}

	public static WebDriver getSafariDriver() {
        return new SafariDriver();
	}

	public static WebDriver getInternetExplorerDriver() {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
	}
	
	public static WebDriver getOperaDriver() {
		WebDriverManager.operadriver().setup();
        return new OperaDriver();
	}

	public static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
	}
	
	public static WebDriver getChromeDriver(ChromeOptions options) {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
	}

	public static WebDriver getFirefoxDriver(DesiredCapabilities capabilities) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions browserOptions = new FirefoxOptions(capabilities);
        return new FirefoxDriver(browserOptions);
	}

	public static WebDriver getFirefoxDriver(FirefoxProfile profile) {
		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setProfile(profile);
		
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(browserOptions);
	}
	
	public static WebDriver getFirefoxDriver(String profileName) {
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile firefoxSeleniumProfile = profile.getProfile(profileName);

		FirefoxOptions browserOptions = new FirefoxOptions();
		browserOptions.setProfile(firefoxSeleniumProfile);
		
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(browserOptions);
	}
	
	public static WebDriver getInternetExplorerDriverWhitoutZoneSecurity() {
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		InternetExplorerOptions browserOptions = new InternetExplorerOptions(ieCapabilities);
		
		WebDriverManager.iedriver().setup();
		return new InternetExplorerDriver(browserOptions);
	}
	
	public static WebDriver getHeadlessChromeDriver() {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("headless");
	    options.addArguments("window-size=1280x720");

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
	}
}
