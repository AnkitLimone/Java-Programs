import java.util.EnumSet;
import java.util.Iterator;

public class enumiterator {
    enum Days{
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
    }
    public static void main(String args[]) {
        EnumSet days = EnumSet.allOf(Days.class);
        Iterator itr = days.iterator();

        System.out.print("EnumSet: ");
        while(itr.hasNext()){
            System.out.print(itr.next());
            System.out.print(", ");
        }
    }
}
