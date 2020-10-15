package JavaCollections;

import java.util.*;

class CompareAge implements Comparator<Person>
{
    public int compare(Person p1, Person p2)
    {
        if(p1.getAge() == p2.getAge()){
            return 0;
        }
        else if(p1.getAge() > p2.getAge()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

class CompareHeight implements Comparator<Person>
{
    public int compare(Person p1, Person p2)
    {
        if(p1.getHeight() == p2.getHeight()){
            return 0;
        }
        else if(p1.getHeight() > p2.getHeight()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class Person {

    private String name;
    private int age;
    private char gender;
    private int height;

    public Person(String name, int age, char gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public boolean equals(Person person) {

        if(this.name.equals(person.name) &&
           this.age == person.age &&
           this.gender == person.gender &&
           this.height == person.height) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                '}';
    }

    public static void main (String [] args) {

        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("Ion", 12, 'm', 134));
        list1.add(new Person("Ana", 23, 'f', 165));
        list1.add(new Person("Ala", 21, 'f', 154));
        list1.add(new Person("Alex", 25, 'm', 180));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Mihai", 34, 'm', 174));
        list2.add(new Person("Ion", 12, 'm', 134));
        list2.add(new Person("Ana", 23, 'f', 165));
        list2.add(new Person("Maria", 23, 'f', 169));

        List<Person> list3 = list1;

        int count;
        for(Person person : list2) {

            count = 0;

            for(Person person1 : list3) {
                if(person1.equals(person)) {
                    count++;
                }
            }

            if(count == 0) {
                list3.add(person);
            }
        }

        for(Person person : list3) {
            System.out.println(person.toString());
        }

        //Part 2

        Scanner input = new Scanner(System.in);
        int criteria = 0;

        int validation = 0;
        while (validation == 0) {
            System.out.println();
            System.out.println("Insert sorting criteria: ");
            System.out.println("Insert 1 to sort by age ");
            System.out.println("Insert 2 to sort by height");
            criteria = input.nextInt();

            if(criteria == 1 || criteria == 2) {
                validation++;
            }
        }

        if(criteria == 1) {
            System.out.println();
            System.out.println("Sort by age: ");
            CompareAge compareAge = new CompareAge();
            Collections.sort(list3, compareAge);
        }
        else {
            System.out.println();
            System.out.println("Sort by height: ");
            CompareHeight compareHeight = new CompareHeight();
            Collections.sort(list3, compareHeight);
        }

        for(Person person : list3) {
            System.out.println(person.toString());
        }
    }
}