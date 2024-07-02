package listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class TestngListners extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("its start executed",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("its succes",true);
	}
LocalDateTime datetime= LocalDateTime.now();
String date=datetime.toString().replace(":", "-");

@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	Reporter.log("its failed",true);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File target= new File("C:\\Users\\LEGION\\eclipse-workspace\\QspiderPractice\\Screenshot"+date+".png");
		try {
			FileHandler.copy(Source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
