## Comparação de Algoritmos de Ordenação em Java

Este projeto implementa e compara a performance de seis algoritmos de ordenação (Quick Sort, Shell Sort, Heap Sort, Selection Sort, Insertion Sort e Merge Sort) em Java, avaliando seu tempo de execução em diferentes tipos de conjuntos de dados.

---

## ⚙️ Algoritmos de Ordenação (Implementações)

Cada arquivo `.java` contém a lógica de um algoritmo de ordenação, encapsulada em um método `sort(int[] vetor)` que mede e retorna o tempo de execução em segundos.

### `QuickSort.java`

* Implementa o algoritmo **Quick Sort** de forma recursiva.
* Utiliza a técnica de **particionamento** para dividir o array em sub-arrays menores com base em um pivô.

### `ShellSort.java`

* Implementa o algoritmo **Shell Sort**.
* É uma extensão do Insertion Sort, mas compara elementos separados por um **intervalo (gap)** que é gradualmente reduzido.

### `HeapSort.java`

* Implementa o algoritmo **Heap Sort**.
* Constrói uma estrutura de dados **Max Heap** e, em seguida, extrai iterativamente o elemento máximo (a raiz) e o insere no final do array ordenado. 

### `SelectionSort.java`

* Implementa o algoritmo **Selection Sort**.
* Percorre repetidamente o array para encontrar o **elemento mínimo** e o troca de lugar com o elemento na primeira posição não ordenada.

### `InsertionSort.java`

* Implementa o algoritmo **Insertion Sort**.
* Constrói a lista final ordenada um item de cada vez, pegando os elementos da parte não ordenada e **inserindo-os na posição correta** da parte ordenada.

### `MergeSort.java`

* Implementa o algoritmo **Merge Sort** de forma recursiva.
* Segue a estratégia **Dividir para Conquistar**, dividindo o array em metades até que cada sub-array contenha um único elemento, e depois os **combina (merge)** de volta em ordem.

---

## 📊 Classe Principal (`Main.java`)

A classe `Main` é responsável por configurar o ambiente de teste, gerar os conjuntos de dados e coordenar a execução e comparação dos algoritmos.

### Geração dos Conjuntos de Dados

O programa solicita o **tamanho do array** ao usuário e cria três variações do conjunto para teste:

1.  **Quase Ordenado:** Contém a maioria das chaves em ordem crescente, com uma pequena porcentagem de valores fora de posição.
2.  **Totalmente Desordenado:** Todos os elementos são números inteiros aleatórios.
3.  **Ordem Decrescente:** Todos os elementos estão em ordem decrescente, do maior valor para o menor.

### Teste e Comparação

* Cada algoritmo de ordenação é executado em cópias clonadas dos três conjuntos de dados.
* O tempo de execução é medido e registrado.
* Os resultados finais são exibidos em um formato de tabela, comparando o tempo de todos os algoritmos nos três cenários de entrada.

---

## 📝 Relatório de Análise (`Relatório.pdf`)

O relatório contém a análise da performance dos algoritmos, destacando observações importantes sobre a sua complexidade e desempenho em diferentes cenários de entrada.

### Resultados Chave da Análise

| Algoritmo | Desempenho em Arrays Grandes | Cenário de Pior Caso | Observações |
| :--- | :--- | :--- | :--- |
| **Quick Sort** | Extremamente rápido | Array em **Ordem Decrescente** | Para conjuntos decrescentes acima de um certo tamanho (aproximadamente $15.000$ números), pode ocorrer um **estouro de pilha** (*Stack Overflow*) devido à sua natureza recursiva. |
| **Shell Sort** | Muito rápido | — | Mantém um bom desempenho em todos os conjuntos. |
| **Heap Sort** | Muito rápido | — | Mantém um bom desempenho em todos os conjuntos. |
| **Merge Sort** | Muito rápido | — | Mantém um bom desempenho em todos os conjuntos. |
| **Selection Sort** | Muito lento | Array Quase Ordenado e Desordenado | É consistentemente o mais lento, mostrando um crescimento acentuado no tempo de execução em grandes conjuntos não ordenados. |
| **Insertion Sort** | Lento | Array em Ordem Decrescente | Tem um desempenho inferior em arrays grandes, especialmente quando o array está em ordem decrescente, o que dificulta a sua ordenação valor a valor. |

Os algoritmos **Quick, Shell, Heap e Merge Sort** são os mais eficientes e rápidos para grandes volumes de dados. Os algoritmos **Selection Sort** e **Insertion Sort** são significativamente mais lentos, principalmente em conjuntos desordenados ou grandes.
