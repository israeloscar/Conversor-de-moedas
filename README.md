# 💱 ConversorMoedas

Projeto de estudo em Java para praticar lógica de programação, `switch`, métodos e formatação de saída, através de um conversor de moedas via linha de comando (CLI).

## 📋 Sobre o projeto

O programa permite converter valores entre três moedas: **Dólar**, **Euro** e **Real**. O usuário escolhe a moeda de origem em um menu principal, depois a moeda de destino em um submenu, informa o valor e recebe o resultado convertido.

## 🧠 Conceitos praticados

- `Scanner` para entrada de dados
- `switch` aninhado (menu + submenu)
- Métodos com parâmetros e retorno (`static double conversor(...)`)
- Constantes (`static final`)
- Formatação de saída com `String.format`
- Tratamento de opção inválida com `default`
- Loop com `do-while` para repetir o menu, com saída controlada via `boolean`
- Validação de entrada com `try-catch` (`NumberFormatException`) e valor sentinela
- `HashMap<String, Double>` para armazenar as cotações (chave = moeda, valor = cotação)

## ⚙️ Como funciona a conversão

Todas as cotações são definidas em relação ao **Real**, usado como "moeda-ponte", e armazenadas num `HashMap<String, Double>` (chave = nome da moeda, valor = cotação):

```java
static final Map<String, Double> cotacoes = new HashMap<>();
// preenchido no main():
cotacoes.put("Dólar", 5.20);
cotacoes.put("Euro", 6.07);
cotacoes.put("Real", 1.00);
```

O método `conversor` faz a conversão em dois passos, buscando as cotações no mapa:

1. Multiplica o valor pela cotação de origem (→ transforma em Reais)
2. Divide o resultado pela cotação de destino (→ transforma na moeda final)

```java
public static double conversor(double valor, double cotacaoOrigem, double cotacaoDestino) {
    double valorMultiplicado = valor * cotacaoOrigem;
    return valorMultiplicado / cotacaoDestino;
}

// chamada, por exemplo:
conversor(numDolares, cotacoes.get("Dólar"), cotacoes.get("Euro"));
```

## ▶️ Como executar

1. Clone o repositório
2. Abra no IntelliJ IDEA (ou outra IDE de sua preferência)
3. Execute a classe `Main`
4. Siga o menu interativo no terminal

## 📌 Status atual

- [x] Estrutura do menu principal e submenu
- [x] Conversão a partir do Dólar (Dólar → Euro, Dólar → Real)
- [x] Conversão a partir do Euro (Euro → Dólar, Euro → Real)
- [x] Conversão a partir do Real (Real → Dólar, Real → Euro)
- [x] Formatar todas as saídas com 2 casas decimais (`String.format("%.2f", ...)`)
- [x] Tratar opção inválida em todos os menus com `default`
- [x] Fazer o menu repetir com `do-while`, com opção "0 - Sair" para encerrar
- [x] Adicionar validação de entrada (métodos `lerInteiros`/`lerDoubles` com try-catch e valor sentinela `-1`)
- [x] Extrair as cotações para um `HashMap<String, Double>` (moeda → valor), deixando o código mais escalável

## 🚀 Próximos passos (melhorias futuras)

- Adicionar a Libra como quarta moeda (agora só precisa de um `cotacoes.put("Libra", ...)` e um novo `case` no menu)
- Guardar um histórico das conversões feitas na sessão
- (Avançado) Buscar cotações reais via API externa, em vez de valores fixos

## 🛠️ Tecnologias

- Java
- IntelliJ IDEA Community Edition