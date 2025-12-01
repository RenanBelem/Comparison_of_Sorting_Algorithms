import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("Iniciando Sistema");
        System.out.println("=================");

        // Dependencias
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        final Object[][] table = new String[7][];
        table[0] = new String[] { "Algoritmo", "Quase ordenado", "Desordenado", "Ordem decrescente"};


        // O tamanho do array deverá ser fornecido pelo usuário
        System.out.println("Informe o tamanho do array (Deve ser um inteiro):");
        int tamanhoConjunto = sc.nextInt();

        if (tamanhoConjunto <= 0 ){
            System.out.println("Tamanho do array deve ser maior do que 0");
            System.exit(1);
        }

        // Conjuntos quase ordenados: possui apenas 5% a 10% das chaves fora de posição.
        int[] conjuntoQuaseOrdenado = new int[tamanhoConjunto];
        for (int x = 1; x <= tamanhoConjunto; x++){
            int valor = x;

            // A cada 10 números gera um random
            if (x % 10 == 0){
                valor = rn.nextInt();
            }
            conjuntoQuaseOrdenado[x - 1] = valor;
        }

        // Conjuntos totalmente desordenados
        int[] conjuntoDesordenado = new int[tamanhoConjunto];
        for (int x = 0; x < tamanhoConjunto; x++){
            conjuntoDesordenado[x] = rn.nextInt();
        }

        // Conjuntos ordenados em ordem decrescente
        int[] conjuntoDecrescente = new int[tamanhoConjunto];
        int valorDecrescente = tamanhoConjunto;
        for (int x = 0; x < tamanhoConjunto; x++){
            conjuntoDecrescente[x] = valorDecrescente;
            valorDecrescente -= 1;
        }

        // Arrays a serem ordenados
        //System.out.println(Arrays.toString(conjuntoQuaseOrdenado));
        //System.out.println(Arrays.toString(conjuntoDesordenado));
        //System.out.println(Arrays.toString(conjuntoDecrescente));


        // Quick Sort
        String[] quickSortTime = new String[4];

        QuickSort quickSort = new QuickSort();
        quickSortTime[0] = quickSort.sort(conjuntoQuaseOrdenado.clone());
        quickSortTime[1] = quickSort.sort(conjuntoDesordenado.clone());
        quickSortTime[2] = quickSort.sort(conjuntoDecrescente.clone());

        table[1] = new String[] { "Quick Sort", quickSortTime[0], quickSortTime[1], quickSortTime[2]};

        // Shell Sort
        String[] shellSortTime = new String[4];

        ShellSort shellSort = new ShellSort();
        shellSortTime[0] = shellSort.sort(conjuntoQuaseOrdenado.clone());
        shellSortTime[1] = shellSort.sort(conjuntoDesordenado.clone());
        shellSortTime[2] = shellSort.sort(conjuntoDecrescente.clone());

        table[2] = new String[] { "Shell Sort", shellSortTime[0], shellSortTime[1], shellSortTime[2]};

        // Heap Sort
        String[] heapSortTime = new String[4];

        HeapSort heapSort = new HeapSort();
        heapSortTime[0] = heapSort.sort(conjuntoQuaseOrdenado.clone());
        heapSortTime[1] = heapSort.sort(conjuntoDesordenado.clone());
        heapSortTime[2] = heapSort.sort(conjuntoDecrescente.clone());

        table[3] = new String[] { "Heap Sort", heapSortTime[0], heapSortTime[1], heapSortTime[2]};

        // Selection Sort
        String[] selectionSortTime = new String[4];

        SelectionSort selectionSort = new SelectionSort();
        selectionSortTime[0] = selectionSort.sort(conjuntoQuaseOrdenado.clone());
        selectionSortTime[1] = selectionSort.sort(conjuntoDesordenado.clone());
        selectionSortTime[2] = selectionSort.sort(conjuntoDecrescente.clone());

        table[4] = new String[] { "Selection Sort", selectionSortTime[0], selectionSortTime[1], selectionSortTime[2]};

        // Insertion Sort
        String[] insertionSortTime = new String[4];

        InsertionSort insertionSort = new InsertionSort();
        insertionSortTime[0] = insertionSort.sort(conjuntoQuaseOrdenado.clone());
        insertionSortTime[1] = insertionSort.sort(conjuntoDesordenado.clone());
        insertionSortTime[2] = insertionSort.sort(conjuntoDecrescente.clone());

        table[5] = new String[] { "Insertion Sort", insertionSortTime[0], insertionSortTime[1], insertionSortTime[2]};

        // Merge Sort
        String[] mergeSortTime = new String[4];

        MergeSort mergeSort = new MergeSort();
        mergeSortTime[0] = mergeSort.sort(conjuntoQuaseOrdenado.clone());
        mergeSortTime[1] = mergeSort.sort(conjuntoDesordenado.clone());
        mergeSortTime[2] = mergeSort.sort(conjuntoDecrescente.clone());

        table[6] = new String[] { "Merge Sort", mergeSortTime[0], mergeSortTime[1], mergeSortTime[2]};


        // Printa em formato de tabela
        System.out.println("_______________________________________________________________________________________");
        System.out.println("Tamanho do Conjunto: " + tamanhoConjunto);
        System.out.println("_______________________________________________________________________________________");
        System.out.format("%70s%n", "Tempos obtidos pelos algoritmos");
        System.out.println("_______________________________________________________________________________________");
        for (final Object[] row : table) {
            System.out.format("%20s |%20s |%20s |%20s |%n", row);
        }
        System.out.println("_______________________________________________________________________________________");
    }
}
