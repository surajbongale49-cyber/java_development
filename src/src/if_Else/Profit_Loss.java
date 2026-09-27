import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Cost Prize:");
    Double C = sc.nextDouble();

    System.out.println("Enter the Selling Prize:");
    Double S = sc.nextDouble();

    if(C>S){
        System.out.println("User gets loss:");
        System.out.println(C-S);
    }else if(S>C){
        System.out.println("User gets proffit:");
        System.out.println(S-C);
    }else{
        System.out.println("There is no proffit and no loss");
    }

    }

}
