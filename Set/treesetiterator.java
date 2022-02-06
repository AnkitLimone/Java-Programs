import java.util.*;

public class treesetiterator {
    public static void main(String args[]) {
         Set<String> tset = new TreeSet<>();

         tset.add("kamlesh");
         tset.add("lankesh");

         Iterator<String> itr = tset.iterator();
         while(itr.hasNext()){
             System.out.println(itr.next());
         }
    }
}
