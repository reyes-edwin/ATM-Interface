package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JPanel {

    LogIn() {
        setBounds(50, 50, 600, 430);
        setLayout(null);
        setVisible(true);
        setBackground(Color.decode("#626C90"));

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(0, 0, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        add(title);

        JLabel pin = new JLabel("* * * *");
        pin.setFont(new Font("Helvetica", Font.BOLD, 48));
        pin.setForeground(Color.white);
        pin.setBounds(238, 40, 125, 55);
        add(pin);

        JLabel one = new JLabel("1");
        one.setFont(new Font("Helvetica", Font.BOLD, 36));
        one.setForeground(Color.white);
        one.setBounds(221, 104, 24, 42);
        add(one);

        JLabel two = new JLabel("2");
        two.setFont(new Font("Helvetica", Font.BOLD, 36));
        two.setForeground(Color.white);
        two.setBounds(289, 104, 24, 42);
        add(two);

        JLabel three = new JLabel("3");
        three.setFont(new Font("Helvetica", Font.BOLD, 36));
        three.setForeground(Color.white);
        three.setBounds(357, 104, 24, 42);
        add(three);

        JLabel four = new JLabel("4");
        four.setFont(new Font("Helvetica", Font.BOLD, 36));
        four.setForeground(Color.white);
        four.setBounds(221, 161, 24, 42);
        add(four);

        JLabel five = new JLabel("5");
        five.setFont(new Font("Helvetica", Font.BOLD, 36));
        five.setForeground(Color.white);
        five.setBounds(289, 161, 24, 42);
        add(five);

        JLabel six = new JLabel("6");
        six.setFont(new Font("Helvetica", Font.BOLD, 36));
        six.setForeground(Color.white);
        six.setBounds(357, 161, 24, 42);
        add(six);

        JLabel seven = new JLabel("7");
        seven.setFont(new Font("Helvetica", Font.BOLD, 36));
        seven.setForeground(Color.white);
        seven.setBounds(221, 218, 24, 42);
        add(seven);

        JLabel eight = new JLabel("8");
        eight.setFont(new Font("Helvetica", Font.BOLD, 36));
        eight.setForeground(Color.white);
        eight.setBounds(289, 218, 24, 42);
        add(eight);

        JLabel nine = new JLabel("9");
        nine.setFont(new Font("Helvetica", Font.BOLD, 36));
        nine.setForeground(Color.white);
        nine.setBounds(357, 218, 24, 42);
        add(nine);

        JLabel zero = new JLabel("0");
        zero.setFont(new Font("Helvetica", Font.BOLD, 36));
        zero.setForeground(Color.white);
        zero.setBounds(289, 275, 24, 42);
        add(zero);
        
        JButton submit = new JButton("Submit");
        submit.setBounds(221, 340, 160, 50);
        submit.setFont(new Font("Helvetica", Font.BOLD, 18));
        submit.setFocusable(false);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        add(submit);
    }
}
