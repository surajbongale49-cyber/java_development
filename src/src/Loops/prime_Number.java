import java.util.Scanner;
public class prime_Number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int x=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                x=1;
                break;
            }
        }
            if(n==1){
                System.out.println("the Number is neither prime or nor composit");
            }else if(x==0){
                System.out.println("the Number is prime Number ");
            }else{
                System.out.println("The Number is Composit Number ");
            }
        
    }
}