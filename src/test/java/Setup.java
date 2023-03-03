import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {

        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability("deviceName","emulator");
        caps.setCapability("platformName","Android");
        caps.setCapability("os","11");
        caps.setCapability("appPackage","com.continuum.emi.calculator");
        caps.setCapability("appActivity","com.finance.emicalci.activity.Splash_screnn");
        caps.setCapability("app","D:\\Rimi\\APK\\emi-calc.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver =new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
