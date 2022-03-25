public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9,8,7,5,6,1};
        bubbleSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
