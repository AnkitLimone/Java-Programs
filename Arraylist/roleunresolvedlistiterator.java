import java.util.*;
import javax.management.relation.RoleUnresolvedList;

public class roleunresolvedlistiterator {
    public static void main(String args[]) {
        
        RoleUnresolvedList runlist = new RoleUnresolvedList();

        runlist.add("Pinku");
        runlist.add("Champakchaha");
        runlist.add("Sodhi");
        runlist.add("Bhide");

        Iterator itr = runlist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
