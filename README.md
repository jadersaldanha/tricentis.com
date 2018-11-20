# tricentis.com

Olá!

Bem-vindo(a) a suíte de regressão automatizada em java utilizando Selenium WebDriver do portal Insurance Vehicles. Essa suite tem a cobertura do fluxo de preenchimento de dados.

A Url é a seguinte: http://sampleapp.tricentis.com/101/app.php

Esse projeto de automação foi idealizado com o foco em diversas possibilidades para casos de teste. Contempla a geração de relatórios de evidência de interação e preenchimento de dados com elementos da interface.

Organiza-se da seguinte forma:

tagLivros
/src/main/java
appObjects
tasks
testCases
testSuite
verificationPoints
/src/main/resources
datapools
support
config.properties
Reports
screenshots
Onde: appObjects representa o pacote com as classes que identificam elementos da interface web do portal. tasks: tarefas que atuam nos elementos da interface identificados. testCases pacote que define as classes principais dos casos de teste automatizados. testSuite conjunto que chama as classes de caso de teste que desejar. verificaitonPoints onde estão as classes para validação de dados e/ou elementos de interface, etc. Na pasta datapools estão os arquivos necessários para a utilização da massa de dados para testes automatizados, é possível adicionar quantas linhas e dados quanto forem necessário. Para isso, basta escrever os dados de usuário em cada linha utilizando o separador ";". support estão as classes de suporte para o projeto. config.properties armazena dados de ambiente, seja de homologação ou produção, etc. Na pasta reports serão armazenados screenshots e relatorios de evidência. O arquivo "FillingInsurantTestSuite.jar" é o executável dos casos de teste.

Para executar o projeto é muito fácil \o/ basta seguir os passos:

Fazer o download do projeto;
Na pasta do projeto clicar duas vezes no arquivo "FillingInsurantTestSuite.jar";
Aguarde a execução dos testes \o/;
Verifique a execução dos testes nas pastas "reports" e "screenshots".