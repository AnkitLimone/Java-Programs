import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class concurrentlinkedqueueforeach {
    public static void main(String args[]) {
        
        ConcurrentLinkedQueue<String> clqueue = new ConcurrentLinkedQueue<>();

        clqueue.add("rasmalai");
        clqueue.add("Gulabjamun");
        clqueue.add("Malaibarfi");
        clqueue.add("kaju katali");

        clqueue.stream().forEach(System.out::println);

    }
}
