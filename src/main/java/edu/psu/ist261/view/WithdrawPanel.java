package edu.psu.ist261.view;

import javax.swing.*;
import java.awt.*;

public class WithdrawPanel extends JPanel {
    JButton homeBTN = new JButton("Home");
    JLabel accountType = new JLabel();

    public WithdrawPanel() {
        setBounds(50, 50, 600, 430);
        setLayout(null);
        setVisible(false);
        setBackground(Color.decode("#626C90"));


        JLabel title = new JLabel("ReyesATM");
        title.setBounds(478, 0, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 24));
        title.setForeground(Color.white);
        add(title);

        homeBTN.setBounds(0, 0, 100, 50);
        homeBTN.setFocusable(false);
        homeBTN.setFont(new Font("Helvetica", Font.BOLD, 20));
        homeBTN.setBackground(Color.white);
        add(homeBTN);
    }

}
