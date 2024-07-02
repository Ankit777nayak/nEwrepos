package report;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Takingscreenshot {
	public String screenshot(WebDriver driver) {
		LocalDateTime Datetime=LocalDateTime.now();
		String date=Datetime.toString().replace(":", "+");
		 String path = ("./Screenshot/"+date+".png");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(path);
		try {
			FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "." +path;
		
		
	}

	

}
