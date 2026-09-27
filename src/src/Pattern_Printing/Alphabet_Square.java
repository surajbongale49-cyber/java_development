import java.util.Scanner;
public class Alphabet_Square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=1;j<=num;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }

}
