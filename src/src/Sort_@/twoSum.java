static void twoSum(int[] arr, int target) {
    int j = 0;
    int i = arr.length - 1;

    while (j < i) {
        int sum = arr[j] + arr[i];

        if (sum == target) {
            System.out.println("Pair Found: " + arr[j] + " " + arr[i]);
            return;
        }
        else if (sum < target) {
            j++;   // sum badhane ke liye
        }
        else {
            i--;   // sum ghatane ke liye
        }
    }

    System.out.println("No Pair Found");
}
