import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class linkedblockingqueueiterator {
    public static void main(String args[]) {
        
        LinkedBlockingQueue<String> lbqueue = new LinkedBlockingQueue<>();

        lbqueue.add("hello");
        lbqueue.add("world");
        lbqueue.add("indore");
        lbqueue.add("dewas");

        Iterator<String> itr = lbqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
