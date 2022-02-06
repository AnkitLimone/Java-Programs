import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class arrayblockingqueuenongeneric {
    public static void main(String args[]) {
        
        ArrayBlockingQueue aBlockingQueue = new ArrayBlockingQueue(5);

        aBlockingQueue.add("apple");
        aBlockingQueue.add("banana");
        aBlockingQueue.add("orange");
        aBlockingQueue.add("kiwi");
        aBlockingQueue.add("pineapple");
       // aBlockingQueue.add("papaya");

        Iterator itr = aBlockingQueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
