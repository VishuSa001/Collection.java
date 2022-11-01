import java.util.Vector;

public class Vetor_New {
    public static void main(String[] args) {
        Vector<String> ob=new Vector<String>();
        ob.add("Vishu");
        ob.add("Vishal");
        //Using add indexing
        ob.add(2,"Saini");
        System.out.println("Vector" + ob);
        // using add all method
        Vector<Integer> ob1=new Vector<Integer>();
        ob1.add(45);
        ob1.add(67);
        System.out.println("vector Integer" + ob1);
        // Using remove method to remove element.
        String s=ob.remove(1);
        System.out.println("Removed element is:" + s);
        System.out.println("new vector is:" + ob);
        //using clear method
        ob.clear();
        System.out.println("vector after is:" +ob);


    }
}
