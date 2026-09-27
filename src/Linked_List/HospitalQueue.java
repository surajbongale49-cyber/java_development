import java.util.Scanner;
public class HospitalQueue {

    static class Node {
        int patientId;
        String patientName;
        int age;
        String department;
        String priority;
        String status;
        Node next;

        Node(int patientId, String patientName, int age,
             String department, String priority, String status) {
            this.patientId = patientId;
            this.patientName = patientName;
            this.age = age;
            this.department = department;
            this.priority = priority;
            this.status = status;
            this.next = null;
        }
    }

    static Node head = null;

    // 1. Register the first patient
    static void registerFirstPatient(Node newNode) {
        if (head == null) {
            head = newNode;
            System.out.println("First patient registered successfully.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }
 
    // 2. Admit emergency patient at beginning
    static void admitEmergency(Node newNode) {
        newNode.next = head;
        head = newNode;
        System.out.println("Emergency patient admitted at beginning.");
    }

    // 3. Register new patient at end
    static void registerAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
            System.out.println("Patient registered successfully.");
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Patient registered at end successfully.");
    }

    // 4. Insert patient after specified Patient ID
    static void insertAfter(int id, Node newNode) {
        Node temp = head;
        while (temp != null) {
            if (temp.patientId == id) {
                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("Patient inserted after Patient ID " + id);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Patient ID not found.");
    }

    // 5. Insert patient before specified Patient ID
    static void insertBefore(int id, Node newNode) {
         if (head == null) {// If list is empty
            System.out.println("Queue is empty.");
            return;
        }
        // If inserting before first node
        if (head.patientId == id) {
            newNode.next = head;
            head = newNode;
            System.out.println("Patient inserted before Patient ID " + id);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.patientId == id) {
                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("Patient inserted before Patient ID " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Patient ID not found.");
    }

    // 6. Remove first patient
    static void deleteFirst() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Patient " + head.patientId +
                " removed after consultation.");
        head = head.next;
    }

    // 7. Remove last patient
    static void deleteLast() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        // Only one patient
        if (head.next == null) {
            System.out.println("Patient " + head.patientId +
                    " cancelled the appointment.");
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Patient " + temp.next.patientId +
                " cancelled the appointment.");
        temp.next = null;
    }

    // 8. Delete patient using Patient ID
    static void deleteById(int id) {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        // If first patient has given ID
        if (head.patientId == id) {
            System.out.println("Patient " + id + " deleted.");
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.patientId == id) {
                System.out.println("Patient " + id + " deleted.");
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Patient ID not found.");
    }

    // 9. Display complete patient queue
    static void display() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = head;
        System.out.println("\n========== HOSPITAL PATIENT QUEUE ==========");

        while (temp != null) {

            System.out.println("---------------------------------------------");
            System.out.println("Patient ID   : " + temp.patientId);
            System.out.println("Patient Name : " + temp.patientName);
            System.out.println("Age          : " + temp.age);
            System.out.println("Department   : " + temp.department);
            System.out.println("Priority     : " + temp.priority);
            System.out.println("Status       : " + temp.status);

            temp = temp.next;
        }

        System.out.println("---------------------------------------------");
    }

    // Create patient
    static Node createPatient(Scanner sc) {

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Priority (Emergency/High/Medium/Low): ");
        String priority = sc.nextLine();

        System.out.print("Enter Status (Waiting/In Progress/Completed): ");
        String status = sc.nextLine();

        return new Node(id, name, age, department, priority, status);
    }

    
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int choice;

        do{
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