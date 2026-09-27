
import java.util.Scanner;
public class TextEditor{

    static class Node{
        int operationId;
        String operationType;
        String description;

        Node prev;
        Node next;

        Node(int operationId, String operationType, String description) {
            this.operationId=operationId;
            this.operationType=operationType;
            this.description=description;
            this.prev=null;
            this.next=null;
        }
    }

    static Node head=null;
    static Node tail=null;
    static Node current=null;

    // 1. Create new editing session
    static void createSession(){
        head=null;
        tail=null;
        current=null;

        System.out.println("New editing session created.");
    }

    // 2. Insert operation at end
    static void insertAtEnd(Node newNode){

        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }

        current=tail;

        System.out.println("Operation inserted at end.");
    }

    // 3. Insert operation after given operation ID
    static void insertAfter(int id,Node newNode){
        Node temp=head;
        while(temp!=null){
            if(temp.operationId==id){
                newNode.next=temp.next;
                newNode.prev=temp;
                if(temp.next!=null){
                    temp.next.prev=newNode;
                }else{
                    tail=newNode;
                }
                temp.next=newNode;
                current=newNode;
                System.out.println("Operation inserted after ID " + id);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Operation ID not found.");
    }
    // 4. Delete operation using Operation ID
    static void deleteOperation(int id) {
        Node temp=head;
        while(temp!=null){
            if(temp.operationId==id){
                // Only one node
                if(head==tail){
                    head=null;
                    tail=null;
                    current=null;
                }
                // Delete first node
                else if(temp==head){
                    head=head.next;
                    head.prev=null;
                    current=tail;
                }
                // Delete last node
                else if(temp==tail){
                    tail=tail.prev;
                    tail.next=null;
                    current=tail;
                }
                // Delete middle node
                else {
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    current=tail;
                }
                System.out.println("Operation deleted.");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Operation ID not found.");
    }

    // 5. Search operation using Operation ID
    static void searchOperation(int id){
        Node temp=head;
        while (temp!=null){
            if (temp.operationId==id){
                System.out.println("\nOperation Found");
                System.out.println("Operation ID   : " + temp.operationId);
                System.out.println("Operation Type : " + temp.operationType);
                System.out.println("Description    : " + temp.description);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Operation ID not found.");
    }

    // 6. Display current operation
    static void displayCurrent(){
        if (current==null){
            System.out.println("No current operation.");
            return;
        }
        System.out.println("\nCurrent Operation");
        System.out.println("Operation ID   : " + current.operationId);
        System.out.println("Operation Type : " + current.operationType);
        System.out.println("Description    : " + current.description);
    }

    // 7. Count total operations
    static void countOperations(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Total Operations = " + count);
    }

    // Display all operations
    static void displayAll(){
        if (head==null){
            System.out.println("No operations available.");
            return;
        }
        Node temp=head;
        System.out.println("\nOperation History:");
        while (temp!=null){
            System.out.println("-------------------------");
            System.out.println("Operation ID   : " + temp.operationId);
            System.out.println("Operation Type : " + temp.operationType);
            System.out.println("Description    : " + temp.description);
            temp=temp.next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== TEXT EDITOR =====");
            System.out.println("1. Create New Editing Session");
            System.out.println("2. Insert Operation at End");
            System.out.println("3. Insert Operation After ID");
            System.out.println("4. Delete Operation by ID");
            System.out.println("5. Search Operation by ID");
            System.out.println("6. Display Current Operation");
            System.out.println("7. Count Total Operations");
            System.out.println("8. Display All Operations");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){

                case 1:
                    createSession();
                    break;

                case 2:
                    System.out.print("Enter Operation ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Operation Type: ");
                    String type = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();

                    Node newNode=new Node(id, type, desc);

                    insertAtEnd(newNode);
                    break;

                case 3:
                    System.out.print("Enter ID after which to insert: ");
                    int afterId=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Operation ID: ");
                    int newId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Operation Type: ");
                    String newType = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String newDesc = sc.nextLine();

                    Node afterNode = new Node(newId, newType, newDesc);

                    insertAfter(afterId, afterNode);
                    break;

                case 4:
                    System.out.print("Enter Operation ID to delete: ");
                    int deleteId = sc.nextInt();

                    deleteOperation(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Operation ID to search: ");
                    int searchId = sc.nextInt();

                    searchOperation(searchId);
                    break;

                case 6:
                    displayCurrent();
                    break;

                case 7:
                    countOperations();
                    break;

                case 8:
                    displayAll();
                    break;

                case 9:
                    System.out.println("Exiting Text Editor...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);
    }
}