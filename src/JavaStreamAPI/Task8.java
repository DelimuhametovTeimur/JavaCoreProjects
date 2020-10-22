package JavaStreamAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Task8 {
    public static void main (String [] args) {

        File file = new File("forTask8.txt");
        String path = file.getAbsolutePath();

        try(Stream<String> list = Files.lines(Paths.get(path))) {
            list.forEach(System.out::println);
        }
        catch(IOException e) {
            System.out.println("Error with txt file");
        }
    }
}