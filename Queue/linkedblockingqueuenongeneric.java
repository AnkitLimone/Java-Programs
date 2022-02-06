import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class linkedblockingqueuenongeneric {
    public static void main(String args[]) {
        
        LinkedBlockingQueue lbqueue = new LinkedBlockingQueue();

        lbqueue.add("hello");
        lbqueue.add("world");
        lbqueue.add(45);
        lbqueue.add("dewas");

        Iterator itr = lbqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
