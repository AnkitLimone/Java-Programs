import java.util.EnumSet;

public class enumnoneof {
    enum Days{
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
    }
    public static void main(String args[]) {
        EnumSet emptyDays = EnumSet.noneOf(Days.class);
        System.out.println("Empty EnumSet: "+emptyDays);
    }
}
