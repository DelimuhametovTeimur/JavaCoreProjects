package JavaCore1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task3 {

    public static boolean checkPalindrome(int number){

        int newNumber = 0;
        int temp = number;

        for (int i = String.valueOf(temp).length(); i > 0; i--){
            newNumber += temp % 10 * pow(10, i - 1);
            temp /= 10;
        }

        if(newNumber == number){
            return true;
        }
        return false;
    }

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = input.nextInt();

        System.out.println("Output: " + checkPalindrome(number));
    }
}
