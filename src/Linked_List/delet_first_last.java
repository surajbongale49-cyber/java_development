class LL {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //deletfirst
     public void deletfirst(){
        if(head==null){
            System.out.println("The list is empty");
            return ;
        }
        head=head.next;
     }

     //deletlast
     public void deletlast(){
        if(head==null){
            System.out.println("The list is empty");
            return ;
        }
        if(head==null){
            head=null;
            return;
        }
        Node SecondlastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            SecondlastNode=SecondlastNode.next;
        }
        SecondlastNode.next=null;


     }
    // Print Listnext
    public void printList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
}

public class delet_first_last {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("List");
        list.addFirst("this");
        list.printList();
        list.deletfirst();
        list.printList();
        list.deletlast();
        list.printList();
    }
}