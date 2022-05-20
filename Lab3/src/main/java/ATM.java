import java.util.ArrayList;

public class ATM {
    int balance, withdraw, deposit;
    static ArrayList<String> output = new ArrayList<String>();
    int userSelect;

    public int getUserSelect() {
        return userSelect;
    }

    public void setUserSelect(int userSelect) {
        this.userSelect = userSelect;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public ArrayList<String> ATM_Machine()
        {
            output.add("Automated Teller Machine");
            output.add("\n[Select choice of coffee ]" +
                    " [ (1) Withdraw ] [ (2) Deposit ] [ (3) Check Balance ]");
            {
                if (getUserSelect() == 1 ) {
                    withdraw = getWithdraw();
                    output.add("\nChoose 1 for Withdraw");
                    output.add("\nEnter money to be withdrawn: " + getWithdraw());
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        output.add("\nDone");
                    } else {
                        output.add("\nInsufficient Balance");
                    }
                }
                else if (getUserSelect() ==  2)
                {
                    deposit = getDeposit();
                    output.add("\nChoose 2 for Deposit");
                    output.add("\nEnter money to be deposited:: " + getDeposit());
                    balance = balance + deposit;
                    output.add("\nYour Money has been successfully deposited");

                }
                else if (getUserSelect() ==  3)
                    output.add("\nChoose 3 for Check Balance");
                    output.add("\nBalance : "+ getBalance());

                }
                //System.out.print(output);
                return output;
                }

    /*public static void main(String[] args) {

    }*/
}


