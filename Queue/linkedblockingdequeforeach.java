import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class linkedblockingdequeforeach {
    public static void main(String args[]) {
        
        LinkedBlockingDeque<String> lbdqueue = new LinkedBlockingDeque<>();

        lbdqueue.add("shyam");
        lbdqueue.add("lakhan");
        lbdqueue.add("ganpat");
        lbdqueue.add("raam");

        lbdqueue.stream().forEach(System.out::println);

    }
}
