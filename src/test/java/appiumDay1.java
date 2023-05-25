import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


public class appiumDay1 {

    @Test
    public void app() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "11.0");
        desiredCapabilities.setCapability("deviceName", "Pixel 2 API 30");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\java_kodlar\\MY_PROJECTS_UI_API_DB\\AppiumWise\\src\\Apps\\Calculator.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);

        // usb debug kapalıymıs hocam simdi sorun yok
        // hocam bi sorum olacak bu ana ekrana teleffonu nasıl cıkardınız sanal telefonu ben a
        // android studio da proje acmiyoruz orda proje olusturmussunuz
        // sadece sanal telefon icin kullanıyoruz


        //id kullanilarak yapildi
        //9 tusuna tiklandi
      //driver.findElementById("com.google.android.calculator:id/digit_9").click();
      //Thread.sleep(3000);
      // //carpi isaretine tiklandi
      // driver.findElementById("com.google.android.calculator:id/op_mul").click();
      // Thread.sleep(3000);
      // //5 tusuna tiklandi
      // driver.findElementById("com.google.android.calculator:id/digit_5 ").click();


        driver.findElementByAccessibilityId("7").click();

        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"2\"]");
    }}