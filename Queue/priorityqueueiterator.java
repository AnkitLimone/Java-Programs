import java.util.*;

public class priorityqueueiterator {
    public static void main(String args[]) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("kanchan");
        queue.add("mahesh");
        queue.add("lokesh");
        queue.add("pankaj");
        queue.add("pinku");

        // Iterator method

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
