import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CoffeMachineControllerTest {

    @Test
    void Driver_getUserCupsTest() {
        CoffeMachine u1 ;
        u1 = new CoffeMachine();
        u1.setUserCups(2);
        String Real_Output = String.valueOf(u1.getUserCups());

        CoffeMachineController u2 = new CoffeMachineController();
        String Expected_Output = String.valueOf(u2.Driver_getUserCups());

        assertEquals(Expected_Output, Real_Output);

    }
    @Test
    void Driver_getCoffetypeTest() {
        CoffeMachine u1 ;
        u1 = new CoffeMachine();
        u1. setCoffetype(2);
        String Real_Output = String.valueOf(u1.getCoffetype());

        CoffeMachineController u2 = new CoffeMachineController();
        String Expected_Output = String.valueOf(u2.Driver_getCoffetype());

        assertEquals(Expected_Output, Real_Output);

    }
    @Test
    void Driver_buyMethodTest() {
        CoffeMachine u1 ;
        u1 = new CoffeMachine();
        u1.setUserCups(2);
        u1. setCoffetype(2);
        ArrayList<String> Real_Output = (u1.buyMethod());

        CoffeMachineController u2 = new CoffeMachineController();
        ArrayList<String> Expected_Output = (u2.Driver_buyMethod());

        assertEquals(Expected_Output, Real_Output);

    }
    @Test
    void CoffeMachineControllerTest() throws IOException {
        ArrayList<String> realOutput ;
        ArrayList<String> expextedOutput ;

        CoffeMachine u1 = new CoffeMachine();
        u1.setUserCups(2);
        u1.setCoffetype(2);
        realOutput = u1.mainMenu();
        //System.out.print (realOutput);

        CoffeMachineController u2 = new CoffeMachineController();
        expextedOutput = u2.CoffeMachineDriver();

        assertEquals(expextedOutput, realOutput);

    }


}