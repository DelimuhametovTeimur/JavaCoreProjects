package JavaExceptions;

public class WarShip {

    private String name;
    private Type type;
    private int firePower;
    private int range;
    private int armor;

    public WarShip (String name, Type type, int firePower, int range, int armor) {
        this.name = name;
        this.type = type;

        try {
            this.firePower = firePower;
            if(firePower < 0) { throw new MyException(firePower);}
        }
        catch (MyException e) {
            this.firePower = 1;
        }

        try {
            this.range = range;
            if(range < 0) { throw new MyException("range", range);}
        }
        catch (MyException e) {
            this.range = 1;
        }

        try {
            this.armor = armor;
            if(armor < 0) { throw new MyException(armor);}
        }
        catch (MyException e) {
            this.armor = 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getFirePower() {
        return firePower;
    }

    void isStrongShip() throws MyException {

        if((type.equals(Type.Destroyer) && firePower < 50) ||
           (type.equals(Type.Cruiser) && firePower < 100) ||
           (type.equals(Type.Battleship) && firePower < 150)) {
                throw new MyException(name + " fire power is weak for a strong " + type);
        }
        else if((type.equals(Type.Destroyer) && range < 1000) ||
                (type.equals(Type.Cruiser) && range < 1500) ||
                (type.equals(Type.Battleship) && range < 3000)) {
                    throw new MyException(name + " range is small for a strong " + type);
        }
        else if ((type.equals(Type.Destroyer) && armor < 30) ||
                (type.equals(Type.Cruiser) && armor < 50) ||
                (type.equals(Type.Battleship) && armor < 90)) {
            throw new MyException(name + " armor is weak for a strong " + type);
        }
        else {
            System.out.println(name + " is a powerful " + type);
        }
    }

    enum Type {
        Destroyer,
        Cruiser,
        Battleship,
    }
}
