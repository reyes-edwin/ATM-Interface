package edu.psu.ist261;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogoutConfirmation extends JFrame {
    public LogoutConfirmation() {
        setSize(550, 350);
        getContentPane().setBackground(Color.decode("#7199BD"));
        setTitle("Confirmation");
        setLayout(null);

        JLabel confirm = new JLabel("Are you sure you want to log out?");
        confirm.setBounds(125, 123, 350, 23);
        confirm.setFont(new Font("Helvetica", Font.BOLD, 20));
        confirm.setForeground(Color.white);
        add(confirm);

        JLabel or = new JLabel("OR");
        or.setBounds(261, 190, 30, 23);
        or.setFont(new Font("Helvetica", Font.BOLD, 20));
        or.setForeground(Color.white);
        add(or);

        JButton yes = new JButton("Yes");
        yes.setBounds(136, 175, 100, 50);
        yes.setFont(new Font("Helvetica", Font.PLAIN, 18));
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                LogIn logIn = new LogIn();
            }
        });
        add(yes);

        JButton no = new JButton("No");
        no.setBounds(313, 175, 100, 50);
        no.setFont(new Font("Helvetica", Font.PLAIN, 18));
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                CheckingHome logIn = new CheckingHome();
            }
        });
        add(no);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LogoutConfirmation();
    }
}
