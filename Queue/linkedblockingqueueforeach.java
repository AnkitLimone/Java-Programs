import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class linkedblockingqueueforeach {
    public static void main(String args[]) {
        
        LinkedBlockingQueue<String> lbqueue = new LinkedBlockingQueue<>();

        lbqueue.add("hello");
        lbqueue.add("world");
        lbqueue.add("indore");
        lbqueue.add("dewas");

        lbqueue.stream().forEach(System.out::println);

    }
}
