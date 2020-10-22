package JavaStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static void main (String [] args) {

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(29);
        list.add(24);
        list.add(24);
        list.add(12);
        list.add(56);
        list.add(12);

        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }
}