package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AccountSelection extends JFrame {

    public AccountSelection() {
        setSize(700, 530);
        setTitle("Account Selection");
        getContentPane().setBackground(Color.decode("#7199BD"));

        setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        add(title);

        ImageIcon icon = new ImageIcon("/Users/edwin/IST261/ATM-Interface/src/main/resources/LogOut.png");
        JButton exit = new JButton(icon);
        exit.setBounds(30, 46, 40, 40);
        exit.setBorder(null);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                LogIn logIn = new LogIn();
                logIn.getContentPane();
            }
        });
        add(exit);


        JButton logout = new JButton("Logout");
        logout.setBounds(55, 53, 100, 30);
        logout.setFont(new Font("Helvetica", Font.BOLD, 20));
        logout.setForeground(Color.white);
        logout.setBorder(null);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                LogIn log = new LogIn();
                log.getContentPane();
            }
        });
        add(logout);


        JLabel description = new JLabel("Select an account");
        description.setBounds(270, 189, 200, 28);
        description.setFont(new Font("Helvetica", Font.BOLD, 20));
        description.setForeground(Color.white);
        add(description);

        JButton checking1 = new JButton("Checking");
        checking1.setBounds(175, 260, 150, 50);
        checking1.setFont(new Font("Helvetica", Font.BOLD, 18));
        checking1.setBackground(Color.white);
        checking1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Home homeScreen = new Home();
                homeScreen.getContentPane();
            }
        });
        add(checking1);

        JButton savings = new JButton("Savings");
        savings.setBounds(375, 260, 150, 50);
        savings.setFont(new Font("Helvetica", Font.BOLD, 18));
        savings.setBackground(Color.white);
        savings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Home home = new Home();
                home.getContentPane();
            }
        });
        add(savings);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

}
