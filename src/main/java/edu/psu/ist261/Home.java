package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Home  {
    JPanel homeScreen = new JPanel();

    public Home() {
        homeScreen.setBounds(50, 50, 600, 430);
        homeScreen.setLayout(null);
        homeScreen.setVisible(true);
        homeScreen.setBackground(Color.decode("#626C90"));

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(0, 0, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        homeScreen.add(title);

        JLabel welcome = new JLabel("Welcome");
        welcome.setBounds(0, 100, 60, 16);
        welcome.setFont(new Font("Helvetica", Font.PLAIN, 14));
        welcome.setForeground(Color.white);
        homeScreen.add(welcome);

        JLabel user = new JLabel();
        user.setBounds(0, 176, 114, 21);
        user.setFont(new Font("Helvetica", Font.BOLD, 18));
        user.setForeground(Color.white);
        homeScreen.add(user);

        JLabel account = new JLabel("Account Type");
        account.setBounds(0, 169, 87, 16);
        account.setFont(new Font("Helvetica", Font.PLAIN, 14));
        account.setForeground(Color.white);
        homeScreen.add(account);

        JLabel type = new JLabel();
        type.setBounds(0, 195, 84, 21);
        type.setFont(new Font("Helvetica", Font.BOLD, 18));
        type.setForeground(Color.white);
        homeScreen.add(type);

        JLabel accountNum = new JLabel("Account Number");
        accountNum.setBounds(0, 241, 107, 16);
        accountNum.setFont(new Font("Helvetica", Font.PLAIN, 14));
        accountNum.setForeground(Color.white);
        homeScreen.add(accountNum);

        Random randomNumber = new Random();
        String number = String.format("%09d", randomNumber.nextInt(1000000000));

        JLabel accountNumber = new JLabel(number);
        accountNumber.setBounds(0, 267, 100, 21);
        accountNumber.setFont(new Font("Helvetica", Font.BOLD, 18));
        accountNumber.setForeground(Color.white);
        homeScreen.add(accountNumber);

//        Transaction Buttons
        JButton deposit = new JButton("Deposit");
        deposit.setBounds(200, 100, 400, 60);
        deposit.setFont(new Font("Helvetica", Font.BOLD, 22));
        deposit.setFocusable(false);
        homeScreen.add(deposit);

        JButton withdraw = new JButton("Withdraw");
        withdraw.setBounds(200, 180, 400, 60);
        withdraw.setFont(new Font("Helvetica", Font.BOLD, 22));
        withdraw.setFocusable(false);
        homeScreen.add(withdraw);

        JButton balance = new JButton("Balance");
        balance.setBounds(200, 260, 400, 60);
        balance.setFont(new Font("Helvetica", Font.BOLD, 22));
        balance.setFocusable(false);
        homeScreen.add(balance);

//        Logout Button
        JButton logout = new JButton("Logout");
        logout.setBounds(450, 370, 150, 60);
        logout.setFont(new Font("Helvetica", Font.BOLD, 18));
        logout.setFocusable(false);
        homeScreen.add(logout);

    }
}
