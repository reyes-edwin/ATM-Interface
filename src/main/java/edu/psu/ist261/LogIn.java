package edu.psu.ist261;


import javax.swing.*;
import java.awt.*;

public class LogIn extends JFrame {

    public LogIn() {
        setSize(700,530);
        setTitle("ATM");
        getContentPane().setBackground(Color.decode("#7199BD"));

        setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(30, 50, 132, 28);
        title.setFont(new Font("Roboto", Font.BOLD, 24));
        title.setForeground(Color.white);
        add(title);

        JLabel pinNumber1 = new JLabel("*");
        pinNumber1.setBounds(293, 108, 100, 37);
        pinNumber1.setFont(new Font("Roboto", Font.BOLD, 36));
        pinNumber1.setForeground(Color.white);
        add(pinNumber1);

        JLabel pinNumber2 = new JLabel("*");
        pinNumber2.setBounds(325, 108, 100, 37);
        pinNumber2.setFont(new Font("Roboto", Font.BOLD, 36));
        pinNumber2.setForeground(Color.white);
        add(pinNumber2);

        JLabel pinNumber3 = new JLabel("*");
        pinNumber3.setBounds(357, 108, 100, 37);
        pinNumber3.setFont(new Font("Roboto", Font.BOLD, 36));
        pinNumber3.setForeground(Color.white);
        add(pinNumber3);

        JLabel pinNumber4 = new JLabel("*");
        pinNumber4.setBounds(389, 108, 100, 37);
        pinNumber4.setFont(new Font("Roboto", Font.BOLD, 36));
        pinNumber4.setForeground(Color.white);
        add(pinNumber4);

        JLabel one = new JLabel("1");
        one.setBounds(271, 169, 24, 42);
        one.setFont(new Font("Roboto", Font.BOLD, 36));
        one.setForeground(Color.white);
        add(one);

        JLabel two = new JLabel("2");
        two.setBounds(339, 169, 24, 42);
        two.setFont(new Font("Roboto", Font.BOLD, 36));
        two.setForeground(Color.white);
        add(two);

        JLabel three = new JLabel("3");
        three.setBounds(407, 169, 24, 42);
        three.setFont(new Font("Roboto", Font.BOLD, 36));
        three.setForeground(Color.white);
        add(three);

        JLabel four = new JLabel("4");
        four.setBounds(271, 226, 24, 42);
        four.setFont(new Font("Roboto", Font.BOLD, 36));
        four.setForeground(Color.white);
        add(four);

        JLabel five = new JLabel("5");
        five.setBounds(339, 226, 24, 42);
        five.setFont(new Font("Roboto", Font.BOLD, 36));
        five.setForeground(Color.white);
        add(five);

        JLabel six = new JLabel("6");
        six.setBounds(407, 226, 24, 42);
        six.setFont(new Font("Roboto", Font.BOLD, 36));
        six.setForeground(Color.white);
        add(six);

        JLabel seven = new JLabel("7");
        seven.setBounds(271, 283, 24, 42);
        seven.setFont(new Font("Roboto", Font.BOLD, 36));
        seven.setForeground(Color.white);
        add(seven);

        JLabel eight = new JLabel("8");
        eight.setBounds(339, 283, 24, 42);
        eight.setFont(new Font("Roboto", Font.BOLD, 36));
        eight.setForeground(Color.white);
        add(eight);

        JLabel nine = new JLabel("9");
        nine.setBounds(407, 283, 24, 42);
        nine.setFont(new Font("Roboto", Font.BOLD, 36));
        nine.setForeground(Color.white);
        add(nine);

        JLabel zero = new JLabel("0");
        zero.setBounds(339, 340, 24, 42);
        zero.setFont(new Font("Roboto", Font.BOLD, 36));
        zero.setForeground(Color.white);
        add(zero);

        JButton button = new JButton("Submit");
        button.setBounds(271, 400, 157, 50);
        button.setFont(new Font("Roboto", Font.BOLD, 18));
        button.setBackground(Color.white);
        button.setFocusable(false);
        add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}


