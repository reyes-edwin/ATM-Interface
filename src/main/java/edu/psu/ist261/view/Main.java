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
        User user = new User("Edwin", "Reyes", "ejr5508", "1234");
        User user1 = new User("John", "Reyes", "jor1234", "1234");
        Account account = new Account(5029.70, Account.Type.Checking);
        Account account1 = new Account(10343.34 , Account.Type.Savings);

        user.addAccount(account);
        user.addAccount(account1);

        System.out.println(user);







        theBank.addUser(user);
        theBank.addUser(user1);


//        LogInPanel log = new LogInPanel();
//        HomePanel homeScreen = new HomePanel();
//        BalancePanel balance = new BalancePanel();
//        AccountTypePanel typePanel = new AccountTypePanel();
//
//        //create controller
//        ATMController controller = new ATMController(homeScreen, log, balance, theBank, typePanel);
//        controller.buttonListener();
//        controller.logoutListener();
//        controller.balanceListener();
//
//
//
//        mainFrame.add(log);
//        mainFrame.add(homeScreen);
//        mainFrame.add(balance);
//        mainFrame.add(typePanel);
//        mainFrame.setVisible(true);




    }

}
