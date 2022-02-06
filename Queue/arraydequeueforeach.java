import java.util.*;

public class arraydequeueforeach {
    public static void main(String args[]) {
        Deque<String> deque = new ArrayDeque<>();

        deque.push("tapu");
        deque.push("sonu");
        deque.push("pinku");
        deque.push("goli");
        deque.push("gogi");

        deque.stream().forEach(System.out::println);
    }
}
