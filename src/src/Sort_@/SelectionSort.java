public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for (int j = i; j < n; j++) { 
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
