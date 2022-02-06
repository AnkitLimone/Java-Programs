import java.util.EnumSet;

public class enumrange {
    enum Days{
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
    }
    public static void main(String args[]) {
        EnumSet rangeDays = EnumSet.range(Days.Tuesday, Days.Friday);
        System.out.println("EnumSet: "+rangeDays);
    }
}
