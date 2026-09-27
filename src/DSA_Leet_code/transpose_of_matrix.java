import java.util.Scanner;
public class transpose_of_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of row :");
        int n=sc.nextInt();
        System.out.println("Enter the no of colmns:");
        int m=sc.nextInt();
        System.out.println("Enter the Array Element :");
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the Array is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose of array is :");
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
