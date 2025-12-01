public class ShellSort {
    // Referência: https://www.baeldung.com/java-shell-sort

    public String sort(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();
        shellSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        return String.valueOf((tempoFinal - tempoInicial) / 1000F)+'s';
    }

    public void shellSort(int[] arrayToSort) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }
}
