package core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class WebDriverManager {

    public static AndroidDriver driver;
    public WebDriverWait wait;
    public AndroidTouchAction actions;

    // cria o driver de MobileElement
    public static AndroidDriver createDriver() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:app", System.getProperty("user.dir")+"/app/calculator-7-8-271241277.apk");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("apiium:platformName", "Android");
        capabilities.setCapability("appium:autoGrantPermissions", "true");
        driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);
        return driver;
    }

    //Serve para retornar o driver para inicialização do pagefactory do appium
    public static AndroidDriver getDriver() {
        return driver;
    }

    //Cria um metodo que finaliza o driver
    public static void quitDriver() {
        driver.quit();
    }
}
