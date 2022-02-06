import java.util.*;

public class linkedhashsetiterator {
    public static void main(String args[]) {
        
        Set <String> lhset = new LinkedHashSet<>();

        lhset.add("daya");
        lhset.add("babita");
        lhset.add("roshan");
        lhset.add("madhavi");

        Iterator<String> itr = lhset.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
