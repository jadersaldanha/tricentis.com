package testSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import support.Report;
import testCases.InsuranceTestCase;


@RunWith(Suite.class)
@SuiteClasses({
	InsuranceTestCase.class,
})

public class FillingInsurantTestSuite {
	
	public static void main(String[] args) {
		JUnitCore.runClasses(FillingInsurantTestSuite.class);
	}
	
	@BeforeClass
	public static void setUp() {
		Report.create("Insurant Vehicle", "Signature");
	}

	@AfterClass
	public static void tearDown() {
		Report.close();
	}

}
