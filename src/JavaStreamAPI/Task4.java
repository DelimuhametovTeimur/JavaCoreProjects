package JavaStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main (String [] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");

        list.stream().map(Integer::valueOf).collect(Collectors.toList()).forEach(System.out::println);
    }
}