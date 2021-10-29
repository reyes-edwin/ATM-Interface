package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckingHome extends JFrame {
    public CheckingHome() {
        setSize(700, 530);
        setTitle("Home");
        getContentPane().setBackground(Color.decode("#7199BD"));

        setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        add(title);

        ImageIcon icon = new ImageIcon("/Users/edwin/IST261/ATM-Interface/src/main/resources/BackBtn.png");
        JButton backArrow = new JButton(icon);
        backArrow.setBounds(30, 46, 40, 40);
        backArrow.setBorder(null);
        backArrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                AccountType accountType = new AccountType();
            }
        });
        add(backArrow);

        JButton back = new JButton("Back");
        back.setBounds(55, 53, 80, 30);
        back.setFont(new Font("Helvetica", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setBorder(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                AccountType accountType = new AccountType();
            }
        });
        add(back);

        JLabel description = new JLabel("What kind of transaction would you like?");
        description.setBounds(170, 189, 430, 28);
        description.setFont(new Font("Helvetica", Font.BOLD, 20));
        description.setForeground(Color.white);
        add(description);

        JButton checking = new JButton("Deposit");
        checking.setBounds(75, 260, 150, 50);
        checking.setFont(new Font("Helvetica", Font.BOLD, 18));
        checking.setBackground(Color.white);
        add(checking);

        JButton withdraw = new JButton("Withdraw");
        withdraw.setBounds(275, 260, 150, 50);
        withdraw.setFont(new Font("Helvetica", Font.BOLD, 18));
        withdraw.setBackground(Color.white);
        add(withdraw);

        JButton checkBal = new JButton("Balance");
        checkBal.setBounds(475, 260, 150, 50);
        checkBal.setFont(new Font("Helvetica", Font.BOLD, 18));
        checkBal.setBackground(Color.white);
        checkBal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                CheckingBal bal = new CheckingBal();
            }
        });
        add(checkBal);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CheckingHome();
    }
}
