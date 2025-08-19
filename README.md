## API de Transações Financeiras Transaction API 📊
![1755634361438](https://github.com/user-attachments/assets/e636b85b-4e89-43e2-8a89-c514cb28336c)
## 📝 Descrição do Projeto

Este projeto consiste em uma API REST para gerenciamento de transações financeiras, desenvolvida como um desafio de backend. A API permite registrar transações e consultar estatísticas em tempo real sobre as operações realizadas no último minuto. O foco principal foi a criação de um código limpo, eficiente e bem documentado, seguindo as melhores práticas de desenvolvimento com Spring Boot.

## ✨ Funcionalidades

-   `POST /transacao`: Registra uma nova transação.
-   `DELETE /transacao`: Limpa o registro de todas as transações.
-   `GET /estatistica`: Retorna as estatísticas (`soma`, `média`, `mínimo`, `máximo` e `contagem`) de todas as transações realizadas nos últimos 60 segundos.

## 🚀 Tecnologias Utilizadas

-   **Java 17**: Versão LTS mais recente da linguagem.
-   **Spring Boot 3**: Framework principal para a criação da aplicação e da API REST.
-   **Maven**: Gerenciador de dependências e build do projeto.
-   **Spring Web**: Para a criação dos controllers e endpoints RESTful.
-   **Jakarta Bean Validation**: Para a validação dos dados de entrada nos DTOs.
-   **SpringDoc OpenAPI (Swagger)**: Para a geração automática de documentação interativa da API.
-   **JUnit 5**: Para a implementação de testes unitários e de integração.

## 🏛️ Arquitetura e Conceitos Aplicados

-   **Arquitetura em Camadas**: O projeto é dividido em `Controller`, `Service`, `Model` e `DTO` para garantir a separação de responsabilidades e um código mais organizado.
-   **Padrão DTO (Data Transfer Object)**: Utilizado para desacoplar a representação interna dos dados (`Model`) da representação externa que a API expõe (`Request`/`Response`).
-   **Injeção de Dependências**: Utilizada extensivamente pelo Spring para gerenciar os componentes da aplicação.
-   **Processamento com Java Streams**: A lógica de cálculo das estatísticas foi implementada de forma funcional e performática utilizando a Stream API.
-   **Armazenamento em Memória**: As transações são armazenadas em uma fila concorrente (`ConcurrentLinkedQueue`) para garantir segurança em ambientes com múltiplas threads (requisições simultâneas).

## 📚 Documentação e Teste da API (Swagger UI)

Após iniciar a aplicação, a documentação interativa do Swagger UI estará acessível no seu navegador através do seguinte link:

➡️ [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

Pela interface do Swagger, você pode ler a documentação de cada endpoint e testá-los diretamente, sem a necessidade de ferramentas como o Postman.
