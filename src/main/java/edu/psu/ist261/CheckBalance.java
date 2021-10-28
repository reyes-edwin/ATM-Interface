package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBalance extends Account {
    JFrame jFrame = new JFrame();

    public CheckBalance() {
        super();

        jFrame.setSize(700, 530);
        jFrame.setTitle("Balance");
        jFrame.getContentPane().setBackground(Color.decode("#7199BD"));
        jFrame.setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        jFrame.add(title);

        ImageIcon icon = new ImageIcon("/Users/edwin/IST261/ATM-Interface/src/main/resources/BackBtn.png");
        JButton backArrow = new JButton(icon);
        backArrow.setBounds(30, 46, 40, 40);
        backArrow.setBorder(null);
        backArrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                Home home = new Home();
            }
        });
        jFrame.add(backArrow);

        JButton back = new JButton("Back");
        back.setBounds(55, 53, 80, 30);
        back.setFont(new Font("Helvetica", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setBorder(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                Home home = new Home();
            }
        });
        jFrame.add(back);

        JLabel account = new JLabel("Account:");
        account.setBounds(223, 218, 90, 23);
        account.setFont(new Font("Helvetica", Font.BOLD, 20));
        account.setForeground(Color.white);
        jFrame.add(account);


//        JLabel type = new JLabel(getPrimaryCheck());
//        type.setBounds(320, 218, 150, 23);
//        type.setFont(new Font("Helvetica", Font.PLAIN, 18));
//        type.setForeground(Color.white);
//        jFrame.add(type);

        JLabel balance = new JLabel("Balance:");
        balance.setBounds(223, 259, 90, 23);
        balance.setFont(new Font("Helvetica", Font.BOLD, 20));
        balance.setForeground(Color.white);
        jFrame.add(balance);




        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBalance();
    }
}
