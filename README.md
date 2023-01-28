# Projeto de Cadastro de Cidades, Estados e Países desenvolvido no curso #BeTheNext Ada/Sinqia

##Execução do projeto

Esse projeto foi construído com base no Java 17, portanto precisa da JVM correspondente para execução. 

O projeto utiliza um arquivo para configurar a execução, portanto é necessário ter um arquivo crud.properties na raiz do projeto para o correto funcionamento do mesmo.

Exemplo do arquivo:

```
pessoa.controller.tipo=DEFINITIVO
pessoa.persistencia.tipo=XML

```
## pessoa.controller.tipo
Define o tipo de controller a ser utilizado. Valores possíveis são: DEFINITIVO ou VOLATIL

## pessoa.persistencia.tipo
Define o tipo de persistência a ser utilizada. Valores possíveis são: XML ou BINARIA