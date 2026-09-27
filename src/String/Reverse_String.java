import java.util.Scanner;
public class Reverse_String{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        for(int j=s.length()-1;j>=0;j--){
            System.out.print(s.charAt(j));
        }
    }
}
