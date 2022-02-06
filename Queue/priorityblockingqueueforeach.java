import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityblockingqueueforeach {
    public static void main(String args[]) {
        
       
        PriorityBlockingQueue<String> pbqueue = new PriorityBlockingQueue<>();
        
        pbqueue.add("hp");
        pbqueue.add("Apple");
        pbqueue.add("dell");
        pbqueue.add("microsoft");
 
        pbqueue.stream().forEach(System.out::println);
 
 
     }
}
