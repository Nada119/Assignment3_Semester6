import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ATM_ControllerTest {

    @Test
    void Driver_getUserSelectTest() {
        ATM u1 ;
        u1 = new ATM();
        u1.setUserSelect(2);
        String Real_Output = String.valueOf(u1.getUserSelect());

        ATM_Controller u2 = new ATM_Controller();
        String Expected_Output = String.valueOf(u2.Driver_getUserSelect());

        assertEquals(Expected_Output, Real_Output);

    }
    @Test
    void Driver_getWithdrawTest() {
        ATM u1 ;
        u1 = new ATM();
        u1.setWithdraw(100);
        String Real_Output = String.valueOf(u1.getWithdraw());

        ATM_Controller u2 = new ATM_Controller();
        String Expected_Output = String.valueOf(u2.Driver_getWithdraw());

        assertEquals(Expected_Output, Real_Output);

    }
    @Test
    void Driver_getDepositTest() {
        ATM u1 ;
        u1 = new ATM();
        u1.setDeposit(100);
        String Real_Output = String.valueOf(u1.getDeposit());

        ATM_Controller u2 = new ATM_Controller();
        String Expected_Output = String.valueOf(u2.Driver_getDeposit());

        assertEquals(Expected_Output, Real_Output);

    }
    @Test
    void CoffeMachineControllerTest1() throws IOException {
        ArrayList<String> realOutput ;
        ArrayList<String> expextedOutput ;

        ATM u1 ;
        u1 = new ATM();
        u1.setBalance(10000);
        u1.setUserSelect(1);
        u1.setWithdraw(5000);
        realOutput =  u1.ATM_Machine();
        //System.out.print (realOutput);

        ATM_Controller u2 = new ATM_Controller();
        expextedOutput = u2.ATM_Machine1Driver();

        assertEquals(expextedOutput, realOutput);

    }
    @Test
    void CoffeMachineControllerTest2() throws IOException {
        ArrayList<String> realOutput ;
        ArrayList<String> expextedOutput ;

        ATM u1 ;
        u1 = new ATM();
        u1.setBalance(3000);
        u1.setUserSelect(2);
        u1.setWithdraw(6000);
        realOutput = u1.ATM_Machine();
        //System.out.print (realOutput);

        ATM_Controller u2 = new ATM_Controller();
        expextedOutput = u2.ATM_Machine2Driver();

        assertEquals(expextedOutput, realOutput);

    }
    @Test
    void CoffeMachineControllerTest3() throws IOException {
        ArrayList<String> realOutput ;
        ArrayList<String> expextedOutput ;

        ATM u1 ;
        u1 = new ATM();
        u1.setBalance(9000);
        u1.setUserSelect(3);
        realOutput = u1.ATM_Machine();
        //System.out.print (realOutput);

        ATM_Controller u2 = new ATM_Controller();
        expextedOutput = u2.ATM_Machine3Driver();

        assertEquals(expextedOutput, realOutput);

    }


}