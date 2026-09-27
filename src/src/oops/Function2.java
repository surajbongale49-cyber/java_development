public class Function2 {
    public static class Student{
        String name;
        int age;
    }
    public static void change(Student s1){
        s1.name="Ramrao";
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="Suraj";
        s1.age=22;
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);

    }

}
