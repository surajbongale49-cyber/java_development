class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Basic_link {
    public static void main(String[] args){
        //10->20->30->40->50;
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);  
        Node d=new Node(40);
        Node e=new Node(50);
        System.out.println(a.data);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       
        System.out.println(a); //Node@1dbd16a6
        System.out.println(b); //Node@7ad041f3
        System.out.println(c); //Node@251a69d7
        System.out.println(d); //Node@7344699f
        System.out.println(e); //Node@6b95977

        //which holds the address of b
        System.out.println(a.next);//Node@7ad041f3
        //Which holds the address of c
        System.out.println(b.next);//Node@251a69d7
        //which holds the address of d
        System.out.println(c.next);//Node@7344699f
        //Which holds the address of e
        System.out.println(d.next); //Node@6b95977
        System.out.println(a.next.next);//Node@251a69d7
        System.out.println(a.next.next.next.data);

    
    }

}
