
import java.util.*;

public class abstractsetforeach {
    public static void main(String args[]) {
        
        AbstractSet<String> abset = new TreeSet<>();

        abset.add("puma");
        abset.add("adidas");
        abset.add("nike");
        abset.add("Bata");

        abset.stream().forEach(System.out::println);
    }
}
