public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] array = {9,8,7,5,6,1};
        insertionSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
