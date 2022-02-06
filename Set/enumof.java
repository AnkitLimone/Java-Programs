import java.util.*;

public class enumof {
    enum Days {
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
    }

    public static void main(String args[]) {
        EnumSet days1 = EnumSet.of(Days.Sunday);
        System.out.println("EnumSet1: "+days1);

        EnumSet days2 = EnumSet.of(Days.Saturday, Days.Sunday);    
        System.out.println("EnumSet2: "+days2);
    }
}
