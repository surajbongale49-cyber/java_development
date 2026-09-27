import java.util.Scanner;

public class Miss_Element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber :");
        int N=sc.nextInt();
        int[] arr=new int[N-1];
        System.out.println("Enter the Array ELement :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int total=N*(N+1)/2;
        int Missing_ELement=total-sum;
        System.out.println("the Missing element in this array :"+Missing_ELement);
    }

}