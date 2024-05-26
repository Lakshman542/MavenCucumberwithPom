package extentReports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports createExtentReports() {

		if (extent == null) {

			extent = new ExtentReports();
			String date = new SimpleDateFormat("yyyyMMddhhmmss'.html'").format(new Date());
			//System.getProperty("user.dir") + "\\ExtentReports\\ExtentReportResult" + date
			ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\ExtentReports\\ExtentReportResult" + date);
			
			try {
				reporter.loadXMLConfig(
						new File(System.getProperty("user.dir") + "\\src\\test\\resources\\extent-config.xml"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			extent.attachReporter(reporter);
		}

		return extent;
	}
}
