package JavaCore1;

import java.util.Scanner;

public class Task1 {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int number = input.nextInt();

        int sum = 0;
        int temp = number;

        for (int i = 0; i < String.valueOf(number).length(); i++){
           sum += temp % 10;
           temp /= 10;
        }
        System.out.println("The sum of all digits in " + number +" is " + sum);
    }
}
