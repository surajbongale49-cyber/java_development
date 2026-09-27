class Student {
    private String name;
    private int rollNo;
    private double percentage;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for percentage
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Getter for percentage
    public double getPercentage() {
        return percentage;
    }
}

public class Getter_setter {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Suraj");
        s.setRollNo(76);
        s.setPercentage(92.5);

        System.out.println(s.getName());
        System.out.println(s.getRollNo());
        System.out.println(s.getPercentage());
    }
}
