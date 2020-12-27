package MavenTestNGPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGClass {
	WebDriver driver;
	JavascriptExecutor jsDriver;
	String projectpath = System.getProperty("user.dir");
	// new comment added
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browsername) throws Exception
	{
		/*
		Excelfactory.Initiate("filepath");
		ExcelFactory.LoadData(4);
		*/		
		System.out.println("Browsername is :"+browsername);
		System.out.println("Thread id :" + Thread.currentThread().getId());
		
		// Check if parameter is passed from TestNG is 'FireFox'
		if (browsername.equalsIgnoreCase("firefox"))
		{
			//System.out.println("Firefox");
			// Create Firefox instance 
			 System.setProperty("webdriver.gecko.driver", "C:\\BrowserDriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			//System.out.println("Chrome");
			// Set path to chromedriver 
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{
			//System.out.println("Edge");
			System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else	
		{	
			throw new Exception("Browser is not correct");
		}
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}	
	
	@Test
	public void TestCase1()
	{
		System.out.println("Test Case1 Execution");	
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void TestCase2()
	{
		System.out.println("Test Case2 Execution");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void TestCase3()
	{
		System.out.println("Test Case3 Execution");
		driver.get("https://www.google.com/");
	}
	@Test
	public void TestCase4()
	{
		System.out.println("Test Case4 Execution");
		driver.get("https://www.google.com/");
	}
	/*
	 * @BeforeMethod public void beforemethod() {
	 * System.out.println("BEfore Method Execution"); }
	 */
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After Method Execution");
		driver.close();
	}
/*
	@Test
	public void CreateOffice() {
		OfficelistPage olp = Homepage.clickonOfficeMenu();
		OfficeDetailsPage odp = olp.opendetailspage();
	}
*/

}
