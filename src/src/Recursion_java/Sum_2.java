import java.util.Scanner;
public class Sum_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        sum(n,1);
        System.out.println("The sum of this Number is :"+sum(n,1));
    }
    public static int sum(int x,int y){
       if(y==x){
        return x;
       }else{
        return y+sum(x,y+1);
       }


    }


}
