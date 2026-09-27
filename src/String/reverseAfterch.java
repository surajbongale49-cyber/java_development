public class reverseAfterch {
    public static String call(String str,int index,char ch){
    int n=str.length();
    char[] arr=new char[n];
    for(int i=0;i<n;i++){
        arr[i]=str.charAt(i);
    }
    for(int i=0;i<n;i++){
        if(ch==arr[i]){
          index=i;
          break;
        }
    }
    for(int i=0,j=index;i<j;i++,j--){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    return new String(arr);
    }
   public static void main(String[] args){
    String str="abcdefd";
    System.out.println("The Original String :");
    System.out.println(str);
    System.out.println("After reversing Some part the String becomes :");
    System.out.println(call(str,-1,'d'));

   }
}
