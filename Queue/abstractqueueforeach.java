import java.util.*;

public class abstractqueueforeach {
    public static void main(String args[]) {
         
        AbstractQueue<String> abstractQueue = new PriorityQueue<>();

        abstractQueue.add("professor");
        abstractQueue.add("lisbon");
        abstractQueue.add("tokyo");
        abstractQueue.add("rio");
        abstractQueue.add("denver");
        abstractQueue.add("stockholm");
        abstractQueue.add("nirobi");

        abstractQueue.stream().forEach(System.out::println);
    }
}
