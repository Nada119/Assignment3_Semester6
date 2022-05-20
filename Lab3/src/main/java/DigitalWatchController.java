import java.util.ArrayList;

public class DigitalWatchController extends ArrayList<String> implements Runnable{


    public ArrayList<String> Driver_printTime() {
        DigitalWatch D1 = new DigitalWatch();
        return D1.printTime();

    }
    public ArrayList<String> DigitalWatchDriver() {
        return new DigitalWatch();
    }

    @Override
    public void run() {
        DigitalWatchDriver();


    }
}
