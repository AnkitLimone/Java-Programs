import java.util.*;

public class abstractmapiterator {
    public static void main(String args[]) {
        
        AbstractMap<Integer, String> abmap = new HashMap<Integer, String>();

        abmap.put(1, "ankit");
        abmap.put(2, "mahak");
        abmap.put(3, "mikku");
        abmap.put(4, "muskan");
        abmap.put(5, "namrata");

       

        System.out.println("\nUsing the forEach() \n");

        abmap.entrySet().forEach(System.out::println);

        System.out.println("\nUsing the Iterator interface \n");
  
        Iterator<Integer> itr = abmap.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            System.out.println("Key = " + key + " & Value =  " + abmap.get(key)+"\n");
        }


    }
}
