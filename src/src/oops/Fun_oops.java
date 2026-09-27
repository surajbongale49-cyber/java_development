
public class Fun_oops {
    public static class Student{
        String name;
        String Id;
        int age;
    }
    public static void display(Student s1){
        System.out.println(s1.name);
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Suraj";
        s1.Id="PRN";
        s1.age=25;
        display(s1);

    }

}
