import java.util.*;

public class abstractqueueiterator {
    public static void main(String args[]) {
         AbstractQueue<String> abqueue = new PriorityQueue<>();

         abqueue.add("Xiaomi");
         abqueue.add("Samsung");
         abqueue.add("Oneplus");
         abqueue.add("Apple");

         System.out.println("*********Before removing an element**********");
         
         System.out.println(abqueue);

         abqueue.remove("Apple");

         System.out.println("*********After removing 1 element**********");

         Iterator<String> itr = abqueue.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }
             
         
    }
}
