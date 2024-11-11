package runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

/**
 * Esta classe é a responsável por executar os testes de aceitação com Cucumber.
 * Ela configura as características da execução dos testes.
 */
@Suite //Indica que esta classe é uma suíte de testes
@IncludeEngines("cucumber") //Especifica que o mecanismo de teste a ser utilizado é o Cucumber
@SelectClasspathResource("features") // Seleciona o diretório onde estão localizados os arquivos de feature
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,value = "pretty, json:target/cucumber-report/cucumber.json")//Configura o plugin para saída em formato "pretty" e gera relatório em json
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "steps") //Define o pacote de 'steps' para que o Cucumber saiba onde encontrar as definições dos passos
@IncludeTags("teste") //Indica os testes que serao rodados
public class Runner { //Declara a classe Runner

}  //Fim da classe Runner
