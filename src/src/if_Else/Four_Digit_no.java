import java.util.Scanner;
public class Four_Digit_no {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int num =sc.nextInt();
    if(num>999 && num<=9999){
        System.out.println("The Number is 4 Digit Number ");
    }else {
        System.out.println("The Number is not four Digit Number");
    }
  }
}
