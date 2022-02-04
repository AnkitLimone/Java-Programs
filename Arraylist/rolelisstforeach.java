import java.util.*;
import javax.management.relation.RoleList;

public class rolelisstforeach {
    public static void main(String args[]) {
        RoleList rList = new RoleList();

        rList.add("book1");
        rList.add("book2");

        rList.remove("book1");

        rList.stream().forEach(System.out::println);
    }
}
