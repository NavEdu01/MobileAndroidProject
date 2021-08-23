package util;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CommonObjects {

//    public WebDriver getDriver(){
//        return driver;
//    }
public AndroidDriver<AndroidElement> driver;
    public void launchApp() throws MalformedURLException {

        File app=new File("src");
        File fapp=new File(app,"org.openintents.shopping_100221.apk");

        //startServer();
        DesiredCapabilities cap= new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        cap.setCapability(MobileCapabilityType.APP, fapp.getAbsolutePath());
        cap.setCapability("autoGrantPermissions",true);
        cap.setCapability("appWaitActivity","org.openintents.shopping.ui.LayoutChoiceActivity");

        this.driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        System.out.println(driver);
        //stopServer();
    }

    public void waitUntilTheElementIsClickable(WebElement element){

        WebDriverWait wait = new WebDriverWait(driver,30,1000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
