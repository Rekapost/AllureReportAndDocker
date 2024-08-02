package docker;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class DockerWithChrome {
	 public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		 ChromeOptions options = new ChromeOptions();  
//		 Proxy proxy = new Proxy();
//		 proxy.setAutodetect(false);
//		 proxy.setHttpProxy("proxy_url:port"); 
//		 proxy.setSslProxy("proxy_url:port");
//		 proxy.setNoProxy("no_proxy-var");
//		 options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		 options.setCapability("proxy", proxy); 		 
		 //DesiredCapabilities dc=  DesiredCapabilities.chrome();
		 URL url = new URL ("http://localhost:4444/wd/hub");
		 RemoteWebDriver driver = new RemoteWebDriver(url,options);	
		 driver.get("https://practice.automationtesting.in/my-account/");
		 String ActualTitle =driver.getTitle();			
		 System.out.println("opened correct page :  " + ActualTitle);	
		 driver.quit();
	}
}

//https://youtu.be/UzwnM13Na8E?si=Z3TifTO-Mq7z97My

// docker pull selenium/standalone-chrome:latest
// docker run -d -p 4444:4444 --shm-size="2g" selenium/standalone-chrome:latest
// run java application