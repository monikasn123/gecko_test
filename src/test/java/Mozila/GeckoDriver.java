package Mozila;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import sun.jvm.hotspot.utilities.Assert;//

import java.net.MalformedURLException;
import java.net.URL;


public class GeckoDriver {
    WebDriver driver;
    String baseUrl, nodeURL;


    public void setup() throws MalformedURLException {


        //  System.setProperty("webdriver.gecko.driver", "Downloads/geckodriver.exe");//
        baseUrl = "https://outlook.office.com/mail/";
        nodeURL = "http://10.171.97.175:5577/wd/hub";
        //URL grid_url = new URL("http://10.171.97.175:4444/wd/hub");
        //driver = new RemoteWebDriver(new URL("http://10.171.97.175:4444/wd/hub"),desc);
        //driver = new ChromeDriver();
        // driver =  new ChromeDriver();
        //driver.get("https://www.google.com");
        //to make the window maximize//
        // driver.manage().window().maximize(); //

        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL(nodeURL), capability);

        //To make the window size full screen//
        driver.manage().window().fullscreen();


        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]) throws MalformedURLException {
        GeckoDriver test = new GeckoDriver();
        test.setup();

    }



}

