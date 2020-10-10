package JavaOOP;

import java.util.Scanner;

public class UseEmployee {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        Employee employee1 = new Employee();

        System.out.println("Insert the number of hours: ");
        employee1.hours = input.nextInt();

        System.out.println("Tariff per hour is : " + employee1.getTariffPerHour());
        System.out.println("Employee1 salary is : " + employee1.getSalary());

        //Task7
        Manager manager = new Manager();
        System.out.println("\nInsert the number of hours for manager: ");
        manager.hours = input.nextInt();

        System.out.println("Tariff per hour is : " + manager.getTariffPerHour());
        System.out.println("Manager salary is : " + manager.getSalary());

    }
}
