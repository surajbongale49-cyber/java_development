public class Function_calling_itd_itself {
    public static void main(String[] args){
        Ajay(1);
    }
    public static void Ajay(int n){
        if(n==10) return ;
        System.out.println("Suraj");
        Ajay(n+1);
    }

}
