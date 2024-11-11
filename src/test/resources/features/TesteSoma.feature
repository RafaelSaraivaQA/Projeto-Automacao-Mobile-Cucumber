#language: pt
#encoding: utf-8

@teste
 # Tags servem para identificar a qual conjunto de execução esse teste pertence
# Para rodar os testes com essa tag, pode-se usar o comando -> mvn test -Dcucumber.filter.tags="@teste"

Funcionalidade: Somar dois numeros
  Como usuario de uma calculadora
  Eu desejo realizar a soma de dois numeros

  Cenario:
    Dado que clico no primeiro numero
    Quando clicar no botao soma
    E clicar no segundo numero
    E clicar no botao igual
    Entao devo ver o resultado da soma


