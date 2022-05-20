import java.util.ArrayList;

public class ATM_Controller {

    public String Driver_getUserSelect()
    {
        ATM u1 ;
        u1 = new ATM();
        u1.setUserSelect(2);
        String Output = String.valueOf(u1.getUserSelect());
        return Output;
    }
    public String Driver_getWithdraw()
    {
        ATM u1 ;
        u1 = new ATM();
        u1.setWithdraw(100);
        String Output = String.valueOf(u1.getWithdraw());
        return Output;
    }
    public String Driver_getDeposit()
    {
        ATM u1 ;
        u1 = new ATM();
        u1.setDeposit(100);
        String Output = String.valueOf(u1.getDeposit());
        return Output;
    }
    public ArrayList<String> ATM_Machine1Driver() {
        ATM u1 ;
        u1 = new ATM();
        u1.setBalance(10000);
        u1.setUserSelect(1);
        u1.setWithdraw(5000);
        return u1.ATM_Machine();

    }
    public ArrayList<String> ATM_Machine2Driver() {
        ATM u1 ;
        u1 = new ATM();
        u1.setBalance(3000);
        u1.setUserSelect(2);
        u1.setWithdraw(6000);
        return u1.ATM_Machine();

    }
    public ArrayList<String> ATM_Machine3Driver() {
        ATM u1 ;
        u1 = new ATM();
        u1.setBalance(9000);
        u1.setUserSelect(3);
        return u1.ATM_Machine();

    }
}
