import java.util.*;

public class linkedhashsetforeach {
    public static void main(String args[]) {
        Set <String> lhset = new LinkedHashSet<>();

        lhset.add("daya");
        lhset.add("babita");
        lhset.add("roshan");
        lhset.add("madhavi");

        lhset.stream().forEach(System.out::println);
    }
}
