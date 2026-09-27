import java.util.*;
public class printExtra {
    // Rear-->5 4 3 2 1 <--front
    public static void main(String[] args){
     Queue<Integer> q=new LinkedList<>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     q.add(5);
     System.out.println(q);
     Queue<Integer> p=new LinkedList<>();
     while(q.size()>0){
     System.out.print(q.element()+" ");
     p.add(q.remove());
    }
    System.out.println();
    // System.out.println(q);
    while(p.size()>0){
        q.add(p.poll());
    }
}
}