package JavaCore1;

import java.util.Scanner;

public class Task4 {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String string = input.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;

        for(int i = 0; i < string.length(); i++){

            if((string.charAt(i) > 64 && string.charAt(i) < 91) || (string.charAt(i) > 96 && string.charAt(i) < 123))
                letters++;
            else if (string.charAt(i) == 32)
                spaces++;
            else if(string.charAt(i) > 47 && string.charAt(i) < 58)
                numbers++;
            else
                other++;
        }

        System.out.println("letters: " + letters);
        System.out.println("spaces: " + spaces);
        System.out.println("numbers " + numbers);
        System.out.println("other: " + other);
    }
}
