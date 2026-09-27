class Student {

    protected int rollNo;

    Student(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Student Constructor");
    }

    void displayRollNo() {
        System.out.println("Roll No = " + rollNo);
    }
}

class Test extends Student {

    protected float s1, s2;

    Test(int rollNo, float s1, float s2) {
        super(rollNo);

        this.s1 = s1;
        this.s2 = s2;

        System.out.println("Test Constructor");
    }

    void displayMarks() {
        System.out.println("Subject 1 = " + s1);
        System.out.println("Subject 2 = " + s2);
    }
}

class Result extends Test {

    float total;

    Result(int rollNo, float s1, float s2) {
        super(rollNo, s1, s2);

        total = s1 + s2;

        System.out.println("Result Constructor");
    }

    void display() {
        displayRollNo();
        displayMarks();
        System.out.println("Total = " + total);
    }
}

public class Assi_3{

    public static void main(String[] args) {

        Result r = new Result(10, 75.25f, 70.46f);

        r.display();
    }
}
