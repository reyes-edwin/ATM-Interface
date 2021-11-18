package edu.psu.ist261;

public class Main {
    public static void main(String[] args) {
        User user = new User("Edwin", "Reyes", "ejr5508");
        Account account = new Account(5029.70, Account.Type.Checking);

        user.addAccount(account);


        MainFrame mainFrame = new MainFrame();
        LogIn log = new LogIn();
        Home homeScreen = new Home();
        
        mainFrame.add(log);
        mainFrame.add(homeScreen.homeScreen);

        mainFrame.setVisible(true);
    }
}
