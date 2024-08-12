
# API-Desafio1

Este repositório contém o código de uma API desenvolvida como parte do Desafio 1. A API é construída em Java e utiliza MySQL como banco de dados, com foco no gerenciamento de pedidos de clientes em formato JSON.

## 🚀 Funcionalidades

- **Gerenciamento de Pedidos**: Criação, leitura, atualização e exclusão de pedidos de clientes.
- **Integração com Banco de Dados**: Utiliza MySQL para armazenar informações sobre os pedidos.
- **Formato JSON**: As informações dos pedidos são gerenciadas em formato JSON.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal utilizada no desenvolvimento da API.
- **Spring Boot**: Framework para facilitar a criação de APIs RESTful.
- **MySQL**: Banco de dados relacional utilizado para armazenar os dados.
- **Maven**: Gerenciador de dependências e automação de build.

## 📂 Estrutura do Projeto

```bash
API-Desafio1/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── thialylima/
│   │   │           └── apidesafio1/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               └── service/
│   └── resources/
│       └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ Configuração

### 1. Clone o repositório

```bash
git clone https://github.com/thialylima/API-Desafio1.git
cd API-Desafio1
```

### 2. Configure o banco de dados

- Certifique-se de ter o MySQL instalado e rodando na sua máquina.
- Crie um banco de dados para a API:

```sql
CREATE DATABASE api_desafio1;
```

- Atualize o arquivo `application.properties` com suas credenciais do MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/api_desafio1
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
```

### 3. Compile e execute a aplicação

```bash
mvn clean install
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080/swagger-ui/index.html#/`.

## 🤝 Contribuição

Sinta-se à vontade para contribuir com este projeto! Você pode abrir uma issue ou enviar um pull request com melhorias e correções.

