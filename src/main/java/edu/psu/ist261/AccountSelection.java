package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AccountSelection extends JFrame {

    public AccountSelection() {
        setSize(700,530);
        setTitle("Home");
        getContentPane().setBackground(Color.decode("#7199BD"));

        setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Roboto", Font.BOLD, 24));
        title.setForeground(Color.white);
        add(title);

        JButton exit = new JButton("EXIT", new ImageIcon(""));
        exit.setBounds(30, 50, 100, 28);
        exit.setFont(new Font("Roboto", Font.BOLD, 22));
        exit.setFocusable(false);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                LogIn logIn = new LogIn();
                logIn.getContentPane();
            }
        });
        add(exit);


        JLabel description = new JLabel("Select an account");
        description.setBounds(270, 189, 200, 28);
        description.setFont(new Font("Roboto", Font.BOLD, 18));
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

    public static void main(String[] args) {
        new AccountSelection();
    }


}
