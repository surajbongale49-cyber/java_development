import java.util.Scanner;
public class Substraction_of_two_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int p=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int q=sc.nextInt();
        int[][] arr=new int[p][q];
        int[][] brr=new int[p][q];
        int[][] res=new int[p][q];
        System.out.println("Enter the 1st matrix Element :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
             arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Eneter the 2nd matrix Element :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Substraction of the two matrix are :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                res[i][j]=arr[i][j]-brr[i][j];
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }

}
