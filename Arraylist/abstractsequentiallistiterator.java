import java.util.*;
import java.util.AbstractList;
import java.util.AbstractSequentialList;

public class abstractsequentiallistiterator {
    public static void main(String args[]) {

        AbstractSequentialList<String> aslist = new LinkedList<>();

        aslist.add("batman");
        aslist.add("Superman");
        aslist.add("Wonderwoman");
        aslist.add("flash");


        Iterator <String> itr = aslist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}
