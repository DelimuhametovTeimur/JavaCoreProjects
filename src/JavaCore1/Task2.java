package JavaCore1;

import java.util.Scanner;

public class Task2 {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String string = input.nextLine();

        StringBuilder string2 = new StringBuilder();
        StringBuilder temp = new StringBuilder(string);

        for(int i = temp.length() - 1; i >= 0; i--){

            string2.append(temp.substring(i));
            temp.delete(temp.length() - 1, temp.length());
        }

        System.out.println("Output: "+string2);
    }
}
