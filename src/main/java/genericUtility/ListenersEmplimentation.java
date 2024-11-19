package genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersEmplimentation implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	JavaUtility ju=new JavaUtility();
	String dateTimeStamp=ju.getCalendarDetails("dd-MM-YYYY hh-mm-ss");

	@Override
	public void onTestStart(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"execution started");

		//create a test --->means it will create one testfield for every test script. like @TestScript
		test=report.createTest(methodname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"execution passed");
		test.log(Status.PASS,methodname+"execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"execution failed");

		test.log(Status.FAIL,methodName+"execution failed");

		//capturing the screenshot on test script failed


		SeleniumUtility su = new SeleniumUtility();


		String ScreenshotName=methodName+dateTimeStamp;
		try {
			String path=su.captureScreenshort(BaseClass.sdriver, ScreenshotName);//here throws exception is not working becouse this methods are ovveridenmethods so.
			test.addScreenCaptureFromPath(path);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"execution skipped");

		test.log(Status.SKIP,methodName+"execution skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite execution Stsrted");
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\ExtentReports\\Report"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger Testing Reports");
		reporter.config().setReportName("VTiger");
		reporter.config().setTheme(Theme.DARK);

		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("Reporter Name", "Koti");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}


}


