import java.util.Scanner;
public class Hard_pattern {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<j){
                    System.out.print(i+" ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }


}
