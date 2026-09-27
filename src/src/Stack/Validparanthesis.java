public class Validparanthesis {
    public static boolean isvalid(String str){
        int n=str.length();
        char[] arr=new char[n];
        int top=-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
              arr[++top]=str.charAt(i);
            }else{
                if(top==-1){
                    return false;
                }
                if((str.charAt(i)==')' && arr[top]=='(') ||
                   (str.charAt(i)==']' && arr[top]=='[') ||
                   (str.charAt(i)=='}' && arr[top]=='{')  ){
                    top--;
                   }else{
                    return false;
                   }
            }
        }
        return top==-1;
    }
   public static void main(String[] args){
    String str="()[]{}";
    System.out.println(isvalid(str));
   }
}
