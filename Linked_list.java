import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> ob=new LinkedList<Integer>();
        // adding object in arraylist
        ob.add(4);
        ob.add(2);
        ob.add(5);
        System.out.println(ob);
        Iterator a=ob.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }
    }
}
