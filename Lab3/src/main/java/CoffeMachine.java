/**
 * Created November 23, 2019
 *
 * By: Seyhan A. Cileli
 *
 * Github: HanSupreme
 *
 * "Spread Love!"
 *         - Sey'
 */

import java.io.*;
import java.util.ArrayList;

public class CoffeMachine {


    static ArrayList<String> output = new ArrayList<String>();
    int userCups;
    int coffetype;

    public CoffeMachine() {
    }

    public int getCoffetype() {
        return coffetype;
    }

    public void setCoffetype(int coffetype) {
        this.coffetype = coffetype;
    }

    public int getUserCups() {
        return userCups;
    }

    public void setUserCups(int userCups) {
        this.userCups = userCups;
    }


    public ArrayList<String> mainMenu()  {


        output.add("[ COFFEE MACHINE MENU  ]");
        output.add("\n[ BUY ]");
        return buyMethod();

    }

    public ArrayList<String> buyMethod()  {

        output.add("\n[Select choice of coffee ]" +
                " [ (1) Espresso ] [ (2) Latte ] [ (3) Cappuccino ]");

        userCups = getUserCups();
        coffetype = getCoffetype();

        output.add("\nCoffe Type: "+coffetype);
        output.add("\nuserCups: " + userCups);

        output.add
                    ("\n Starting to make coffee" +
                            "\n Grinding coffee beans" +
                            "\n Boiling water" +
                            "\n Mixing boiled water with crushed coffee beans" +
                            "\n Pouring coffee into the cup" +
                            "\n Pouring some milk into the cup" +
                            "\n Coffee is ready!");;


        output.add("\nCost is "+ (60*userCups));
        //System.out.println (output);

        return output;
    }

    /*public static void main(String[] args) throws IOException {

    }*/

}
