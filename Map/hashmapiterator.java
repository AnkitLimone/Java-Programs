import java.util.*;


public class hashmapiterator {
    public static void main(String args[]) {
        
        HashMap<Integer,String> hmap = new HashMap<Integer, String>();

        hmap.put(1,"aaa");
        hmap.put(2,"kkkk");
        hmap.put(3,"mk");
        hmap.put(4,"jjj");
        hmap.put(1, "ajjskd");

        

           Iterator<Integer> itr = hmap.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            System.out.println("Key = " + key + " & Value =  " + hmap.get(key)+"\n");
        }


    }
}
