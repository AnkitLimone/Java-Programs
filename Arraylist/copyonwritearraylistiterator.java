import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonwritearraylistiterator {
    public static void main(String args[]) {
        
        CopyOnWriteArrayList<String> cowalist = new CopyOnWriteArrayList<>();

        cowalist.add("Poha");
        cowalist.add("Jalebi");
        cowalist.add("kachori");
        cowalist.add("samosa");

        Iterator<String> itr = cowalist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
