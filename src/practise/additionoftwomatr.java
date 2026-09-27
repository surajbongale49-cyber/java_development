import java.util.*;
public class additionoftwomatr {
    public static int[][] call(int[][] arr,int[][] brr,int p,int s){
        int[][] res=new int[p][s];
        for(int i=0;i<p;i++){
            for(int j=0;j<s;j++){
                res[i][j]=arr[i][j]+brr[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //for 1st matrix
        System.out.println("Enter the 1st matrix row :");
        int p=sc.nextInt();
        System.out.println("Enter the 1st matrix colmn :");
        int q=sc.nextInt();
         //for 2nd matrix
        System.out.println("Enter the 2nd matrix row :");
        int r=sc.nextInt();
        System.out.println("Enter the 2nd matrix colmn :");
        int s=sc.nextInt();
        int[][] arr=new int[p][q];
        int[][] brr=new int[r][s];
        System.out.println("Enter the 1st arry Element :");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the 2nd array Element :");
        for(int i=0;i<r;i++){
            for(int j=0;j<s;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        if(p!=r || q!=s){
             System.out.println("Addition of matrices is not possible."); 
             return; 
            }

        int[][] res=call(arr,brr,p,s);
        System.out.println("The Addition of the two matrices are :");
        for(int i=0;i<p;i++){
            for(int j=0;j<s;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

}
