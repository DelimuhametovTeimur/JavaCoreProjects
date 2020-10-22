package JavaStreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static Integer returnNElement(List<Integer> list, int n) {
        return list.stream().mapToInt(elem -> list.get(n)).findAny().getAsInt();
    }

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int n = 1;
        int validation = 0;
        while (validation == 0) {

            System.out.print("Input the position of the element: ");
            n = input.nextInt();

            if(n > 0 && n <= list.size()) {
                validation++;
            }
        }

        System.out.println(returnNElement(list, n - 1));
    }
}
