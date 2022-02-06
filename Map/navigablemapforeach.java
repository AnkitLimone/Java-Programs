import java.util.*;

public class navigablemapforeach {
    public static void main(String args[]) {
        
        NavigableMap <Integer, String> nmap = new TreeMap<>();

        nmap.put(99, "hello");
        nmap.put(11, "ola");
        nmap.put(22, "nameste");

        Set v = nmap.entrySet();
        
        nmap.entrySet().forEach(System.out::println);


    }
}
