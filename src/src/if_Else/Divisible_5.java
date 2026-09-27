import java.util.Scanner;
public class Divisible_5 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int a=sc.nextInt();
    if(a%5==0){
        System.out.println("The Number is Divisible by five");
    }else{
        System.out.println("The Number is not divisible by five");
    }

}
}
