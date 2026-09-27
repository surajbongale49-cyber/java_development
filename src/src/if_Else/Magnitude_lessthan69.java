import java.util.Scanner;
public class Magnitude_lessthan69 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        if(n>-69 && n<0){
            System.out.println(-n);
        }else if(n>0 && n<69){
            System.out.println(n);
        }else{
            System.out.println("the number is not less than 69");
        }


    }

}
