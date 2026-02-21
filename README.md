# Projeto TrueUnion

## Visão Geral

TrueUnion é uma plataforma de gestão de casamentos voltada para cerimonialistas, que facilita a busca e negociação com fornecedores de serviços (buffet, decoração, fotografia, organização de festa, entre outros). O sistema permite que cerimonialistas publiquem casamentos, recebam propostas de fornecedores, façam contra-propostas, gerenciem contratos e acompanhem avaliações e reputação de todos os envolvidos.

---

## Tecnologias Utilizadas

### Backend
- **Java 17+**  
- **Spring Boot** (API RESTful)  
- **Spring Security** (autenticação e autorização)  
- **JWT (JSON Web Tokens)** para controle seguro de sessões  
- **PostgreSQL** como banco de dados relacional  
- Utilização de **views, stored procedures e triggers** para garantir integridade, auditoria e performance no banco

### Frontend
- **React** (biblioteca principal para UI)  
- **JavaScript (ES6+)**  
- **HTML5 e CSS3** para estrutura e estilo  
- Integração com API REST do backend para comunicação e dados  

---

## Estrutura do Projeto

- `/backend` - código-fonte do backend em Java com Spring Boot  
- `/frontend` - código-fonte do frontend em React  
- `/docs` - documentação do projeto (modelagem, regras de negócio, etc)  

---

## Funcionalidades Principais

- Cadastro e autenticação de usuários (cerimonialistas e fornecedores)  
- Publicação e gerenciamento de casamentos  
- Busca e visualização de fornecedores e seus portfólios  
- Envio, aceitação e negociação de propostas e contra-propostas  
- Formalização de contratos digitais  
- Sistema de avaliação pós-serviço  
- Controle de acessos e perfis de usuários via Spring Security e JWT  
- Logs e auditoria no banco para rastrear alterações e garantir segurança  

---

## Como Rodar o Projeto

### Backend

1. Instale o Java 17 (ou superior) e Maven.  
2. Configure o PostgreSQL e crie um banco de dados para o sistema.  
3. Atualize o arquivo `application.properties` com as credenciais do banco.  
4. Execute no terminal:
   ```bash
   mvn clean install
   mvn spring-boot:run

O backend estará disponível em http://localhost:8080.

Frontend

Instale Node.js (versão 16 ou superior recomendada).

Na pasta /frontend, instale as dependências:

npm install

Inicie o servidor de desenvolvimento:

npm start

O frontend estará disponível em http://localhost:3000.

Organização do Time e Fluxo de Trabalho

Cada desenvolvedor deve criar sua branch para novas funcionalidades e correções.

Uso do GitHub para controle de versão e pull requests para revisão de código.

Uso do Trello para gerenciamento das tarefas com prazos definidos.

Comunicação via grupo WhatsApp para dúvidas rápidas e alinhamentos.
