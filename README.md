# Conversor de Moedas

## Descrição

Este projeto é um desafio de programação que implementa um conversor de moedas. O aplicativo permite aos usuários converter valores entre diferentes moedas, utilizando taxas de câmbio atualizadas em tempo real.

## Funcionalidades

- Conversão entre várias moedas, incluindo:
  - Real (BRL) para Dólar (USD)
  - Dólar (USD) para Euro (EUR)
  - Euro (EUR) para Real (BRL)
  - E outras combinações
- Utilização de uma API externa para obter taxas de câmbio atualizadas
- Interface de linha de comando interativa

## Tecnologias Utilizadas

- Java
- API de taxas de câmbio (ExchangeRate-API)

## Como Usar

1. Clone o repositório
2. Configure a chave da API no arquivo `ExchangeRateAPI.java`
3. Compile e execute o programa
4. Siga as instruções na tela para realizar conversões

## Configuração da API

Este projeto utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/). Para usar o conversor, você precisa:

1. Registrar-se no site da API para obter uma chave gratuita
2. Inserir sua chave no arquivo `ExchangeRateAPI.java`

## Estrutura do Projeto

- `Main.java`: Ponto de entrada do programa
- `CurrencyConverter.java`: Lógica principal do conversor
- `ExchangeRateAPI.java`: Integração com a API de taxas de câmbio
- `CurrencyPair.java`: Representa pares de moedas para conversão

