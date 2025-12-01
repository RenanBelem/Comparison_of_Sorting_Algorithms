public class QuickSort {

    // Referência: https://www.baeldung.com/java-quicksort

    public String sort(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();
        quickSort(vetor, 0, vetor.length - 1);
        long tempoFinal = System.currentTimeMillis();
        return String.valueOf((tempoFinal - tempoInicial) / 1000F)+'s';
    }

    public void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}


// recebe um valor do tamanho da função recursiva
// ex: 5. 10010, 10100, 11100...

// função (valor, indice) sendo que indice começa com 0
// a cada vez que a função é executada vc pega valor[indice]
// se esse valor[indice] = 0 -> contadorDeZero++
// se esse valor[indice] = 1 -> contadorDeUm++
// depois que a função terminar vc voce
