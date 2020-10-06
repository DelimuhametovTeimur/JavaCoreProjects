package JavaCore1;

import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static ArrayList<Person> sortArray (Object array [], int length){

        int sum = 0;
        StringBuilder str = new StringBuilder();
        ArrayList arr = new ArrayList();

        for(int i = 0; i < length; i++){
            if(array[i] instanceof String || array[i] instanceof Character){
                str.append(array[i] + " ");
            }
            else if(array[i] instanceof Integer || array[i] instanceof Long){
                sum += (Integer)array[i];
            }
            else if(array[i] instanceof Person){
                arr.add(array[i]);
            }
        }

        System.out.print("Sum of numbers is: " + sum + "\n");
        System.out.print("String is : " + str);

        return arr;
    }

    public static void main (String args[]){

        Object array [] = new Object[11];

        array[0] = "This";
        array[1] = new Person("Will", 23, 'm');
        array[2] = 1111111;
        array[3] = "is";
        array[4] = new Person("Anna", 21, 'f');
        array[5] = 2;
        array[6] = 'a';
        array[7] = new Person("Sandra", 27, 'f');
        array[8] = "life";
        array[9] = new Person("John", 30, 'm');
        array[10] = 111;

        ArrayList<Person> arr = new ArrayList<Person>();
        arr = sortArray(array, 11);

        System.out.println("\nPersons are: ");
        for(Person x : arr){
            System.out.println(x.name + " " + x.age + " " + x.gender);
        }
    }
}
