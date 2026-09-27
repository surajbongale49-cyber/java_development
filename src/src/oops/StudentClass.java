
public class StudentClass {
    public static class Student{
        String name;
        int rno;
        double percent;
    }
    public static void main(String[] args){
       Student x=new Student();
       x.name="Suraj";
       x.rno=76;
       x.percent=92.5;
       System.out.println(x.name);

       Student s=new Student();
       s.name="Avinash";
       s.rno=88;
       s.percent=99.99;
       System.out.println(s.rno);

    }
}
