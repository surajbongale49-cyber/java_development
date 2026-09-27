class Hostel_Room{
    String name;
    int roomNumber;
    Hostel_Room(int roomNumber){
        this.roomNumber=roomNumber;
        this.name="Not Alloted";
    }
    Hostel_Room(int roomNumber,String name){
        this.roomNumber=roomNumber;
        this.name=name;
    }
    void display(){
        System.out.println("Room Number "+roomNumber);
        System.out.println("Name :"+name);
    }
}
public class ASS_2_Cons_Over_load {
    public static void main(String[] args){
    Hostel_Room r1=new Hostel_Room(101);
    Hostel_Room r2=new Hostel_Room(102,"Suraj");

    r1.display();
    r2.display();
    }

}
