import java.util.HashSet;
import java.util.Iterator;

/*The element are stored by using hashing
* contain unique element
* Allow null Value
* order is an ascending
 */
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> name=new HashSet<>();
        name.add("Vishal");
        name.add("Soni");
        name.add("Vicky");
        name.add("Alia");
        name.add("Vishu");
        // Traverse element(iterator)
        Iterator<String> itr=name.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
