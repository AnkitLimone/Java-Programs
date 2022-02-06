import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class concurrentlinkeddequeforeach {
    public static void main(String args[]) {
        
        ConcurrentLinkedDeque<String> cldeque = new ConcurrentLinkedDeque<>();

        cldeque.add("indore");
        cldeque.add("ujjain");
        cldeque.add("dewas");
        cldeque.add("bhopal");

        cldeque.remove("dewas");

        cldeque.stream().forEach(System.out::println);

    }
}
