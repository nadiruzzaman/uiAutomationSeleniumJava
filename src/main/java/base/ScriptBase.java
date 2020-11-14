package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ScriptBase {
public static WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void beforeTest(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            ChromeOptions chromeOptions=new ChromeOptions();
            chromeOptions.addArguments("--start-fullscreen");
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
            driver=new ChromeDriver(chromeOptions);

        }else if(browser.equalsIgnoreCase("safari")){
            System.setProperty("webdriver.safari.noinstall","true");
            driver=new SafariDriver();
            driver.manage().window().maximize();

        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","./drivers/geckodriver");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();

        }
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
