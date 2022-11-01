/* Define of Priority Queue :It is a type of Queue Wherein all the elements are ordered as per their ordering
and each element is associated with  a priority.
 */

import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers=new PriorityQueue<>();
        numbers.add(700);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);
        System.out.println("Priority Queue");
        while (!numbers.isEmpty()){
            System.out.println(numbers.remove());
        }
        /*PriorityQueue<Integer> numbers =new PriorityQueue<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println("PriorityQueue");
        // iterator()method:traverse
        //hasNext() :boolean(true/false)  1: true, 2:true, false
        //next() : iterator
        Iterator<Integer> iterate=numbers.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
            System.out.println(" , ");
        }*/

    }
}
