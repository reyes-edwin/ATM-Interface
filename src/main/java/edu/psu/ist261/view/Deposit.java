package edu.psu.ist261.view;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Deposit extends JPanel {
    private JButton homeBTN = new JButton("Cancel");
    private JButton submit = new JButton("Submit");
    JTextField userAmount = new JTextField();

    public Deposit() {
        setBounds(50, 50, 600, 430);
        setLayout(null);
        setVisible(false);
        setBackground(Color.decode("#ffffff"));

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(0, 0, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 24));
        title.setForeground(Color.decode("#2A68AB"));
        add(title);

        homeBTN.setBounds(0, 380, 110, 50);
        homeBTN.setFocusable(false);
        homeBTN.setFont(new Font("Helvetica", Font.BOLD, 20));
        homeBTN.setForeground(Color.white);
        homeBTN.setBackground(Color.decode("#D55E3F"));
        homeBTN.setOpaque(true);
        homeBTN.setBorderPainted(false);
        add(homeBTN);

        JLabel date = new JLabel("" + LocalDate.now());
        date.setBounds(526, 0, 80, 16);
        date.setForeground(Color.black);
        date.setFont(new Font("Helvetica", Font.PLAIN, 14));
        add(date);

        JLabel time = new JLabel("" + LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a")));
        time.setBounds(539, 21, 70, 16);
        time.setFont(new Font("Helvetica", Font.PLAIN, 14));
        time.setForeground(Color.black);
        add(time);

        JLabel description = new JLabel("Deposit - Please Enter Amount");
        description.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
        description.setForeground(Color.BLACK);
        description.setBounds(197, 124, 210, 16);
        add(description);

        JLabel invalidText = new JLabel();
        invalidText.setBounds(197, 220, 160, 16);
        invalidText.setFont(new Font("Helvetica", Font.PLAIN, 14));
        invalidText.setForeground(Color.red);
        add(invalidText);


        userAmount.setBounds(197, 160, 205, 50);
        userAmount.setForeground(Color.black);
        userAmount.setFont(new Font("Helvetica", Font.PLAIN, 18));
        userAmount.setBackground(Color.decode("#DFDFDF"));
        userAmount.setOpaque(true);
        userAmount.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    int i = Integer.parseInt(userAmount.getText());
                    invalidText.setText("");
                }catch (NumberFormatException e1) {
                    invalidText.setText("Please enter a number");
                }
            }
        });
        add(userAmount);

        submit.setBounds(300, 256, 110, 50);
        submit.setFocusable(false);
        submit.setFont(new Font("Helvetica", Font.BOLD, 18));
        submit.setForeground(Color.white);
        submit.setBackground(Color.decode("#8CC07D"));
        submit.setOpaque(true);
        submit.setBorderPainted(false);
        add(submit);




    }

    public JTextField getUserAmount() {
        return userAmount;
    }

    public JButton getSubmit() {
        return submit;
    }

    public JButton getHomeBTN() {
        return homeBTN;
    }
}
