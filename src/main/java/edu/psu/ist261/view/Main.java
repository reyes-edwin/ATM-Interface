package edu.psu.ist261.view;

import edu.psu.ist261.controller.ATMController;
import edu.psu.ist261.model.Account;
import edu.psu.ist261.model.Bank;
import edu.psu.ist261.model.User;

public class Main {
    public static void main(String[] args) {
        //create frame
        ATMFrame mainFrame = new ATMFrame();

        Bank theBank = new Bank("ReyesEmpireBank");
        User user1 = new User("Edwin", "Reyes", "ejr5508", "1234");
        Account account1 = new Account(5000.00, Account.Type.Checking);
        Account account2 = new Account(1818, Account.Type.Savings);
        user1.addAccount(account2);
        user1.addAccount(account1);

        theBank.addUser(user1);

        System.out.println(user1.getAccount());

        Login log = new Login();
        Home homeScreen = new Home();
        GetBalance balance = new GetBalance();
        BalanceAccountType typePanel = new BalanceAccountType();
        Withdraw withdraw = new Withdraw();
        Deposit deposit = new Deposit();
        WithdrawAccountType withdrawAccountType = new WithdrawAccountType();
        DepositAccountType depositAccountType = new DepositAccountType();



        //create controller
        ATMController controller = new ATMController(homeScreen, log, balance, theBank, typePanel, withdraw, deposit, withdrawAccountType, depositAccountType);
        controller.buttonListener();
        controller.logoutListener();
        controller.balanceListener();
        controller.withdraw();
        controller.deposit();

        mainFrame.add(log);
        mainFrame.add(homeScreen);
        mainFrame.add(balance);
        mainFrame.add(typePanel);
        mainFrame.add(withdraw);
        mainFrame.add(deposit);
        mainFrame.add(withdrawAccountType);
        mainFrame.add(depositAccountType);
        mainFrame.setVisible(true);
    }

}
