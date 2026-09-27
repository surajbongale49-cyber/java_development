public class NextGraeterEle {
  public static int[] call(int[] arr,int[] brr){
    int n=arr.length;
     for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                brr[i]=arr[j];
                break;
            }
        }
    }
    return brr;
  }
  public static void main(String[] args){
    int[] arr={8,6,4,7,4,9,10,8,12};
    int n=arr.length;
    int[] brr=new int[n];
    for(int i=0;i<n;i++){
        brr[i]=-1;
    }
    call(arr,brr);
    System.out.println("The Original Array :");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("The Array after Arranging :");
    for(int i=0;i<n;i++){
        System.out.print(brr[i]+" ");
    }
   
  }
}
