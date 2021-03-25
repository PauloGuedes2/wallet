[![Build Status](https://travis-ci.org/PauloGuedes2/wallet.svg?branch=master&status=passed)](https://travis-ci.org/github/PauloGuedes2/wallet)

# WalletAPI 
Projeto criado para servir de referência ao curso _API RESTfull com Spring Boot utilizando TDD, CI e CD_ que está divulgado na plataforma Udemy, a principal funcionalidade dessa API é permitir o cadastro de usuários para manipular de maneira individual uma carteira, inserindo, alterando, removendo ou adicionado itens.

## Detalhes do Projeto

-   Projeto criado com Spring Boot e Java 11
-   Banco de dados Postgres com JPA e Spring Data JPA
-   Versionamento de banco de dados com Flyway
-   Testes com JUnit e Mockito com banco H2 em memória
-   Caching com EhCache
-   Nuvem do Heroku
-   Integração contínua com TravisCI
-   Project Lombok
-   Documentação dos endpoints com Swagger
-   Segurança da API com autenticação via tokens JWT

## Como executar a aplicação

Certifique-se de ter o Maven instalado e adicionado ao PATH do seu sistema operacional, assim como o Git. Crie um banco de dados no **postgres** e altere o arquivo **application.properties** informando as credenciais para que a aplicação possa acessar a base de dados.

**Obs:** não se preocupe com a criação das tabelas, o flyway se encarregará dessa função.

<img src="https://media.giphy.com/media/KfwyWfTwMu1FG0XhO8/giphy.gif" width="300" height="300" />

```
git clone https://github.com/PauloGuedes2/wallet.git
mvn spring-boot:run
Acesse os endpoints através da url: http://localhost:8080
```
Também é possível compilar o projeto para executar em um ambiente de produção, para isso execute o seguinte comando na raiz do projeto.

```
mvn clean install
```
O pacote será gerado dentro da pasta target, basta executá-lo com o comando abaixo, não esquecendo de configurar qual o profile e a porta que a aplicação deverá utilizar. Também é necessário criar uma variável de ambiente com as credenciais de acesso ao banco de dados com o nome **$DATABASE_URL** ou alterar o arquivo **application-prod.properties**.

```
java -jar -Dspring.profiles.active=prod -Dserver.port=443 walletAPI-0.0.1-SNAPSHOT.jar
```

## Como autenticar na API
Antes de fazer requisições nos endpoint você deve estar autenticado, antes crie um usuário através de uma requisição **POST** na rota  _/user_  como no exemplo abaixo:

```
{
	"name": "User Test",
	"email": "user@test.com",
	"password": "123456"
}

```

Agora você pode autenticar na API e obter um token de acesso através do endpoint  _/auth_, utilizando o email e a senha cadastrados:

```
{
	"email": "user@test.com",
	"password":"123456"
}

```

Você receberá um token do tipo Bearer que deve ser enviado no cabeçalho das requisições.

## Como executar os testes

Os testes podem ser executados com o seguinte comando:

```
mvn test
```

## Documentação

Utilize a interface do Swagger para ter acesso a documentação dos endpoints, ela está disponível na url: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Heroku
A aplicação está disponível no heroku através da url: https://dashboard.heroku.com/apps/api-wallet-1
