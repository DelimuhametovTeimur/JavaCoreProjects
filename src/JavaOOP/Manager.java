package JavaOOP;

public class Manager extends Employee {

    @Override
    public double getSalary() {
        return super.getSalary() * 1.5;
    }
}
