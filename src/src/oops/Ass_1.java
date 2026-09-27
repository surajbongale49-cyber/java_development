import java.util.*;
public class Ass_1 {
    public static class Student{
        String name;
        int roll;
        void display(Student s1){
            System.out.println("Name :-"+s1.name);
            System.out.println("RollNo :-"+s1.roll);
        }
        // void EnterInfo(Student s1){
        //     Scanner sc=new Scanner(System.in);
        //     System.out.println("Enter the Name of Student :");
        //     s1.name=sc.nextLine();
        //     System.out.println("Enter the Roll Number of Student :");
        //     s1.roll=sc.nextInt();
        //     display(s1);
        // }
   
    }
    public static void EnterInfo(Student s1){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Name of Student :");
            s1.name=sc.nextLine();
            System.out.println("Enter the Roll Number of Student :");
            s1.roll=sc.nextInt();
            s1.display(s1);
        }
    public static void main(String[] args){
        Student s1=new Student();
        EnterInfo(s1);
         
    }
}
