import java.util.EnumSet;

public class enumallof {
    enum Days {
        Monday, tuesday, wednesday, thrusday, friday, saturday, sunday
    }
    public static void main(String args[]) {
        EnumSet days = EnumSet.allOf(Days.class);
        System.out.println("EnumSet: "+days);
    }
}
