import java.util.*;

public class vectoriterator {
    public static void main(String args[]) {
        Vector<String> animals = new Vector<>();
        animals.add("DOG");
        animals.add("Bhalu");
        animals.add("cow");

        String element = animals.get(2);
        System.out.println("Element at index 2: "+element);

        Iterator<String> itr = animals.iterator();
        System.out.print("Vector: ");
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print(", ");
        }
    }
}
