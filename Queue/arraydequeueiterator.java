import java.util.*;

public class arraydequeueiterator {
    public static void main(String args[]) {
        
        Deque<String> deque = new ArrayDeque<>();

        deque.push("tapu");
        deque.push("sonu");
        deque.push("pinku");
        deque.push("goli");
        deque.push("gogi");

        Iterator<String> itr = deque.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
