import java.util.*;

public class abstractlistiterator {
    public static void main(String args[]) {
        
        AbstractList <String> ablist = new ArrayList<>();

        ablist.add("Bhalu");
        ablist.add("Cow");
        ablist.add("Bhess");
        ablist.add("Billi");
        ablist.add("kutta");

        System.out.println("***********************************");
        System.out.println("Elements in the list 1 :"+ablist);

        ablist.add(2,"Bakri");

        System.out.println("************************************");
        System.out.println("After adding bakri in list 1:"+ ablist);

        //AbstractList<String> ablist2 = new ArrayList<>();

        Iterator <String> itr = ablist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
