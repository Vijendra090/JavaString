import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterfaceExample {
    public static void main(String [] args){
        NavigableSet<Integer> ns = new TreeSet<Integer>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = ns.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);
        // methods of navigable set
        //lower(E e): return the greatest ele in this set which is less than the given ele or null if there is no such ele
        System.out.println("lower(3) :"+ ns.lower(3));
        //floor(E e): return the greatest ele in this set which is less than or equal to given ele or null if there is no such ele
        System.out.println("floor(3) :"+ ns.floor(3));
        //ceiling(E e): return the least ele in this set which is greater than or equal to given ele or null if there is no such ele
        System.out.println("ceiling(3) :"+ns.ceiling(3));
        //higher(E e): return the least ele in this set which is greater than the given ele or null if there is no such ele
        System.out.println("higher(3) :"+ns.higher(3));
        //pollFirst(): retrieve and remove the first least ele in this set or return null if no such ele
        System.out.println("pollFirst() :"+ ns.pollFirst());
        //pollLast(): retrieve and remove the last highest ele in this set or return null if no such ele
        System.out.println("Navigable set :"+ns);
        System.out.println("pollLast() :"+ ns.pollLast());
        System.out.println("Navigable set :"+ns);
    }
}
