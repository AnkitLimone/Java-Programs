import java.util.*;

public class hashsetforeach {
    public static void main(String args[]) {
        
        Set<String> hset =new HashSet<>();

        hset.add("jethalal");
        hset.add("tarakmehta");
        hset.add("hansraj");
        hset.add("popatlal");

        hset.stream().forEach(System.out::println);
    }
}
