import java.util.*;

public class priorityqueueforeach {
    public static void main(String args[]) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("kanchan");
        queue.add("mahesh");
        queue.add("lokesh");
        queue.add("pankaj");
        queue.add("pinku");

        //forEach method

        queue.stream().forEach(System.out::println);
    }
}
