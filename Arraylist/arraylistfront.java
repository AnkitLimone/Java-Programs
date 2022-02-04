import java.util.ArrayList;
public class arraylistfront{
    public static void main(String[] agrs){
        ArrayList<Integer> numList =new ArrayList<Integer>();
        numList.add(5);
        numList.add(7);
        numList.add(9);
        System.out.println("Initial ArrayList:");
        System.out.println(numList);

        numList.add(0,3);
        numList.add(0,1);

        System.out.println("ArrayList after adding elements at the beginning:");
        System.out.println(numList);
    }
}