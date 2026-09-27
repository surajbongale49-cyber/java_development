import java.util.Scanner;
class Employ{
    String ID;
    String Name;
    int salary;
    void display(String ID,String Name,int salary){
        this.ID=ID;
        this.Name=Name;
        this.salary=salary;
    }
   
    void show(){
        System.out.println("Id :-"+ID);
        System.out.println("Name :-"+Name); 
        System.out.println("salary :-"+salary);

    }
}
public class Emp {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Employ e=new Employ();
    System.out.println("Eneter the ID of the Employee :");
    String ID=sc.nextLine();
    System.out.println("Enter the Name of the Employee :");
    String Name=sc.nextLine();
    System.out.println("Enter the Salary of the Employee :");
    int salary=sc.nextInt();
    e.display(ID,Name,salary);
    e.show();


    }
}
