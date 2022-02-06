import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class copyonwritearraysetnongeneric {
    public static void main(String args[]) {
        CopyOnWriteArraySet cowaset = new CopyOnWriteArraySet();

        cowaset.add("sev");
        cowaset.add("mixture");
        cowaset.add("gathiya");
        cowaset.add("fafda");

        System.out.println(cowaset);

    }
}
