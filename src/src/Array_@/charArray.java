import java.util.*;

public class charArray{
    public static void main(String[] args){
        ArrayList<Character> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array :-");
        int n=sc.nextInt();

        System.out.println("Enter the Element of Array :-");

        for(int i=0;i<n;i++){
            arr.add(sc.next().charAt(0));
        }

        System.out.println(arr);
    }
}