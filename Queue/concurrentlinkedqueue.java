import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class concurrentlinkedqueue {
    public static void main(String args[]) {
        
        ConcurrentLinkedQueue<String> clqueue = new ConcurrentLinkedQueue<>();

        clqueue.add("rasmalai");
        clqueue.add("Gulabjamun");
        clqueue.add("Malaibarfi");
        clqueue.add("kaju katali");

        Iterator<String> itr = clqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
