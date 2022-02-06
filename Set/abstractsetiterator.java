import java.util.*;

public class abstractsetiterator {
    public static void main(String args[]) {
        
        AbstractSet<String> abset = new TreeSet<>();

        abset.add("puma");
        abset.add("adidas");
        abset.add("nike");
        abset.add("Bata");

        Iterator<String> itr = abset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
