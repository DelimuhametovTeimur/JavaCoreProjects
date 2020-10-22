package JavaStreamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public static String reverseString(String string) {
        return Stream.of(string).map(str -> new StringBuilder(str).reverse()).collect(Collectors.joining());
    }

    public static void main (String [] args) {

        String string = "java";
        System.out.println(reverseString(string));
    }
}
