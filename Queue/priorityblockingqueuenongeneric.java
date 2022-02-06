import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class priorityblockingqueuenongeneric {
    public static void main(String args[]) {
        
       
        PriorityBlockingQueue pbqueue = new PriorityBlockingQueue();
        
        pbqueue.add("hp");
        pbqueue.add("Apple");
        pbqueue.add("dell");
        pbqueue.add("microsoft");
 
        Iterator itr = pbqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
 
 
     }
}
