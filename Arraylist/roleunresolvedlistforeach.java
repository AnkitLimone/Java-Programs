import java.util.*;

import javax.management.relation.RoleUnresolvedList;

public class roleunresolvedlistforeach {
    public static void main(String args[]) {
        RoleUnresolvedList runlist = new RoleUnresolvedList();

        runlist.add("Pinku");
        runlist.add("Champakchaha");
        runlist.add("Sodhi");
        runlist.add("Bhide");

        runlist.stream().forEach(System.out::println);
    }
}
