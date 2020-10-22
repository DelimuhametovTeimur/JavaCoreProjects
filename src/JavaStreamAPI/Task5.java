package JavaStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main (String [] args) {

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(29);
        list.add(13);
        list.add(24);
        list.add(5);
        list.add(56);
        list.add(17);

        System.out.println("Min element is: " + list.stream().mapToInt(element -> element).min().getAsInt());
        System.out.println("Max element is: " + list.stream().mapToInt(element -> element).max().getAsInt());
    }
}
