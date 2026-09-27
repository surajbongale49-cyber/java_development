public class Ackermann_fun {
    public static int Ack(int m,int n){
        if(m==0){
            return n+1;
        }else if((m>0) && n==0){
            return Ack(m-1,1);
        }else if((m>0) && (n>0)){
            return Ack(m-1,Ack(m,n-1));
        }
        return 0;
    }
    public static void main(String[] args){
        int A=Ack(1,2);
        System.out.println(A);
        
    }

}
