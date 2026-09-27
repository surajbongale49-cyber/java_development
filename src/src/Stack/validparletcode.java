public class validparletcode {
    public static boolean isValid(String str) {
        int n=str.length();
        int left=0;

        for (int i=0;i<n;i++) {
            if(str.charAt(i)=='(') {
                left++;
            }else{
                if(left==0){
                    return false;
                }else{
                    left--;
                }
            }
        }
        return left==0;
    }

    public static void main(String[] args) {
        String str="((())())";
        System.out.println(isValid(str));
    }
}