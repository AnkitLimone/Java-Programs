import java.util.*;

public class linkedlistupdateing {
    public static void main(String args[]) {
    LinkedList<String> bag = new LinkedList<>();
    
    bag.add("Skybags");
    bag.add("american Tourister");
    bag.add("Sling bag");
    bag.add("Laptop bag");
    bag.add("Parashute");
    bag.add("safari");

    System.out.println(bag);

    bag.set(2,"American Tourister");
    System.out.println("\nReplaced Successfully:");
    System.out.println(bag);
    }
}
