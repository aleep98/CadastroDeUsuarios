# Sistema de Gerenciamento de Usuários

Este é um projeto simples em Java para gerenciar um cadastro de usuários via terminal. O sistema permite adicionar, visualizar e remover usuários, mantendo os dados em memória durante a execução.

## Funcionalidades

O aplicativo exibe um menu interativo com as seguintes opções:

*   **1 - Cadastrar Usuário**: Permite inserir nome, email e idade de um novo usuário.
*   **2 - Listar Usuários**: Exibe a lista de todos os usuários cadastrados com seus respectivos índices.
*   **3 - Remover Usuário**: Remove um usuário da lista com base no índice informado.
*   **0 - Sair**: Encerra a execução do programa.

## Estrutura do Projeto

*   `src/User.java`: Classe que define o modelo do usuário (atributos: nome, email, idade).
*   `src/App.java`: Classe principal que contém o método `main`, inicializa o menu e gerencia a lista de usuários.

## Pré-requisitos

*   Java Development Kit (JDK) instalado.

## Como Executar

1.  Abra o terminal e navegue até a pasta `src` do projeto:
    ```bash
    cd src
    ```

2.  Compile os arquivos Java:
    ```bash
    javac App.java User.java
    ```

3.  Execute a aplicação:
    ```bash
    java App
    ```