package JavaCore1;

import java.util.Scanner;

public class Task5 {

    public static int[] reverse(int [] arr, int k){

        int newArr [] = new int[arr.length];
        int j = k-1;

        for(int i = 0; i < arr.length; i++){
            if(i < k){
                newArr[i] = arr[j];
                j--;
            }
            else{
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public static int[] sort(int [] arr){

        int newArr [] = new int[arr.length];

        Scanner input = new Scanner(System.in);

        System.out.print("Input k: ");
        int k = input.nextInt();

        return reverse(arr, k);
    }

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Input array length: ");
        int length = input.nextInt();

        int array [] = new int [length];

        System.out.println("Input array elements: ");
        for(int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }

        int newArray [] = sort(array);

        System.out.print("Sorted array is: ");
        for(int i = 0; i < length; i++)
        {
            System.out.print(newArray[i] + " ");
        }
    }
}
