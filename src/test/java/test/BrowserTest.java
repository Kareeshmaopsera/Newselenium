package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BrowserTest {
public static void main(String[] args) {
	
	//String projectPath = System.getProperty("user.dir");
	//System.out.println(projectPath);
	
	//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
	
	
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://www.youtube.com/");
	driver1.close();
}
}
