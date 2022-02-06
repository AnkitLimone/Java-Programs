import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class concurrentlinkedqueuenongeneric {

    public static void main(String args[]) {
        
        ConcurrentLinkedQueue clqueue = new ConcurrentLinkedQueue();

        clqueue.add("rasmalai");
        clqueue.add("Gulabjamun");
        clqueue.add("Malaibarfi");
        clqueue.add("kaju katali");

        Iterator itr = clqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
