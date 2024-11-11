package steps;

import actions.CalculadoraActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CalculadoraSteps {
    CalculadoraActions calculadoraActions = new CalculadoraActions();

    @Dado("que clico no primeiro numero")
    public void queClicoNoPrimeiroNumero() throws Exception {
      calculadoraActions.clicarNoPrimeiroNumero();
    }
    @Quando("clicar no botao soma")
    public void queCliCoNoBotaoSoma() throws Exception {
        calculadoraActions.clicarNoBotaoSoma();
    }

    @E("clicar no segundo numero")
    public void clicarNoSegundoNumero() throws Exception {
        calculadoraActions.clicarNoSegundoNumero();
    }

    @E("clicar no botao igual")
    public void clicarNoBotaoIgual() throws Exception {
        calculadoraActions.clicarNoBotaoIgual();
    }

    @Entao("devo ver o resultado da soma")
    public void validarResultadoDaSoma(){
        calculadoraActions.validarResultadoDaSoma();
    }
}
