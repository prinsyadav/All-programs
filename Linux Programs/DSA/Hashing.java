import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args){
        // Create hashset

        HashSet<Integer> set = new HashSet<>();

        // Insert element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println(set);

        // Search - Contains

        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }

        if (!set.contains(6)) {
            System.out.println("Set does not contain 6");
        }

        // Delete

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Set deleted 1");
        }

        System.out.println(set.size());
        System.out.println(set);

        // Iterator
        // @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();

        // System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
