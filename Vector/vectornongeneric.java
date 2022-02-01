import java.util.*;

public class vectornongeneric {
    public static void main(String args[]) {
        Vector list = new Vector();

        list.add("deepak");
        list.add("rajesh");
        list.add("rahul");

        String s1 = (String)list.get(0);
        String s2 = (String)list.get(1);
        String s3 = (String)list.get(2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
