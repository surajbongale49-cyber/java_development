import java.util.Scanner;
public class Multiplication_of_two_matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int p=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int q=sc.nextInt();
        System.out.println("Enter the 3rd Number :");
        int r=sc.nextInt();
        System.out.println("Enter the 4th Number :");
        int s=sc.nextInt();
        int[][] arr=new int[p][q];
        int[][] brr=new int[r][s];
        int[][] res=new int[p][s];
        System.out.println("Enter the 1st matrix Element :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd matrix Element :");
        for(int i=0;i<r;i++){
            for(int j=0;j<s;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix Multiplication is :");
        for(int i=0;i<p;i++){
            for(int j=0;j<s;j++){
                res[i][j]=0;
                for(int k=0;k<q;k++){
                    res[i][j]+=arr[i][k]*brr[k][j];
                }
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<s;j++){
        System.out.print(res[i][j]+" ");
            }
            System.out.println();

        }

    }
}
