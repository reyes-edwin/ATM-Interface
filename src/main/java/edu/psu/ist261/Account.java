package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Account extends JFrame {

    public Account() {
        setSize(700,530);
        setTitle("Home");
        getContentPane().setBackground(Color.decode("#7199BD"));

        setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Roboto", Font.BOLD, 24));
        title.setForeground(Color.white);
        add(title);

        JLabel exit = new JLabel("EXIT");
        exit.setBounds(75, 50, 132, 28);
        exit.setFont(new Font("Roboto", Font.BOLD, 22));
        exit.setForeground(Color.white);
        add(exit);

        InputStream is = Account.class.getClassLoader().getResourceAsStream("Logout.png");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        Icon icon = new ImageIcon();
        JButton logOut = new JButton(icon);

        JLabel description = new JLabel("Select an account");
        description.setBounds(270, 189, 200, 28);
        description.setFont(new Font("Roboto", Font.BOLD, 20));
        description.setForeground(Color.white);
        add(description);

        JButton checking = new JButton("Checking");
        checking.setBounds(175, 260, 150, 50);
        checking.setFont(new Font("Roboto", Font.BOLD, 18));
        checking.setBackground(Color.white);
        checking.setFocusable(false);
        add(checking);

        JButton savings = new JButton("Checking");
        savings.setBounds(375, 260, 150, 50);
        savings.setFont(new Font("Roboto", Font.BOLD, 18));
        savings.setBackground(Color.white);
        savings.setFocusable(false);
        add(savings);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }


}
