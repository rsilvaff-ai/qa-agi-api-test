# Dog API QA Tests# Dog API QA Tests

Este projeto contém testes automatizados para a **Dog API** utilizando **Java**, **JUnit 5**, **RestAssured** e **ExtentReports**.

---

## Estrutura do Projeto


qa-agi-api-test/
├─ src/
│ ├─ main/
│ │ └─ java/
│ └─ test/
│ ├─ java/
│  └─ tests/ # Classes de teste
│  ├─ BreedsListTest.java
│  ├─ BreedImagesTest.java
│  └─ RandomImageTest.java
├─ target/ # Pasta de saída do Maven
│ └─ ExtentReport.html # Relatório gerado pelos testes
├─ pom.xml # Configurações do Maven
└─ README.md


---

## Dependências do Projeto

Principais bibliotecas utilizadas:

- **JUnit 5** – Framework de testes
- **RestAssured** – Testes de APIs REST
- **Jackson** – Processamento de JSON
- **ExtentReports** – Relatórios HTML interativos
- **Lombok** – Redução de boilerplate em Java

> Todas as dependências estão configuradas no `pom.xml` do Maven.

---

## Como Executar os Testes

No terminal, dentro da pasta do projeto, execute:
mvn clean test

Isso irá:
Limpar a pasta target.
Compilar o código do projeto.
Executar todos os testes.
Gerar o relatório em HTML (ExtentReport.html).
Relatório de Execução

---
## Após executar os testes, o relatório HTML será gerado automaticamente em:

target/ExtentReport.html
Como abrir o relatório

Você pode abrir o relatório de três maneiras:

1. Diretamente pelo navegador
Navegue até a pasta target.
Clique duas vezes em ExtentReport.html.
Ele será aberto no navegador padrão.

2. Abrir manualmente pelo navegador
Abra o navegador.
Pressione Ctrl + O (ou Cmd + O no Mac).
Selecione o arquivo ExtentReport.html.

3. Abrir pelo VS Code
Abra a pasta do projeto no VS Code.
Clique com o botão direito em ExtentReport.html.
Escolha Open with Default Browser.

## O que o relatório mostra
Lista completa de testes executados.
Status de cada teste: Pass / Fail.
Logs detalhados de execução.
Dashboard com:
Total de testes executados
Testes passados e falhados
Tempo de execução
Timeline de execução
Gráficos de eventos