package login_Allure;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAllure {
	@Test
	@Parameters({"username","password"})
	public void loginWithBothCorrect(String userName,String  passWord) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","Chrome_Driver_126/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Reka\\Drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().clearDriverCache();
        //WebDriverManager.chromedriver().clearResolutionCache();
		//WebDriverManager.chromedriver().browserVersion("110.0.0").setup();
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		chromeOptions.setAcceptInsecureCerts(true);
//		chromeOptions.setScriptTimeout(Duration.ofSeconds(30));
//		chromeOptions.setPageLoadTimeout(Duration.ofMillis(30000));
//		chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(20));
		chromeOptions.addArguments("--remote-allow-origins=*");	  
		//driver =new ChromeDriver(chromeOptions);
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		driver.get("https://practice.automationtesting.in/my-account/");
		WebElement UsernameBox=driver.findElement(By.id("username"));
		UsernameBox.sendKeys(userName);
		WebElement passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys(passWord);
		WebElement login=driver.findElement(By.xpath("//*[@id=\'customer_login\']/div[1]/form/p[3]/input[3]"));
		login.click();
		driver.quit();
	}
}
//run the project in testnG.xml file 
// allure serve C:\Users\Reka\eclipse-workspace\AllureReport\allure-results

//cmd    allure serve C:\Users\Reka\eclipse-workspace\AllureReport\(pathof the allure-results folder)

//https://mkyong.com/maven/how-to-generate-maven-wrapper-files-mvnw-and-mvnw-cmd/



