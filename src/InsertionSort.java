public class InsertionSort {

    // Referência: https://www.javatpoint.com/insertion-sort-in-java

    public String sort(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();
        insertionSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        return String.valueOf((tempoFinal - tempoInicial) / 1000F)+'s';
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
