public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int tmp = 0;
            for (int j = i + 1 ; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    tmp = j;
                }
            }
            if (tmp != 0) {
                array[tmp] = array[i];
                array[i] = min;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,8,7,5,6,1};
        selectionSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
