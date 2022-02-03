import java.util.LinkedList;
import java.util.Iterator;

public class linkedlistiterator {
     
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("ramesh");
    linkedlist.add("suresh");
    linkedlist.add("kamlesh");
    linkedlist.add("bimlesh");
    linkedlist.add("vimlesh");
 
    // Obtaining Iterator
    Iterator itr = linkedlist.iterator();
 
    // Iterating the list in forward direction
    System.out.println("LinkedList elements:");
    while(itr.hasNext()){
       System.out.println(itr.next());
    }
 }
}