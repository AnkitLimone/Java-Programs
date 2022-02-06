import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class copyonwritearraysetiterator {
    public static void main(String args[]) {
        
        CopyOnWriteArraySet<String> cowaset = new CopyOnWriteArraySet<>();

        cowaset.add("aalo");
        cowaset.add("gobi");
        cowaset.add("Matar");
        cowaset.add("Pyaz");
        cowaset.add("tamater");

        Iterator<String> itr = cowaset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
