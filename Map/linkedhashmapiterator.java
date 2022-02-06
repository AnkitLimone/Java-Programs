import java.util.*;

public class linkedhashmapiterator {
    public static void main(String args[]) {
        LinkedHashMap <Integer, String> ldhmap = new LinkedHashMap<>();


        ldhmap.put(11, "Kinkal");
        ldhmap.put(22, "lokEsh");
        ldhmap.put(33, "allu arjun");

        Set entrySet = ldhmap.entrySet();

       /* Iterator itr = entrySet.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

        ldhmap.entrySet().forEach(System.out::println);

    }
}
