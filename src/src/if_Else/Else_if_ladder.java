import java.util.Scanner;
public class Else_if_ladder {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number :");
    int n = sc.nextInt();
    if(n%5==0 && n%3==0){
        System.out.println("Apurava");
    }
    else if(n%3==0){
        System.out.println("Riya");
    }else if(n%5==0){
        System.out.println("Banu");
    }else{
        System.out.println("Isha");
    }
 
 }
}
