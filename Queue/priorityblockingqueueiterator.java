import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityblockingqueueiterator {
    public static void main(String args[]) {
        
       
       PriorityBlockingQueue<String> pbqueue = new PriorityBlockingQueue<>();
       
       pbqueue.add("hp");
       pbqueue.add("Apple");
       pbqueue.add("dell");
       pbqueue.add("microsoft");

       Iterator<String> itr = pbqueue.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }


    }
}
