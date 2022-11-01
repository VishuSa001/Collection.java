import java.util.LinkedList;
import java.util.Queue;

public class Queue_New {
    public static void main(String[] args) {
        Queue<Integer> ob=new LinkedList<Integer>() ;
        //add and insert the element into the queue
        //offer()-insert the element into the queue
        ob.add(5);
        ob.offer(6);
        ob.add(8);
        System.out.println("queue" + ob);
        // element() return
    }
}
