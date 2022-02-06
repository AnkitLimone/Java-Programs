import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class copyonwritearraysetforeach {
    public static void main(String args[]) {
        CopyOnWriteArraySet<String> cowaset = new CopyOnWriteArraySet<>();

        cowaset.add("sev");
        cowaset.add("mixture");
        cowaset.add("gathiya");
        cowaset.add("fafda");

        cowaset.stream().forEach(System.out::println);
    }
}
