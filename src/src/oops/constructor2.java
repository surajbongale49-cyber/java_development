public class constructor2 {
    public static class Student{
        String name;
        int age;
        double percent;
        Student(String name,int age,double percent){
            this.name=name;
            this.age=age;
            this.percent=percent;
        }
        public void display(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(percent);
        }
    }
    public static void main(String[] args){
        Student s1=new Student("Suraj",20,99.49);
        s1.display();
        Student s2=new Student("Abhishek",22,99.89);
        s2.display();
    }

}
