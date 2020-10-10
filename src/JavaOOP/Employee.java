package JavaOOP;

public class Employee {

    private double tariffPerHour = 5.5;
    public int hours;

    public double getSalary() {
        return tariffPerHour * (double)hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }
}
