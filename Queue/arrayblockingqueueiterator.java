import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class arrayblockingqueueiterator {
    public static void main(String args[]) {
        
        ArrayBlockingQueue<String> aBlockingQueue = new ArrayBlockingQueue<>(5);

        aBlockingQueue.add("apple");
        aBlockingQueue.add("banana");
        aBlockingQueue.add("orange");
        aBlockingQueue.add("kiwi");
        aBlockingQueue.add("pineapple");
       // aBlockingQueue.add("papaya");

        Iterator<String> itr = aBlockingQueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
