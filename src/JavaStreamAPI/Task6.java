package JavaStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task6 {
    public static void main (String [] args) {

        List<Character> list = new ArrayList<>();

        list.add('a');
        list.add('c');
        list.add('b');
        list.add('e');
        list.add('z');
        list.add('s');
        list.add('t');

        System.out.println("Min element is: " + list.stream().min(Comparator.comparing(Character::valueOf)).get());
        System.out.println("Max element is: " + list.stream().max(Comparator.comparing(Character::valueOf)).get());
    }
}
