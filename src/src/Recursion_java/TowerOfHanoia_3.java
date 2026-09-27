public class  TowerOfHanoia_3 {

    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }

    private static void hanoi(int n, char src, char helper, char dest) {

        // Base case
        if (n == 1) {
            System.out.println(src + " -> " + dest);
            return;
        }

        // Move n-1 disks from source to helper
        hanoi(n - 1, src, dest, helper);

        // Move the largest disk to destination
        System.out.println(src + " -> " + dest);
 
        // Move n-1 disks from helper to destination
        hanoi(n - 1, helper, src, dest);
    }
}
