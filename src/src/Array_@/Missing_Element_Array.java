public class Missing_Element_Array {
    public static void main(String[] args){
          int[] arr={1,2,8,9,7,6,10};
          int target=10;
          boolean flag=false;
          for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
                break;
            }
          }
          if(flag==true){
            System.out.println("the target element is present in this Array");
          }else{
            System.out.println("The target element is not present in this array");
          }
    }
}