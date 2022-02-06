import java.util.*;

public class hashsetiterator {
    public static void main(String args[]) {
        
        Set<String> hset =new HashSet<>();

        hset.add("jethalal");
        hset.add("tarakmehta");
        hset.add("hansraj");
        hset.add("popatlal");

        Iterator<String> itr = hset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
