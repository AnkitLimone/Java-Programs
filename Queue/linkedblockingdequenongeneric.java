import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class linkedblockingdequenongeneric {
    public static void main(String args[]) {
        
        LinkedBlockingDeque lbdqueue = new LinkedBlockingDeque();

        lbdqueue.add("shyam");
        lbdqueue.add("lakhan");
        lbdqueue.add("ganpat");
        lbdqueue.add("raam");

        Iterator itr = lbdqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
