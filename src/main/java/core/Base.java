package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	private String configPath = "src/tes/resources/input/config.properties";
	private String log4jPath = "src/tes/resources/input/log4j.properties";
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	
	public Base () {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(configPath));
			properties = new Properties();
			properties.load(reader);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger = logger.getLogger(log4jPath);
		PropertyConfigurator.configure(log4jPath);
	}
	
	public static  String getUrl () {
		String url = properties.getProperty("url");
		return url;
		
	}
	public String getBrowser () {
		String browser = properties.getProperty("browser");
		return browser;
		
	}
	
	public static void openBrowser() {
		driver.get(getUrl ());
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public void selectBrowser() {
		switch(getBrowser()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		default:	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	

}