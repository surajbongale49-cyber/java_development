import java.util.Scanner;
public class leetcode {
    public static int noOfSteps(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return noOfSteps(n/2,steps+1);
        }else{
            return noOfSteps(n-1,steps+1);
        }
    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number :");
    int n=sc.nextInt();
    int t=noOfSteps(n,0);
    System.out.println("total no of steps are required :");
    System.out.println(t);
   }
}
