package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomlog.FileInputStream;
import pomlog.loginpage;
import pomlog.Properties;

public class pomxp {

public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //properties_File
		 //Step1:- Path connection
//FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\http://PropertyData.properties");
		 fis = new FileInputStream("C:\\Users\\LEGION\\Desktop\\PropertyData.properties.txt");
		 
         //Step2:-load data into properties class
   Properties pro = new Properties();
   pro.load(fis);
   String URL = pro.getProperty("url");
   String USERNAME = pro.getProperty("username");
   String PASSWORD = pro.getProperty("password");
	
    driver.get(URL);
	 
  /*   driver.findElement(http://By.id("user-name")).sendKeys(USERNAME);
	 driver.findElement(http://By.id("password")).sendKeys(PASSWORD);
	 driver.findElement(http://By.id("login-button")).click();*/
    
    //Implementing using POM class
    loginpage login = new loginpage(driver);
    login.getUserTextField().sendKeys(USERNAME);
    login.getPasswordTextField().sendKeys(PASSWORD);
    login.getLoginButton().click();
	}

}

}
