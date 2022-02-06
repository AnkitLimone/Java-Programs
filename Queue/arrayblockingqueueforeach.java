import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class arrayblockingqueueforeach {
    public static void main(String args[]) {
        
        ArrayBlockingQueue<String> aBlockingQueue = new ArrayBlockingQueue<>(5);

        aBlockingQueue.add("apple");
        aBlockingQueue.add("banana");
        aBlockingQueue.add("orange");
        aBlockingQueue.add("kiwi");
        aBlockingQueue.add("pineapple");
       // aBlockingQueue.add("papaya");

        aBlockingQueue.stream().forEach(System.out::println);

    }
}
