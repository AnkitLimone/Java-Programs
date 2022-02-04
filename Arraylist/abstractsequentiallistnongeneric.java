import java.util.*;
import java.util.AbstractList;
import java.util.AbstractSequentialList;

public class abstractsequentiallistnongeneric {
    public static void main(String args[]) {
        AbstractSequentialList aslist = new LinkedList();

        aslist.add("batman");
        aslist.add("Superman");
        aslist.add("Wonderwoman");
        aslist.add("flash");


        String s1 = (String)aslist.get(0);
        String s2 = (String)aslist.get(1);
        String s3 = (String)aslist.get(2);
        String s4 = (String)aslist.get(3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }
}
