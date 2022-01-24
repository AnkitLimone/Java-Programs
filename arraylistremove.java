import java.util.*;
class arraylistremove{
    public static void main(String args[]) {
        ArrayList<String> city_List = new ArrayList<String>(Arrays.asList("Delhi","mumbnai","chennai","kolkata","Pune","hyd"));
        System.out.println("Initial Arraylist: " + city_List);
        city_List.remove(2);
        System.out.println("\nArraylist after removing element at index 2 : "+city_List);
        city_List.remove("kolkata");
        System.out.println("\nArraylist after removing element -> kolkata :"+ city_List );
        ArrayList<String> newCities = new ArrayList<String>(Arrays.asList("Delhi","hyd"));
        city_List.removeAll(newCities);
        System.out.println("\nArraylist after call to removeAll :"+city_List);
        
    }
}