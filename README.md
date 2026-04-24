# 📦 Cadastro de Produtos — API REST em Kotlin

![Kotlin](https://img.shields.io/badge/Kotlin-2.2.21-7F52FF?style=flat&logo=kotlin&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.6-6DB33F?style=flat&logo=springboot&logoColor=white)
![H2](https://img.shields.io/badge/Database-H2-003545?style=flat)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)

API REST para cadastro e gerenciamento de produtos, desenvolvida com **Kotlin** e **Spring Boot**. Projeto criado com fins de aprendizado e prática da linguagem Kotlin no ecossistema Spring.

---

## 🚀 Tecnologias

- **Kotlin** 
- **Spring Boot** 
- **Spring Data JPA**
- **Spring Web MVC**
- **H2 Database**
- **Jackson Kotlin Module**
- **Maven**

---

## ⚙️ Pré-requisitos

- Java 17+
- Maven 3.6+

---

## ▶️ Como executar

Clone o repositório:

```bash
git clone https://github.com/younglherme/Cadastro-Produtos-Kotlin.git
cd Cadastro-Produtos-Kotlin
```

Execute com o Maven Wrapper:

```bash
./mvnw spring-boot:run
```

A API ficará disponível em: `http://localhost:8080`

---

## 🗄️ Console H2

O banco de dados H2 pode ser acessado pelo console web em:

```
http://localhost:8080/h2-console
```

| Campo    | Valor                          |
|----------|--------------------------------|
| JDBC URL | `jdbc:h2:mem:testdb`           |
| Usuário  | `sa`                           |
| Senha    | *(vazio)*                      |

---

## 📡 Endpoints

| Método   | Endpoint           | Descrição                      |
|----------|--------------------|--------------------------------|
| `GET`    | `/produtos`        | Lista todos os produtos        |
| `GET`    | `/produtos/{id}`   | Busca produto por ID           |
| `POST`   | `/produtos`        | Cadastra um novo produto       |
| `PUT`    | `/produtos/{id}`   | Atualiza um produto existente  |
| `DELETE` | `/produtos/{id}`   | Remove um produto              |

### Exemplo de body (POST/PUT)

```json
{
  "nome": "Teclado Mecânico",
  "descricao": "Teclado mecânico com switch blue",
  "preco": 299.90
}
```

---

## 📁 Estrutura do projeto

```
src/
└── main/
    └── kotlin/
        └── br/com/guisilva/crud/
            ├── controller/
            ├── model/
            ├── repository/
            └── service/
```

---

## 🎯 Objetivo

Este projeto foi desenvolvido como exercício prático para aprender **Kotlin** aplicado ao desenvolvimento backend com Spring Boot, cobrindo conceitos como:

- Criação de APIs REST
- Integração com banco de dados via JPA/Hibernate
- Estrutura de projetos Spring com Kotlin
- Uso de data classes e null-safety do Kotlin

---