public class constructor {
    public static class  Student{
        String name;
        int age;
        double percent;
        Student(String name,int age,double percent){
            this.name=name;
            this.age=age;
            this.percent=percent;
        }
    }
    public static void main(String[] args){
      Student s1=new Student("Suraj",21,99.49);
      System.out.println(s1.name);
      System.out.println(s1.age);
      System.out.println(s1.percent);
    }
}
