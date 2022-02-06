import java.util.*;

public class sortedmapforeach {
    public static void main(String args[]) {
        
        SortedMap <Integer, String> smap = new TreeMap<>();

        
        smap.put(55, "akal");
        smap.put(66, "lllll");
        smap.put(77, "aaaaa");
        smap.put(88, "oooooo");

        Set entry = smap.entrySet();

        smap.entrySet().forEach(System.out::println);



    }
}
