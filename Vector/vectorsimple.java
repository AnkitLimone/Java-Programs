import java.util.*;

public class vectorsimple {
    public static void main(String args[] ) {
        Vector<String> animals = new Vector<String>();

        animals.add("Dog");
        animals.add("COW");
        animals.add("horse");

        animals.add(3,"CAT");
        System.out.println("vector: "+animals);

        Vector<String> mammals = new Vector<String>();
        mammals.add("Bhalu");

        mammals.addAll(animals);
        System.out.println("New Vector: "+mammals);
    }
}
