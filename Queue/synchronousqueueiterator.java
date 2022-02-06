import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class synchronousqueueiterator {
    public static void main(String args[]) {
        

        SynchronousQueue<String> squeue = new SynchronousQueue<>();

        squeue.add("bhalerao");
        //squeue.add("Simba");
        //squeue.add("Bajirao");
        //squeue.add("Suryavanshi");

        Iterator<String> itr = squeue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
