import java.util.Scanner;
public class sum_arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("for 1st matrix:");
        System.out.println("Enter the 1st Number :");
        int n=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int m=sc.nextInt();
        System.out.println("for 2nd matrix:");
        System.out.println("Enter the 1st Number :");
        int p=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int q=sc.nextInt();

        int[][] arr=new int[n][m];
        int[][] brr=new int[p][q];
        System.out.println("Enter the Element of the 1st Array :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Element of the Second Array :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("1st Matrix :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2nd Matrix :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The addition of this two matrix are :");
        for(int i=0;i<n;i++){
            for(int j=0;j<q;j++){
                System.out.print(arr[i][j]+brr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
