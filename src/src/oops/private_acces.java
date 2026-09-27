class Student{
        String name;
        private int age;
        double percentage;
       
    }
public class private_acces {
    public static void main(String[] args){
      Student s=new Student();
      s.name="Suraj";
      // s.age=33;
      System.out.println(s.name);
    }

}
