import java.util.*;
public class leetcode {
    public static void call(char[] arr,int k){
        int i=0;
        int j=k-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        System.out.println("Enter the Number :");
        int k=sc.nextInt();
        int n=s.length();
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }
        call(arr,k);
        String str=new String(arr);
        System.out.println(str);

    }
}
