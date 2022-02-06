import java.util.*;

public class abstractsetnongeneric {
    public static void main(String args[]) {
        
        AbstractSet abset = new TreeSet();

        abset.add("puma");
        abset.add("adidas");
        abset.add("nike");
        abset.add("Bata");

        Iterator itr = abset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
