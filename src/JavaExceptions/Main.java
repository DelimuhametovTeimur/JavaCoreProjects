package JavaExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        WarShip ship1 = new WarShip("Ship1", WarShip.Type.Destroyer, 50, -5, -1);
        WarShip ship2 = new WarShip("Ship2", WarShip.Type.Destroyer, 23, 1000, 20);
        WarShip ship3 = new WarShip("Ship3", WarShip.Type.Cruiser, 100, 1700, 41);
        WarShip ship4 = new WarShip("Ship4", WarShip.Type.Cruiser, 110, 1700, 60);
        WarShip ship5 = new WarShip("Ship5", WarShip.Type.Battleship, 180, 3300, 85);

        List<WarShip> ships = new ArrayList<>();
        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);
        ships.add(ship4);
        ships.add(ship5);

        System.out.println();
        Scanner input = new Scanner(System.in);
        int rate = 0;

        for(WarShip wS : ships){
            try {
                wS.isStrongShip();
            }
            catch (NullPointerException e1){
                System.out.println("Null Pointer Exception in list: ships");
            }
            catch (MyException e2) {
                System.out.println(e2.getMessage());
            }
            finally {
                try{
                    System.out.println("Rate this ship from 0 to 10:");
                    rate = input.nextInt();
                }
                catch(Exception e){
                    System.out.println("Exception found");
                    rate = 5;
                }
                finally {
                    System.out.println(wS.getName() + " was verified successful!");
                    if(rate < 0 || rate > 10) { rate = 5;}
                    System.out.println("Ship given rate is: " + rate);
                    System.out.println();
                }
            }
        }
    }
}
