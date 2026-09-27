import java.util.Scanner;
public class elselad_er{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x-co-ordinate :");
        int x=sc.nextInt();
        System.out.println("Eneter the y-co-ordinate :");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("The coordinate lies in the origin ");
        }else if(y==0){
            System.out.println("The coordinate lies on the x-axis");
        }else if(x==0){
            System.out.println("The coordinate lies on the y-axis");
        }else if(x>0 && y>0){
            System.out.println("The coordinate lies in the 1st qudrant");
        }else if(x<0 && y>0){
            System.out.println("The coordinate lies in the 2nd qudrant");
        }else if(x<0 && y<0){
            System.out.println("The coordinate lies in the 3rd qudrant");
        }else{
            System.out.println("the coordinate lies in the 4th qudrant");
        }
    }
}