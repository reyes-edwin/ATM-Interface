package edu.psu.ist261.controller;


import edu.psu.ist261.model.Bank;
import edu.psu.ist261.model.User;
import edu.psu.ist261.view.AccountTypePanel;
import edu.psu.ist261.view.HomePanel;
import edu.psu.ist261.view.LogInPanel;
import edu.psu.ist261.view.BalancePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ATMController {
    private Bank bank;
    private HomePanel homeView;
    private LogInPanel loginView;
    private BalancePanel balance;
    AccountTypePanel accountType;


    public ATMController(HomePanel homeView, LogInPanel loginView, BalancePanel balance, Bank bank, AccountTypePanel accountType) {
        this.homeView = homeView;
        this.loginView = loginView;
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    public void buttonListener() {
        loginView.getLogInButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = loginView.getUserNameField().getText();
                String password = String.valueOf(loginView.getPasswordField().getPassword());

                User user = bank.getUser(userName);
//                Set<Account.Type> a = user.getAccountMap().keySet();
//
//                if (a.contains(Account.Type.Checking) || a.contains(Account.Type.Savings)) {
//                    System.out.println(true);
//                } else {
//                    System.out.println(false);
//                }

// front end
                if (user == null) {
                    JOptionPane.showMessageDialog(loginView,
                            "No user exist",
                            "Error Message",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (userName.equals(user.getUuid()) && password.equals(user.getPinNumber())) {
                    loginView.setVisible(false);
                    homeView.setVisible(true);
                    homeView.getUserName().setText(user.getFirstName() + " " + user.getLastName());

                } else {
                    JOptionPane.showMessageDialog(loginView,
                            "Invalid password. Try again.",
                            "Error Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        });


    }

    public void logoutListener() {
        homeView.getLogout().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int results = JOptionPane.showConfirmDialog(homeView, "Are you sure you want to Logout?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (results == JOptionPane.YES_OPTION) {
                    homeView.setVisible(false);
                    loginView.setVisible(true);
                    loginView.getUserNameField().setText("");
                    loginView.getPasswordField().setText("");
                }
            }
        });
    }

    public void balanceListener() {
        homeView.getBalance().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeView.setVisible(false);
                accountType.setVisible(true);

            }
        });

        accountType.getHomeBTN().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountType.setVisible(false);
                homeView.setVisible(true);
            }
        });

        accountType.getChecking().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = loginView.getUserNameField().getText();

                User user = bank.getUser(userName);

                accountType.setVisible(false);
                balance.setVisible(true);








            }
        });

    }

}

