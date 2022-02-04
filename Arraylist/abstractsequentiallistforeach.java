import java.util.*;
import java.util.AbstractList;
import java.util.AbstractSequentialList;

public class abstractsequentiallistforeach {
    public static void main(String args[]) {
        AbstractSequentialList <String> aslist = new LinkedList<>();

        aslist.add("batman");
        aslist.add("Superman");
        aslist.add("Wonderwoman");
        aslist.add("flash");

        aslist.stream().forEach(System.out::println);
    }
}
