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

        int k = 0;

        for(int i = 0; i < arr.length - 1; i++)
        {
            k = i + 1;

            for(int j = i + 1; j < arr.length; j++){

                //Cautam cel mai mare numar sa fie primul(apoi restul in ordine crescatoare)
                if(i == 0 && arr[i] < arr[1] && k == 2){
                    break;
                }
                else if(arr[i] > arr[j]){
                    k++;
                }
            }

            if(k != i + 1) { //Daca numarul e pe pozita lui nu il schimbam
                arr = reverse(arr, k);

                if(k > 2){ //Daca au fost inversate mai mult de 2 nr, incepem de la inceput ciclul
                    i = -1;
                }
            }
        }
        return arr;
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

        System.out.print("\nUnsorted array is: [");
        for(int i = 0; i < length; i++)
        {
            if(i < length - 1){
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i] + "]");
            }
        }

        int newArray [] = sort(array);

        System.out.print("\n  Sorted array is: [");
        for(int i = 0; i < length; i++)
        {
            if(i < length - 1){
                System.out.print(newArray[i] + ", ");
            }
            else {
                System.out.print(newArray[i] + "]");
            }
        }
    }
}
