# 🏗️ Project Board - Gerenciador de Quadros Kanban

Um sistema para gerenciar quadros Kanban (boards), colunas e cards, desenvolvido em **Java** com **Spring Boot** e **Angular** (apresentado como simulação). Inclui persistência em banco de dados MySQL com migrações via Liquibase.

## 🛠️ Tecnologias
- **Backend:** Java 17, Spring Boot, JDBC, MySQL.
- **Gerenciamento de DB:** Liquibase para migrações.
- **Arquitetura:** Camadas (DTOs, DAOs, Services, UI).
- **Transações:** Commit/Rollback manual para consistência.

## 📂 Estrutura do Projeto

dio.me.project_board/

├── **dto/** `# Data Transfer Objects (BoardDetailsDTO, CardDetailsDTO)`

├── **exception/** `# Exceções personalizadas (CardBlockedException, ...)`

├── **persistence/**

│ ├── **config/** `# Configurações de conexão (ConnectionConfig)`

│ ├── **converter/** `# Conversores (OffsetDateTimeConverter)`

│ ├── **dao/** `# Data Access Objects (BoardDAO, CardDAO)`

│ ├── **entity/** `# Entidades (BoardEntity, CardEntity)`

│ └── **migration/** `# Migrações Liquibase`

├── **service/** `# Lógica de negócio (BoardService, CardService)`

└── **ui/** `# Interface do usuário (MainMenu, BoardMenu)`


## 🚀 Funcionalidades
- **Boards:**
  - Criar, excluir e visualizar boards.
  - Colunas padrão: `INITIAL`, `PENDING`, `FINAL`, `CANCEL`.
- **Cards:**
  - Criar, mover entre colunas, bloquear/desbloquear e cancelar.
  - Validações: Impede mover cards bloqueados ou finalizados.
- **Transações:** Rollback automático em caso de erros.

## ⚙️ Configuração
1. **Banco de Dados:**
   - Crie um database `board` no MySQL.
   - Configure credenciais em `ConnectionConfig.java` e `liquibase.properties`.
2. **Migrações:**
   - O Liquibase executa automaticamente as migrações ao iniciar (`MigrationStrategy`).

## 🎯 Exemplo de Uso
```java
public static void main(String[] args) throws SQLException {
    new MainMenu().execute(); // Inicia o menu interativo
}
```
## 📌 Regras de Negócio
- Cards não podem ser movidos se estiverem bloqueados (CardBlockedException).
- Cards em colunas FINAL ou CANCEL não podem ser alterados (CardFinishedException).
- Todas as operações são transacionais (atomicidade).


---

### **Próxima Pergunta (se desejar continuar):**
**Pergunta 8: Sobre Validações de Negócio**  
No método `moveToNextColumn` do `CardService`, quais são as validações realizadas antes de mover um card? Por que elas são importantes?

Aguardo sua resposta! 😊
