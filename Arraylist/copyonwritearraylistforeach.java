import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyonwritearraylistforeach {
    public static void main(String args[]) {
        CopyOnWriteArrayList<String> cowalist = new CopyOnWriteArrayList<>();

        cowalist.add("Poha");
        cowalist.add("Jalebi");
        cowalist.add("kachori");
        cowalist.add("samosa");

        cowalist.stream().forEach(System.out::println);
    }
}
