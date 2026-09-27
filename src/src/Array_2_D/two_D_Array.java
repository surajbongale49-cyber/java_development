import java.util.Scanner;
public class two_D_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int n=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the Array Element :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Array Element are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
