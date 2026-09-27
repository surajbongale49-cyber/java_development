import java.util.Scanner;
public class alphaleetcode {
    public static char search(char[] arr,char target,int n){
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return arr[(left%arr.length)];
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :-");
        int n=sc.nextInt();
        System.out.println("Enter the Array Element :");
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.next().charAt(0);
        }
        System.out.println("Enter the Target Element :");
        char t=sc.next().charAt(0);
        char ch=search(arr,t,n);
        System.out.println("next near element of given target element :");
        System.out.println(ch);
    }

}
