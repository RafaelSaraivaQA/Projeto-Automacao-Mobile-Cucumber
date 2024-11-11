package actions; // Pacote onde a classe LoginActions está localizada

import core.WebDriverManager;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.CalculadoraMap;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Classe LoginActions que contém ações relacionadas ao login no sistema.
 * Extende a classe BaseMaps que fornece funcionalidades básicas de mapeamento.
 */

public class CalculadoraActions{

    CalculadoraMap calculadoraMap = new CalculadoraMap();

    //Os códigos de @AndroidFindBy serve para mapear os elementos
    public CalculadoraActions(){
        PageFactory.initElements(new AppiumFieldDecorator(WebDriverManager.getDriver()), this);
    }

    //CalculadoraMap calculadoraMap = new CalculadoraMap();

    public void clicarNoPrimeiroNumero() throws Exception {
        calculadoraMap.botaoNumeroDois.click();
    }

    public void clicarNoBotaoSoma() throws Exception {
        calculadoraMap.botaoSoma.click();
    }

    public void clicarNoSegundoNumero() throws Exception {
        calculadoraMap.botaoNumeroCinco.click();
    }

    public void clicarNoBotaoIgual() throws Exception {
        calculadoraMap.botaoIgual.click();
    }

    public void validarResultadoDaSoma() {
        Assert.assertTrue(calculadoraMap.textoResultadoFinal.isDisplayed());
    }
}
