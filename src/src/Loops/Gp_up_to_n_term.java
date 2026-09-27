import java.util.Scanner;
public class Gp_up_to_n_term {
    //1 2 4 8................
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Sy4.out.println("Enter the Number :");
    int n=sc.nextInt();
    int a=1,r=2;
    for(int i=1;i<=n;i++){
        System.out.println(a);
        a*=r;
    }
  }

}
