import java.util.*;

public class sortedmapiterator {
    public static void main(String args[]) {
        
        SortedMap <Integer, String> smap = new TreeMap<>();

        smap.put(55, "akal");
        smap.put(66, "lllll");
        smap.put(77, "aaaaa");
        smap.put(88, "oooooo");

        Set entry = smap.entrySet();

        Iterator itr = smap.entrySet().iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
