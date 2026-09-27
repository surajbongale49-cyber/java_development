public class Call_Fun {
    public static void Yadav(){
        System.out.println("Suresh");
    }
    public static void Rohan(){
        System.out.println("Good Night");
        Yadav();
    }
    public static void Pranav(){
        System.out.println("Good Morning");
        Rohan();
    }
    public static void main(String[] args){
        System.out.println("Ramesh");
        Pranav();
    }

}
