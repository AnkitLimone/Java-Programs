import java.util.*;

class arraylist{
    public static void main(String[] args) {
     ArrayList<String> city_List = new ArrayList<String>();
     city_List.add("Delhi");
     city_List.add("Mumbai");
     city_List.add("Chennai");
     city_List.add("Kolkata");
     System.out.println("Initial ArrayList:" +city_List);
     city_List.add(1,"NYC");
     System.out.println("\n ArrayList after Adding element at index 1 : " +city_List);
     ArrayList<String> more_Cites = new ArrayList<String>(Arrays.asList("pune","Hydrabad"));
     city_List.addAll(4,more_Cites);
     System.out.println("\n ArrayList after adding list at index 4:" + city_List);   
    }
}