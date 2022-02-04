import java.util.*;

import javax.management.relation.RoleList;

public class rolelistiterator {
    public static void main(String args[]) {
        
        RoleList rList = new RoleList();

        rList.add("book1");
        rList.add("book2");

        rList.remove("book1");

        Iterator itr = rList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
