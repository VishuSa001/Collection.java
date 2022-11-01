//The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
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
