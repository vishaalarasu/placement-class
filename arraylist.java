import java.util.ArrayList;
import java.util.Collections;
public class arraylist{
    public static void main(String[] args){
        ArrayList<Integer>cars=new ArrayList<Integer>();
        cars.add(67);
        cars.add(32);
        cars.add(45);
        cars.add(13);
        cars.add(44);
    Collections.sort(cars);
    for(int i:cars){
        System.out.println(i);
    }
    Collections.sort(cars,Collections.reverseOrder());

    for(int i:cars){
        System.out.println(i);
    }
}

}