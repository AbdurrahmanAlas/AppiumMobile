import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hepsiBurada {

    @Test
    public void setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","11.0");
        caps.setCapability("deviceName","Pixel 2 API 30");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("app","C:\\java_kodlar\\MY_PROJECTS_UI_API_DB\\AppiumWise\\src\\Apps\\hepsiburada.apk");

        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),caps);

        Thread.sleep(3000);
        Thread.sleep(10000);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).click();

        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).sendKeys("iphone 14" );

        driver.findElement(By.id("com.pozitron.hepsiburada:id/search_suggestion_title")).click();

    }

}
