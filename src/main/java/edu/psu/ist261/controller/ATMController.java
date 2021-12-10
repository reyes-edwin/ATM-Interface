package edu.psu.ist261.controller;

import edu.psu.ist261.model.Bank;
import edu.psu.ist261.model.User;
import edu.psu.ist261.view.*;

import javax.swing.*;
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
                    user.getAccount(userName).withdraw(50);
                    System.out.println(user.getAccount(userName).getBalance());
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
                withdraw.getType().setText(user.getAccount(userName).getAccountType().toString());
            }


        });

        withdrawAccountType.getSavings().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        withdraw.getTwenty().addActionListener(e -> {
            int results = withdraw.confirmWithDrawMessage(withdraw.getTwenty().getText());

            if (results == 0) {
                withdraw.amountWithdrewConfirmation(withdraw.getTwenty().getText());
                String uuid = loginView.getUserNameField().getText();
                User user = bank.getUser(uuid);
                user.getAccount(uuid).withdraw(Integer.parseInt(withdraw.getTwenty().getText()));
            }
        });


//        withdraw.getOther().addActionListener(e -> {
//            String m = JOptionPane.showInputDialog("Please enter an amount.", JOptionPane.OK_OPTION);
//            if (m.isEmpty()) {
//                JOptionPane.showMessageDialog(withdraw, "Please enter amount", "Error Message", JOptionPane.ERROR_MESSAGE);
//            } else {
//                String uuid = loginView.getUserNameField().getText();
//                User a = bank.getUser(uuid);
//                a.getAccount(uuid).withdraw(Integer.parseInt(m));
//            }
//        });
//    }
    }

//
//    public void balanceListener() {
//        homeView.getBalance().addActionListener(e -> {
//            homeView.setVisible(false);
//            balanceAccountType.setVisible(true);
//
//            balanceAccountType.getChecking().addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    balanceAccountType.setVisible(false);
//                    balance.setVisible(true);
//                    String uuid = loginView.getUserNameField().getText();
//                    User user = bank.getUser(uuid);
//                    double amount = bank.getUserMap().get(user.getUuid()).getAccount().get(user.getUuid()).getBalance();
//                    balance.getAccountType().setText(bank.getUserMap().get(user.getUuid()).getAccount().get(user.getUuid()).getAccountType().toString());
//                    balance.getBalanceLabel().setText(String.valueOf(amount));
//                }
//            });
//
//            balanceAccountType.getSavings().addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    String uuid = loginView.getUserNameField().getText();
//                    User user = bank.getUser(uuid);
//                    if (!bank.getUserMap().get(user.getUuid()).getAccount().get(user.getUuid()).getAccountType().equals(Account.Type.Savings)) {
//                        JOptionPane.showMessageDialog(balanceAccountType, "You do not have a Savings account", "Error Message", JOptionPane.ERROR_MESSAGE);
//                    } else {
//                        balanceAccountType.setVisible(false);
//                        balance.setVisible(true);
//                        double amount = bank.getUserMap().get(user.getUuid()).getAccount().get(user.getUuid()).getBalance();
//                        balance.getAccountType().setText(bank.getUserMap().get(user.getUuid()).getAccount().get(user.getUuid()).getAccountType().toString());
//                        balance.getBalanceLabel().setText(String.valueOf(amount));
//                    }
//                }
//            });
//
//            balanceAccountType.getHomeBTN().addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    balanceAccountType.setVisible(false);
//                    homeView.setVisible(true);
//                }
//            });
//        });
//
//        balance.getHomeBTN().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                balance.setVisible(false);
//                homeView.setVisible(true);
//            }
//        });
//
//    }
//
//    public void withdraw() {
//        homeView.getWithdraw().addActionListener(e -> {
//            homeView.setVisible(false);
//            withdrawAccountType.setVisible(true);
//
//            withdrawAccountType.getChecking().addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    withdrawAccountType.setVisible(false);
//                    withdraw.setVisible(true);
//                    String uuid = loginView.getUserNameField().getText();
//                    User user = bank.getUser(uuid);
//                    withdraw.getType().setText(user.getAccount(uuid).getAccountType().toString());
//                }
//            });
//
//        });
//
//        withdraw.getTwenty().addActionListener(e -> {
//            int results = JOptionPane.showConfirmDialog(withdraw, "Are you sure you want withdraw $20", "Confirmation",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (results == JOptionPane.YES_OPTION) {
//                JOptionPane.showConfirmDialog(withdraw, "$20 has been withdrawn", "Confirmation", JOptionPane.DEFAULT_OPTION);
//                int amount = Integer.parseInt(withdraw.getTwenty().getText());
//                String uuid = loginView.getUserNameField().getText();
//                User a = bank.getUser(uuid);
//                a.getAccount(uuid).withdraw(amount);
//            }
//        });
//
//        withdraw.getForty().addActionListener(e -> {
//            int results = JOptionPane.showConfirmDialog(withdraw, "Are you sure you want withdraw $40", "Confirmation",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (results == JOptionPane.YES_OPTION) {
//                JOptionPane.showConfirmDialog(withdraw, "$40 has been withdrawn", "Confirmation", JOptionPane.DEFAULT_OPTION);
//                int amount = Integer.parseInt(withdraw.getSixty().getText());
//                String uuid = loginView.getUserNameField().getText();
//                User a = bank.getUser(uuid);
//                a.getAccount(uuid).withdraw(amount);
//            }
//        });
//
//        withdraw.getSixty().addActionListener(e -> {
//            int results = JOptionPane.showConfirmDialog(withdraw, "Are you sure you want withdraw $60", "Confirmation",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (results == JOptionPane.YES_OPTION) {
//                JOptionPane.showConfirmDialog(withdraw, "$60 has been withdrawn", "Confirmation", JOptionPane.DEFAULT_OPTION);
//                int amount = Integer.parseInt(withdraw.getSixty().getText());
//                String uuid = loginView.getUserNameField().getText();
//                User a = bank.getUser(uuid);
//                a.getAccount(uuid).withdraw(amount);
//            }
//        });
//
//        withdraw.getEighty().addActionListener(e -> {
//            int results = JOptionPane.showConfirmDialog(withdraw, "Are you sure you want withdraw $80", "Confirmation",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (results == JOptionPane.YES_OPTION) {
//                JOptionPane.showConfirmDialog(withdraw, "$80 has been withdrawn", "Confirmation", JOptionPane.DEFAULT_OPTION);
//                int amount = Integer.parseInt(withdraw.getEighty().getText());
//                String uuid = loginView.getUserNameField().getText();
//                User a = bank.getUser(uuid);
//                a.getAccount(uuid).withdraw(amount);
//            }
//
//        });
//
//        withdraw.getOneHundred().addActionListener(e -> {
//            int results = JOptionPane.showConfirmDialog(withdraw, "Are you sure you want withdraw $100", "Confirmation",
//                    JOptionPane.YES_NO_OPTION);
//
//            if (results == JOptionPane.YES_OPTION) {
//                JOptionPane.showConfirmDialog(withdraw, "$100 has been withdrawn", "Confirmation", JOptionPane.DEFAULT_OPTION);
//                int amount = Integer.parseInt(withdraw.getOneHundred().getText());
//                String uuid = loginView.getUserNameField().getText();
//                User a = bank.getUser(uuid);
//                a.getAccount(uuid).withdraw(amount);
//            }
//        });
//
//        withdraw.getOther().addActionListener(e -> {
//            String m = JOptionPane.showInputDialog("Please enter an amount.", JOptionPane.OK_OPTION);
//            if (m.isEmpty()) {
//                JOptionPane.showMessageDialog(withdraw, "Please enter amount", "Error Message", JOptionPane.ERROR_MESSAGE);
//            } else {
//                String uuid = loginView.getUserNameField().getText();
//                User a = bank.getUser(uuid);
//                a.getAccount(uuid).withdraw(Integer.parseInt(m));
//            }
//        });
//
//        withdraw.getHomeBTN().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                withdraw.setVisible(false);
//                homeView.setVisible(true);
//            }
//        });
//
//        withdrawAccountType.getHomeBTN().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                withdrawAccountType.setVisible(false);
//                homeView.setVisible(true);
//            }
//        });
//    }
//
//    public void deposit() {
//
//        homeView.getDeposit().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                homeView.setVisible(false);
//                depositAccountType.setVisible(true);
//
//                depositAccountType.getChecking().addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        depositAccountType.setVisible(false);
//                        deposit.setVisible(true);
//                    }
//                });
//                depositAccountType.getHomeBTN().addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        depositAccountType.setVisible(false);
//                        homeView.setVisible(false);
//                    }
//                });
//
//                deposit.getSubmit().addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String input = deposit.getUserAmount().getText();
//                        String userName = loginView.getUserNameField().getText();
//                        User user = bank.getUser(userName);
//                        try {
//                            user.getAccount(userName).deposit(Integer.parseInt(input));
//                        } catch (NumberFormatException ex) {
//
//                        }
//
//
//                    }
//                });
//
//                deposit.getHomeBTN().addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        deposit.setVisible(false);
//                        homeView.setVisible(true);
//                    }
//                });
//            }
//        });
//    }

}





