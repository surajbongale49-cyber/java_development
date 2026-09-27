import java.util.Scanner;
public class Suqre_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
