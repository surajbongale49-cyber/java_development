import java.util.Scanner;
public class Max_Element_Arr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
        }
        System.out.println("the maximum element present in this array is :"+max);

}
}