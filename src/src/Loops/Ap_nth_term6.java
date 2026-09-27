import java.util.Scanner;
public class Ap_nth_term6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        // 4 10 16 22 28 34 _ _ _ _ _ _ _ _ _ 
        for(int i=4;i<=(6*n-2);i+=6){
        
          System.out.println(i);
          
        }
    }

}
