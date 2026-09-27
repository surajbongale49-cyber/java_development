// import java.util.Scanner;
public class Remove_duplicate {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int[] arr = {33, 21, 33, 2, 2, 33, 5, 6, 7, 21};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int j = 0;
        int count = 1;
        // Count unique elements
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }

        int[] brr = new int[count];
        brr[j] = arr[0];
        j++;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                brr[j] = arr[i + 1];
                j++;
            }
        }

        System.out.println();
        System.out.println("After Removing Duplicated Element :");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}