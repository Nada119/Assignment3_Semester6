import java.util.ArrayList;

public class CoffeMachineController {

    public String Driver_getUserCups()
    {
        CoffeMachine u1 ;
        u1 = new CoffeMachine();
        u1.setUserCups(2);
        String Output = String.valueOf(u1.getUserCups());
        return Output;
    }
    public String Driver_getCoffetype()
    {
        CoffeMachine u1 ;
        u1 = new CoffeMachine();
        u1. setCoffetype(2);
        String Output = String.valueOf(u1.getCoffetype());
        return Output;
    }
    public ArrayList<String> Driver_buyMethod()
    {
        CoffeMachine u1 ;
        u1 = new CoffeMachine();
        u1.setUserCups(2);
        u1. setCoffetype(2);
        ArrayList<String> Output = (u1.buyMethod());
        return Output;
    }
    public ArrayList<String> CoffeMachineDriver() {
        CoffeMachine u1 ;
        u1 = new CoffeMachine();
        u1.setUserCups(2);
        u1.setCoffetype(2);
        return u1.mainMenu();

    }
}
