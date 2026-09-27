class Student {
    private int age = 20;
     void display() {
        System.out.println(age);
    }

}

public class private2 {
    public static void main(String[] args) {
        Student s = new Student();

        // s.age;       //  Not allowed
        s.display(); //  allowed

           
    }
}