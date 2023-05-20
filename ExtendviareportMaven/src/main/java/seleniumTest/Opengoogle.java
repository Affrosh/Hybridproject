package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Opengoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentSparkReporter reporter = new ExtentSparkReporter("report.html");
		ExtentReports extendreports = new ExtentReports();
		extendreports.attachReporter(reporter);
		ExtentTest test =extendreports.createTest("whatsapp web");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("whatsapp web");
		driver.findElement(By.name("q")).submit();
		test.pass("Test passed");
		driver.quit();
		extendreports.flush();
	}

}
