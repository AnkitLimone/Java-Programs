import java.util.*;

public class navigatablemapiterator {
    public static void main(String args[]) {
        
        NavigableMap <Integer, String> nmap = new TreeMap<>();

        nmap.put(99, "hello");
        nmap.put(11, "ola");
        nmap.put(22, "nameste");

        Set v = nmap.entrySet();
        
        Iterator itr = nmap.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
