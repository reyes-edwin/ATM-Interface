package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckingBal extends CheckingAccount {
    JFrame aframe = new JFrame();

    public CheckingBal() {
        super();
        aframe.setSize(700, 530);
        aframe.setTitle("Balance");
        aframe.getContentPane().setBackground(Color.decode("#7199BD"));

        aframe.setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        aframe.add(title);

        ImageIcon icon = new ImageIcon("/Users/edwin/IST261/ATM-Interface/src/main/resources/BackBtn.png");
        JButton backArrow = new JButton(icon);
        backArrow.setBounds(30, 46, 40, 40);
        backArrow.setBorder(null);
        backArrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aframe.setVisible(false);
                CheckingHome checkingHome = new CheckingHome();
            }
        });
        aframe.add(backArrow);
        JButton back = new JButton("Back");
        back.setBounds(55, 53, 80, 30);
        back.setFont(new Font("Helvetica", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setBorder(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               aframe.setVisible(false);
                CheckingHome checkingHome = new CheckingHome();
            }
        });
        aframe.add(back);

        JLabel accountType = new JLabel("Account:");
        accountType.setBounds(223, 218, 100, 23);
        accountType.setFont(new Font("Helvetica", Font.BOLD, 20));
        accountType.setForeground(Color.white);
        aframe.add(accountType);

        JLabel checking = new JLabel(getType());
        checking.setBounds(314, 219, 150, 23);
        checking.setFont(new Font("Helvetica", Font.PLAIN, 18));
        checking.setForeground(Color.white);
        aframe.add(checking);

        JLabel bal = new JLabel("Balance:");
        bal.setBounds(223, 259, 100, 23);
        bal.setFont(new Font("Helvetica", Font.BOLD, 20));
        bal.setForeground(Color.white);
        aframe.add(bal);

        JLabel amount = new JLabel("$ " + getBalance());
        amount.setBounds(314, 259, 150, 23);
        amount.setFont(new Font("Helvetica", Font.PLAIN, 18));
        amount.setForeground(Color.white);
        aframe.add(amount);



        aframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aframe.setResizable(false);
        aframe.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckingBal();
    }


}
