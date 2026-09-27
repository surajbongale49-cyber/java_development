import java.util.*;
public class towerofHanoi{
    public  static void hanoi(int n,char src,char help,char des){
        if(n==1){
            System.out.println(src+"-->"+des);
            return ;
        }
        hanoi(n-1,src,des,help);
        System.out.println(src+"-->"+des);
        hanoi(n-1,help,src,des);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of disc :");
        int x=sc.nextInt();
        hanoi(x,'A','B','C');
    }

}
