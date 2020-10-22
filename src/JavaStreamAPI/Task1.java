package JavaStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main (String [] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.stream().mapToInt(newList -> (newList * 2)).forEach(System.out::println);
    }
}
