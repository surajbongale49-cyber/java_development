import java.util.Scanner;
public class hospital_que_1 {
    static class Node{
        String patientId;
        String patientName;
        int Age;
        String Department;
        String Priority;
        String consultationStatus;
        String nextPatient;
        Node next;

        Node(String patientId,String patientName,int Age,String Department,String Priority,String consultationStatus,
        String nextPatient){
            this.patientId=patientId;
            this.patientName=patientName;
            this.Age=Age;
            this.Department=Department;
            this.Priority=Priority;
            this.consultationStatus=consultationStatus;
            this.nextPatient=nextPatient;
            this.next=null;
        
        }
    }
    static void registerFirstPatient(Node){
        

    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choise;

        do {

            System.out.println("\n========== HOSPITAL PATIENT QUEUE ==========");
            System.out.println("1. Register First Patient");
            System.out.println("2. Admit Emergency Patient");
            System.out.println("3. Register Patient at End");
            System.out.println("4. Insert Patient After Patient ID");
            System.out.println("5. Insert Patient Before Patient ID");
            System.out.println("6. Remove First Patient");
            System.out.println("7. Remove Last Patient");
            System.out.println("8. Delete Patient by ID");
            System.out.println("9. Display Patient Queue");
            System.out.println("10. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Node first = createPatient(sc);
                    registerFirstPatient(first);
                    break;

                case 2:
                    Node emergency = createPatient(sc);
                    admitEmergency(emergency);
                    break;

                case 3:
                    Node last = createPatient(sc);
                    registerAtEnd(last);
                    break;

                case 4:
                    System.out.print("Enter Patient ID after which to insert: ");
                    int afterId = sc.nextInt();

                    Node afterNode = createPatient(sc);
                    insertAfter(afterId, afterNode);
                    break;

                case 5:
                    System.out.print("Enter Patient ID before which to insert: ");
                    int beforeId = sc.nextInt();

                    Node beforeNode = createPatient(sc);
                    insertBefore(beforeId, beforeNode);
                    break;

                case 6:
                    deleteFirst();
                    break;

                case 7:
                    deleteLast();
                    break;

                case 8:
                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = sc.nextInt();

                    deleteById(deleteId);
                    break;

                case 9:
                    display();
                    break;

                case 10:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);

        
    }
}

    
