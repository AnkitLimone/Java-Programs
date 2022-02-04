import java.util.ArrayList;
 
public class arraylistforeach {  
    public static void main(String[] args) {
        ArrayList<Car> arrayList = new ArrayList<Car>();
        arrayList.add(new Car(1, "Yamaha"));
        arrayList.add(new Car(2, "Maruti"));
        arrayList.add(new Car(3, "Suzuki"));
         
        arrayList.forEach((bike) -> {
            System.out.println(bike.id + " - " + bike.name);
        });
    }  
}
 
class Car {
    int id;
    String name;
    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }
}