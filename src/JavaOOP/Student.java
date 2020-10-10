package JavaOOP;

public class Student {

    private String name;
    private int age;

    public Student(){
        this.name = "Unknown";
        this.age = 0;
    }

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main (String [] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        student1.setData("Ion", 23);
        student2.setData("Ana", 26);

        System.out.println("Average age is: " + (double)(student1.getAge() + student2.getAge())/2);
    }
}
