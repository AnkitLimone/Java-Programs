import java.util.concurrent.LinkedBlockingDeque;
import java.util.*;

public class linkedblockingdequeiterator {
    public static void main(String args[]) {
        
        LinkedBlockingDeque<String> lbdqueue = new LinkedBlockingDeque<>();

        lbdqueue.add("shyam");
        lbdqueue.add("lakhan");
        lbdqueue.add("ganpat");
        lbdqueue.add("raam");

        Iterator<String> itr = lbdqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
