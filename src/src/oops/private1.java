
class Student {
    private int age = 20;
    private void display() {
        System.out.println(age);
    }

    public void show() {
        display();   // Allowed
    }
}

public class private1 {
    public static void main(String[] args) {
        Student s = new Student();

        // s.age;       //  Not allowed
        // s.display(); //  Not allowed

        s.show();       //  Allowed
    }
}