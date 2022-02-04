import java.util.*;

class arraylistiterator{
    public static void main(String args[]){
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Hyd");
        cities.add("Delhi");

        System.out.println("List contents using Iterator() method:");
        Iterator iter = cities.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next() + " ");
        }
        System.out.println("\n\nList contents using listIterator() method:");
        ListIterator<String> list_iter = cities.listIterator();
        while(list_iter.hasNext()){
            System.out.println(list_iter.next() + " ");
        }
    }
}