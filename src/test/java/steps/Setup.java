package steps;

import core.*;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Setup {

    @Before
    public void setup() throws Exception {
        WebDriverManager.createDriver();
    }

    @AfterStep
    public void takeScreenShot(Scenario scenario){
        byte[] ss = ((TakesScreenshot) WebDriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(ss, "image/png", "evidencia.png");
    }

    @After
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
