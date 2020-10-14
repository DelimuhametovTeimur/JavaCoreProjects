package JavaExceptions;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public MyException(int wrongData){
        System.out.println("Value " + wrongData + " is incorrect");
    }

    public MyException(String valueName, int wrongData){
        System.out.println("Value " + wrongData + " is impossible for " + valueName);
    }
}