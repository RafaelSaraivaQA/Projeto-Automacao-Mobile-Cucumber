package maps;

import core.WebDriverManager;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CalculadoraMap {

    public CalculadoraMap(){
        PageFactory.initElements(new AppiumFieldDecorator(WebDriverManager.getDriver()), this);
    }

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public WebElement botaoNumeroDois;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    public WebElement botaoSoma;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    public WebElement botaoNumeroCinco;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    public WebElement botaoIgual;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public WebElement textoResultadoFinal;

}

