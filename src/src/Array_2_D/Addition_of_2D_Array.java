
import java.util.Scanner;
public class Addition_of_2D_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int n=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int m=sc.nextInt();
        System.out.println("Enter the 3rd Number :");
        int p=sc.nextInt();
        System.out.println("Enter the 4th Number :");
        int q=sc.nextInt();
        int[][] arr=new int[n][m];
        int[][] brr=new int[p][q];
        System.out.println("Enter the 1st matrix Element :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix Element :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The 1st Array Element are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the 2nd Array Element are :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Addition of this two matrix are :");
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                System.out.print(arr[i][j]+brr[i][j]+" ");
            }
            System.out.println();
        }

    }

}

