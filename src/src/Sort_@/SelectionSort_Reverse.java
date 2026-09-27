public class SelectionSort_Reverse {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
