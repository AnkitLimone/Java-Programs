import java.util.*;

public class treesetforeach {
    public static void main(String args[]) {
        Set<String> tset = new TreeSet<>();

         tset.add("kamlesh");
         tset.add("lankesh");

         tset.stream().forEach(System.out::println);
    }
}
