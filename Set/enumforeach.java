import java.util.EnumSet;

public class enumforeach {
    enum Days{
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
    }
    public static void main(String args[]) {
        EnumSet days = EnumSet.allOf(Days.class);
        
        System.out.println("EnumSet: ");
        days.stream().forEach(System.out::println);
    }
}
