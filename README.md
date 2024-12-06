# Projeto Conta Terminal

Este é um projeto simples em Java que simula a criação de uma conta bancária, permitindo ao usuário fornecer informações como número da conta, agência, nome do cliente e saldo inicial. O programa pode receber essas informações tanto por **argumentos de linha de comando** quanto por **entrada interativa via terminal**.

## Funcionalidades

- O programa solicita as seguintes informações do usuário:
  - Número da conta
  - Número da agência (sem o hífen)
  - Nome do cliente
  - Valor do depósito inicial

- O programa exibe as informações inseridas pelo usuário e exibe uma mensagem de confirmação com os dados fornecidos.

## Como Executar

### 1. Compilação do código

Para compilar o projeto, use o comando:

```bash
javac Main.java ContaTerminal.java
```

### 2. Execução com argumentos de linha de comando

Para executar o programa com todos os dados passados como argumentos, use o seguinte comando:

```bash
java Main <numeroConta> <agenciaConta> <nomeCliente> <saldoConta>
```

Exemplo: 
```bash
java Main 12345 001 "Gustavo Vitali" 1000.50
```

### 3. Execução sem argumentos

Se você não fornecer todos os argumentos na linha de comando, o programa solicitará que você insira as informações no terminal:

```bash
java Main
```

## Estrutura do Código

- Main.java: Contém a lógica principal do programa, onde os dados são lidos do terminal ou argumentos e exibidos ao usuário.
- ContaTerminal.java: Contém a definição da classe ContaTerminal, que representa a conta bancária, com os atributos necessários (número da conta, agência, nome do cliente, saldo).

## Requisitos
- JDK 8 ou superior.
- Acesso ao terminal ou linha de comando.
