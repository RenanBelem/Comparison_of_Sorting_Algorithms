public class SelectionSort {

    // Referência: https://www.javatpoint.com/selection-sort-in-java

    public String sort(int[] vetor) {
        long tempoInicial = System.currentTimeMillis();
        selectionSort(vetor);
        long tempoFinal = System.currentTimeMillis();
        return String.valueOf((tempoFinal - tempoInicial) / 1000F)+'s';
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
