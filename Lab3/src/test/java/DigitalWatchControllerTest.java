import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchControllerTest {

    @Test
    void Driver_printTimeTest()  {
        ArrayList<String> realOutput;
        ArrayList<String> expextedOutput;
        DigitalWatch D1 = new DigitalWatch();
        realOutput =  D1.printTime();

        DigitalWatchController D2 = new DigitalWatchController();
        expextedOutput = D2.Driver_printTime();

        assertEquals(expextedOutput, realOutput);

    }

    @Test
    void DigitalWatchControllerTest()  {
        ArrayList<String> realOutput ;
        ArrayList<String> expextedOutput ;

        realOutput =  new DigitalWatch();
        //System.out.print (realOutput);

        expextedOutput = new DigitalWatchController();

        assertEquals(expextedOutput, realOutput);

    }

}