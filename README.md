# TrueUnion

## Descrição

**TrueUnion** é uma plataforma que conecta cerimonialistas e fornecedores de serviços para casamentos. Facilita a negociação, gestão de contratos e avaliações, garantindo segurança e profissionalismo para organizar eventos com eficiência e transparência, tudo em um sistema integrado e fácil de usar.

---

## Visão Geral

TrueUnion é uma plataforma de gestão de casamentos focada em cerimonialistas, que permite encontrar fornecedores confiáveis, negociar serviços, formalizar contratos e acompanhar avaliações. Fornecedores têm páginas próprias com portfólio, avaliações e agenda.

---

## Tecnologias Utilizadas

### Backend
- Java 17+
- Spring Boot (API RESTful)
- Spring Security (autenticação e autorização)
- JWT (JSON Web Tokens)
- PostgreSQL (com views, procedures e triggers para integridade e auditoria)

### Frontend
- React
- JavaScript (ES6+)
- HTML5 e CSS3

---

## Estrutura do Projeto

- `/backend` - código fonte do backend em Java com Spring Boot  
- `/frontend` - código fonte do frontend em React  
- `/docs` - documentação do projeto (modelagem, regras de negócio, etc)

---

## Funcionalidades Principais

- Cadastro e autenticação de usuários (cerimonialistas e fornecedores)  
- Publicação e gerenciamento de casamentos  
- Busca e visualização de fornecedores e seus portfólios  
- Envio, aceitação e negociação de propostas e contra-propostas  
- Formalização de contratos digitais  
- Sistema de avaliação pós-serviço  
- Controle de acesso com Spring Security e JWT  
- Logs e auditoria no banco para rastrear alterações e garantir segurança

---

## Como Rodar o Projeto

### Backend

1. Instale Java 17+ e Maven.  
2. Configure PostgreSQL e crie o banco de dados.  
3. Atualize `application.properties` com as credenciais do banco.  
4. No terminal:
   ```bash
   mvn clean install
   mvn spring-boot:run

Backend disponível em http://localhost:8080.

Frontend

Instale Node.js (v16+ recomendado).

Na pasta /frontend:

npm install
npm start

Frontend disponível em http://localhost:3000.

Organização do Time e Fluxo de Trabalho

Cada desenvolvedor cria sua branch para funcionalidades e correções.

Uso do GitHub para controle de versão e pull requests para revisão.

Trello para gerenciamento de tarefas com prazos definidos.

Comunicação via WhatsApp para dúvidas rápidas e alinhamentos.
