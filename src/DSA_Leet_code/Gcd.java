public class Gcd {
   public static int gcd(int max,int min){
    if(min==0){
        return max;
    }
     return gcd(min,max%min);
   } 
   public static void main(String[] args){
     int[] arr={2,5,6,9,10};
     int n=arr.length;
     int max=arr[0];
     int min=arr[0];
     for(int i=0;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }
        if(min>arr[i]){
            min=arr[i];
        }
     }
     int t=gcd(max,min);
     System.out.println(t);
   }
}
