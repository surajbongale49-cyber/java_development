import java.util.Scanner;
public class Alternate_Alpha{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the NUmber :");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i%2!=0){
                System.out.print((char)(i+64)+" ");
            }else{
                System.out.print((char)(i+96)+" ");
            }
          
        }
          System.out.println();
    }
}
}