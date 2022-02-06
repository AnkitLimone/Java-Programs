import java.util.TreeMap;
import java.util.*;

public class treemapiterator {
    public static void main(String args[]) {
        
        TreeMap<Integer, String> trmap = new TreeMap<Integer, String>();

        trmap.put(1, "kamlesh");
        trmap.put(2, "rajesh");
        trmap.put(3, "vimlesh");
        trmap.put(4, "rakesh");
        trmap.put(5, "ramesh");

        Set<Map.Entry<Integer, String> > entries = trmap.entrySet();

        trmap.entrySet().forEach(System.out::println);

        /*Iterator<Map.Entry<Integer, String> > itr = entries.iterator();
        Map.Entry<Integer, String> entry = null;
        System.out.println("**********************Treemap using Iterator interface*********************");
        while (itr.hasNext()) {
            entry = itr.next();
            System.out.println(entry.getKey() + "->"
                               + entry.getValue());
        }*/
    }
}
