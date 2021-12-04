package edu.psu.ist261.view;

import javax.swing.*;
import java.awt.*;

public class AccountTypePanel extends JPanel {
    JButton homeBTN = new JButton("Home");
    JButton checking = new JButton("Checking");
    JButton savings = new JButton("Savings");

    public AccountTypePanel() {
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
        homeBTN.setFocusable(false);
        homeBTN.setFont(new Font("Helvetica", Font.BOLD, 20));
        homeBTN.setForeground(Color.white);
        homeBTN.setBackground(Color.decode("#D55E3F"));
        homeBTN.setOpaque(true);
        homeBTN.setBorderPainted(false);
        add(homeBTN);

        checking.setBounds(86, 180, 150, 70);
        checking.setBackground(Color.decode("#6786B3"));
        checking.setOpaque(true);
        checking.setForeground(Color.white);
        checking.setFont(new Font("Helvetica", Font.BOLD, 20));
        checking.setBorderPainted(false);
        checking.setFocusable(false);
        add(checking);

        JLabel orText = new JLabel("OR");
        orText.setBounds(286, 204, 30, 23);
        orText.setFont(new Font("Helvetica", Font.BOLD, 18));
        orText.setForeground(Color.BLACK);
        add(orText);

        savings.setBounds(364, 180, 150, 70);
        savings.setBackground(Color.decode("#6786B3"));
        savings.setOpaque(true);
        savings.setForeground(Color.white);
        savings.setFont(new Font("Helvetica", Font.BOLD, 20));
        savings.setBorderPainted(false);
        savings.setFocusable(false);
        add(savings);
    }

    public JButton getHomeBTN() {
        return homeBTN;
    }

    public void setHomeBTN(JButton homeBTN) {
        this.homeBTN = homeBTN;
    }

    public JButton getChecking() {
        return checking;
    }

    public void setChecking(JButton checking) {
        this.checking = checking;
    }

    public JButton getSavings() {
        return savings;
    }

    public void setSavings(JButton savings) {
        this.savings = savings;
    }
}
