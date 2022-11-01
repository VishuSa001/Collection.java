import java.util.ArrayDeque;
import java.util.Deque;

/* It is a way to apply resizable-array
in addition to implementation of the Deque interface
 */
public class Array_Dequeue {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        deque.add("mango");
        deque.add("Orange");

        deque.add("Apple");
        System.out.println("Elements :");
        for (String s:deque) {
            System.out.println(s);
        }
        // deque pollLast Last element from the deque
        deque.pollLast();
        System.out.println("After pollLast() : ");
        for (String s:deque) {
            System.out.println(s);
        }
    }
}
