package edu.psu.ist261.view;

import javax.swing.*;
import java.awt.*;

public class BalancePanel extends JPanel {
    JButton homeBTN = new JButton("Home");
    JLabel accountType = new JLabel();
    JLabel balanceLabel = new JLabel();


    public BalancePanel() {
        setBounds(50, 50, 600, 430);
        setLayout(null);
        setVisible(false);
        setBackground(Color.decode("#ffffff"));


        JLabel title = new JLabel("ReyesATM");
        title.setBounds(478, 0, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 24));
        title.setForeground(Color.decode("#2A68AB"));
        add(title);

        homeBTN.setBounds(0, 0, 100, 50);
        homeBTN.setFont(new Font("Helvetica", Font.BOLD, 20));
        homeBTN.setForeground(Color.white);
        homeBTN.setBackground(Color.decode("#D55E3F"));
        homeBTN.setOpaque(true);
        homeBTN.setBorderPainted(false);
        homeBTN.setFocusable(false);
        add(homeBTN);

        JLabel accountText = new JLabel("Account: ");
        accountText.setBounds(211, 184, 97  , 23);
        accountText.setFont(new Font("Helvetica", Font.PLAIN, 20));
        accountText.setForeground(Color.black);
        add(accountText);


        accountType.setBounds(304, 184, 93, 23);
        accountType.setFont(new Font("Helvetica", Font.BOLD, 20));
        accountType.setForeground(Color.black);
        add(accountType);


        JLabel balanceText = new JLabel("Balance: ");
        balanceText.setBounds(212, 222, 97, 23);
        balanceText.setFont(new Font("Helvetica", Font.PLAIN, 20));
        balanceText.setForeground(Color.black);
        add(balanceText);


        balanceLabel.setBounds(305, 222, 86, 23);
        balanceLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        balanceLabel.setForeground(Color.black);
        add(balanceLabel);


    }

    public JButton getHomeBTN() {
        return homeBTN;
    }

    public void setHomeBTN(JButton homeBTN) {
        this.homeBTN = homeBTN;
    }

    public JLabel getAccountType() {
        return accountType;
    }

    public void setAccountType(JLabel accountType) {
        this.accountType = accountType;
    }

    public JLabel getBalanceLabel() {
        return balanceLabel;
    }

    public void setBalanceLabel(JLabel balanceLabel) {
        this.balanceLabel = balanceLabel;
    }
}
