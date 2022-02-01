import java.util.*;
import java.util.Vector;

public class vectorforeach {
    public static void main(String args[]) {
        
    
    Vector<String> color = new Vector<String>();

    color.add("Black");
    color.add("orange");
    color.add("yellow");

    color.forEach(element -> {
        System.out.println(element);
    });
}
}
