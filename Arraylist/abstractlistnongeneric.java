import java.util.*;
public class abstractlistnongeneric {
    public static void main(String args[]) {
        AbstractList  ablist = new ArrayList();

        ablist.add("Bhalu");
        ablist.add("Cow");
        ablist.add("Bhess");
        ablist.add(45);
        ablist.add("kutta");

        System.out.println("***********************************");
        System.out.println("Elements in the list :"+ablist);

        ablist.add(2,56.36);

        System.out.println("************************************");
        System.out.println("After adding bakri in list :"+ ablist);
    }
}
