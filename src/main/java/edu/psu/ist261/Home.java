package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    public Home() {
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
        exit.setFont(new Font("Roboto", Font.BOLD, 20));
        exit.setForeground(Color.white);
        add(exit);

//        InputStream is = Account.class.getClassLoader().getResourceAsStream("Logout.png");
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        Icon icon = new ImageIcon();
        JButton logOut = new JButton(icon);

        JLabel description = new JLabel("What kind of transaction would you like?");
        description.setBounds(170, 189, 430, 28);
        description.setFont(new Font("Roboto", Font.BOLD, 18));
        description.setForeground(Color.white);
        add(description);

        JButton checking = new JButton("Deposit");
        checking.setBounds(75, 260, 150, 50);
        checking.setFont(new Font("Roboto", Font.BOLD, 18));
        checking.setBackground(Color.white);
        checking.setFocusable(false);
        add(checking);

        JButton withdraw = new JButton("Withdraw");
        withdraw.setBounds(275, 260, 150, 50);
        withdraw.setFont(new Font("Roboto", Font.BOLD, 18));
        withdraw.setBackground(Color.white);
        withdraw.setFocusable(false);
        add(withdraw);

        JButton checkBal = new JButton("Balance");
        checkBal.setBounds(475, 260, 150, 50);
        checkBal.setFont(new Font("Roboto", Font.BOLD, 18));
        checkBal.setBackground(Color.white);
        checkBal.setFocusable(false);
        add(checkBal);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }



}
