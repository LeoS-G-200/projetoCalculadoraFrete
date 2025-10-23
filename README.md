# Projeto Calculadora de Frete (Padrão Strategy)

Este projeto demonstra o uso do padrão Strategy em Java para calcular valores de frete com diferentes estratégias.

## Visão geral

O projeto inclui três estratégias de exemplo implementadas em `src/Main.java`:

- `Sedex` — multiplica o peso por 1.45 e soma ao valor do pedido.
- `Pac` — multiplica o peso por 1.10 e soma ao valor do pedido.
- `FreteGratis` — se o `valor` do pedido for maior que 200, retorna frete gratuito (0.0); caso contrário, imprime uma mensagem e aplica um cálculo fallback.

O `Main` demonstra o uso de `FreteContext` para alternar entre estratégias em tempo de execução.

## Requisitos

- JDK 8 ou superior (recomenda-se JDK 11+).
- Ferramentas de linha de comando Java (`javac` e `java`) no PATH.
- Windows — instruções abaixo estão adaptadas para PowerShell.

## Como compilar e rodar (PowerShell)

Abra o PowerShell na raiz do projeto (`e:\projeto calculadora de frete strategy\projetoCalculadoraFrete`) e execute:

```powershell
# Compilar
javac -d out src\Main.java

# Rodar
java -cp out Main
```

Alternativa (compilar na pasta corrente):

```powershell
javac src\Main.java -d .
java Main
```

## Exemplo de saída

Ao executar `Main`, você deve ver algo parecido com:

```
Frete Sedex: 164.5
Frete Pac: 160.0
Frete Gratis: 0.0
```

Os valores podem variar conforme os parâmetros de peso/valor usados no `Main`.

## Estrutura do projeto

- `src/Main.java` — implementação do padrão Strategy e `main` de exemplo.
- `lib/` — pasta para dependências (se houver).
