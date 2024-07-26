import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMap {
    public static <E> void main(String[] args){
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Anup", 10000);
            map.put("Prince", 0);

            // Print hashmap
            System.out.println(map);

            // Search the value
            if (map.containsKey("Anup")) {
                System.out.println("it contains value");
            }
            
            for (Map.Entry<String, Integer>e : map.entrySet()) {
                System.out.println(e);
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }

    }
}
