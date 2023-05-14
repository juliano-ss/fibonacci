# Programa Fibonacci em Java

Este programa verifica se um número fornecido pertence à sequência de Fibonacci.

## Como usar

1. Compile o arquivo `Fibonacci.java` usando o seguinte comando:
    ```
    javac Fibonacci.java
    ```

2. Execute o programa compilado usando o seguinte comando:
    ```
    java Fibonacci
    ```

3. Digite um número quando solicitado.

4. O programa mostrará se o número digitado pertence ou não à sequência de Fibonacci.

## Explicação do código

O programa primeiro solicita ao usuário que digite um número usando a classe `Scanner`.

Ele então usa um loop `while` para gerar a sequência de Fibonacci até que o próximo número seja maior ou igual ao número digitado. Se o número digitado for encontrado na sequência, o programa exibe uma mensagem dizendo que ele pertence à sequência de Fibonacci. Caso contrário, exibe uma mensagem dizendo que não pertence à sequência.

O programa faz uso das seguintes variáveis:
- `numero`: o número digitado pelo usuário
- `anterior`: o número anterior na sequência
- `atual`: o número atual na sequência
- `proximo`: o próximo número na sequência.
