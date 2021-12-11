package edu.psu.ist261.controller;

import edu.psu.ist261.model.Account;
import edu.psu.ist261.model.Bank;
import edu.psu.ist261.model.User;
import edu.psu.ist261.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMController {
    private Bank bank;
    private Home homeView;
    private Login loginView;
    private GetBalance balance;
    private Withdraw withdraw;
    private Deposit deposit;
    private BalanceAccountType balanceAccountType;
    private WithdrawAccountType withdrawAccountType;
    private DepositAccountType depositAccountType;

    public ATMController(Home homeView, Login loginView, GetBalance balance, Bank bank,
                         BalanceAccountType balanceAccountType, Withdraw withdraw, Deposit deposit,
                         WithdrawAccountType withdrawAccountType, DepositAccountType depositAccountType) {
        this.homeView = homeView;
        this.loginView = loginView;
        this.balance = balance;
        this.bank = bank;
        this.balanceAccountType = balanceAccountType;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.withdrawAccountType = withdrawAccountType;
        this.depositAccountType = depositAccountType;
    }

    public void logIn() {
        loginView.getLogInButton().addActionListener(e -> {
            String userName = loginView.getUserNameField().getText();
            String password = String.valueOf(loginView.getPasswordField().getPassword());
            User user = bank.getUser(userName);

            if (user == null) {
                loginView.displayNoUserExist();
                return;
            }

            if (userName.equals(user.getUuid()) && password.equals(user.getPinNumber())) {
                loginView.setVisible(false);
                homeView.setVisible(true);
                homeView.getUserName().setText(user.getFullName());
            } else {
                loginView.displayIncorrectCredentials();
            }
        });
    }

    public void logout() {
        homeView.getLogout().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int results = homeView.displayConfirmLogout();
                if (results == 0) {
                    homeView.setVisible(false);
                    loginView.setVisible(true);
                    loginView.getUserNameField().setText("");
                    loginView.getPasswordField().setText("");
                }
            }
        });
    }

    public void quickCash() {
        homeView.getQuickCash().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = loginView.getUserNameField().getText();
                User user = bank.getUser(userName);

                int results = homeView.displayQuickCashMessage();
                if (results == 0) {
                    user.getAccountID(userName).withdraw(50);
                    homeView.quickCashConfirmation();
                }
            }
        });
    }

    public void withdraw() {
        homeView.getWithdraw().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeView.setVisible(false);
                withdrawAccountType.setVisible(true);
            }
        });

        withdrawAccountType.getChecking().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = loginView.getUserNameField().getText();
                User user = bank.getUser(userName);

                withdrawAccountType.setVisible(false);
                withdraw.setVisible(true);
                withdraw.getType().setText(user.getAccountID(userName).getAccountType().toString());
            }


        });

        withdrawAccountType.getSavings().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);

//                Checks if user has a savings account
                if (!user.getAccountID(uuid).getAccountType().equals(Account.Type.Savings)) {
                    withdrawAccountType.displayErrorMessage();
                }
            }
        });

        withdraw.getTwenty().addActionListener(e -> {
            int results = withdraw.confirmWithdrawMessage(withdraw.getTwenty().getText());

            if (results == 0) {
                withdraw.amountWithdrewConfirmation(withdraw.getTwenty().getText());
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);
                user.getAccountID(uuid).withdraw(Integer.parseInt(withdraw.getTwenty().getText()));
            }
        });

        withdraw.getForty().addActionListener(e -> {
            int results = withdraw.confirmWithdrawMessage(withdraw.getForty().getText());

            if (results == 0) {
                withdraw.amountWithdrewConfirmation(withdraw.getForty().getText());
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);
                user.getAccountID(uuid).withdraw(Integer.parseInt(withdraw.getForty().getText()));
            }
        });

        withdraw.getSixty().addActionListener(e -> {
            int results = withdraw.confirmWithdrawMessage(withdraw.getSixty().getText());

            if (results == 0) {
                withdraw.amountWithdrewConfirmation(withdraw.getSixty().getText());
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);
                user.getAccountID(uuid).withdraw(Integer.parseInt(withdraw.getSixty().getText()));
            }
        });

        withdraw.getEighty().addActionListener(e -> {
            int results = withdraw.confirmWithdrawMessage(withdraw.getEighty().getText());

            if (results == 0) {
                withdraw.amountWithdrewConfirmation(withdraw.getEighty().getText());
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);
                user.getAccountID(uuid).withdraw(Integer.parseInt(withdraw.getEighty().getText()));
            }
        });

        withdraw.getOneHundred().addActionListener(e -> {
            int results = withdraw.confirmWithdrawMessage(withdraw.getOneHundred().getText());

            if (results == 0) {
                withdraw.amountWithdrewConfirmation(withdraw.getOneHundred().getText());
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);
                user.getAccountID(uuid).withdraw(Integer.parseInt(withdraw.getOneHundred().getText()));
            }
        });

        withdraw.getOther().addActionListener(e -> {
            try {
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);

                String results = withdraw.displayInput();

                if (Integer.parseInt(results) > 0 && Integer.parseInt(results) > user.getAccountID(uuid).getBalance()) {
                    withdraw.displayInsufficientAmount();
                } else {
                    user.getAccountID(uuid).withdraw(Integer.parseInt(results));
                    withdraw.confirmationMessage(results);
                    withdraw.setVisible(false);
                    homeView.setVisible(true);
                }
            } catch (NumberFormatException | NullPointerException ex) {
            }
        });

        withdrawAccountType.getHomeBTN().addActionListener(e -> {
            withdrawAccountType.setVisible(false);
            homeView.setVisible(true);
        });

        withdraw.getHomeBTN().addActionListener(e -> {
            withdraw.setVisible(false);
            homeView.setVisible(true);
        });
    }

    public void deposit() {
        homeView.getDeposit().addActionListener(e -> {
            depositAccountType.setVisible(true);
            homeView.setVisible(false);
        });

        depositAccountType.getChecking().addActionListener(e -> {
            depositAccountType.setVisible(false);
            deposit.setVisible(true);
        });

        depositAccountType.getSavings().addActionListener(e -> {
            String uuid = loginView.getUserNameField().getText();
            User user = bank.getUser(uuid);

//                Checks if user has a savings account
            if (!user.getAccountID(uuid).getAccountType().equals(Account.Type.Savings)) {
                depositAccountType.displayErrorMessage();
            }
        });

        deposit.getSubmit().addActionListener(e -> {
            String input = deposit.getUserAmount().getText();
            String userName = loginView.getUserNameField().getText();
            User user = bank.getUser(userName);

            try {
                user.getAccountID(userName).deposit(Integer.parseInt(input));
                deposit.depositConfirmation(input);
                deposit.getUserAmount().setText("");
                deposit.setVisible(false);
                homeView.setVisible(true);
            } catch (NumberFormatException ex) {
                deposit.displayErrorMessage();
            }
        });

        depositAccountType.getHomeBTN().addActionListener(e -> {
            depositAccountType.setVisible(false);
            homeView.setVisible(true);
        });

        deposit.getHomeBTN().addActionListener(e -> {
            deposit.setVisible(false);
            homeView.setVisible(true);
        });

    }

    public void checkBalance() {
        homeView.getBalance().addActionListener(e -> {
            balanceAccountType.setVisible(true);
            homeView.setVisible(false);
        });

        balanceAccountType.getChecking().addActionListener(e -> {
            balanceAccountType.setVisible(false);
            balance.setVisible(true);

            String uuid = loginView.getUserNameField().getText();
            User user = bank.getUser(uuid);

            balance.getAccountType().setText(user.getAccountID(uuid).getAccountType().toString());
            balance.getBalanceLabel().setText(String.valueOf(Double.valueOf(user.getAccountID(uuid).getBalance())));
        });

        balanceAccountType.getSavings().addActionListener(e -> {
            String uuid = loginView.getUserNameField().getText();
            User user = bank.getUser(uuid);

//                Checks if user has a savings account
            if (!user.getAccountID(uuid).getAccountType().equals(Account.Type.Savings)) {
                balanceAccountType.displayErrorMessage();
            }
        });

        balanceAccountType.getHomeBTN().addActionListener(e -> {
            balanceAccountType.setVisible(false);
            homeView.setVisible(true);
        });

        balance.getHomeBTN().addActionListener(e -> {
            balance.setVisible(false);
            homeView.setVisible(true);
        });
    }
}