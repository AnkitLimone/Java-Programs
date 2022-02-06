import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class concurrentlinkeddequeiterator {
    public static void main(String args[]) {
        
        ConcurrentLinkedDeque<String> cldeque = new ConcurrentLinkedDeque<>();

        cldeque.add("indore");
        cldeque.add("ujjain");
        cldeque.add("dewas");
        cldeque.add("bhopal");

        cldeque.remove("dewas");

        Iterator<String> itr = cldeque.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
