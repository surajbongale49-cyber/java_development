import java.util.Scanner;
public class Alphabetical_Square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=65;j<=68;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }

}

