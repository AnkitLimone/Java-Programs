import java.util.*;
import java.util.concurrent.*;

public class delayqueueiterator {
    public static void main(String args[]) {

        private String name;
        private long time; 

        DelayQueue dyqueue = new DelayQueue();

        dyqueue.add("raju");
        dyqueue.add("shyam");
        dyqueue.add("Baburao"); 

        Iterator itr = dyqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
