package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingsHome extends JPanel {
    JFrame jFrame = new JFrame();

    public SavingsHome() {
        jFrame.setSize(700, 530);
        jFrame.setTitle("Home");
        jFrame.getContentPane().setBackground(Color.decode("#7199BD"));
        jFrame.setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        jFrame.add(title);

        JButton back = new JButton("Back");
        back.setBounds(30, 53, 80, 30);
        back.setFont(new Font("Helvetica", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setFocusable(false);
        back.setBorder(null);
        back.setBackground(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                AccountType accountType = new AccountType();
            }
        });
        jFrame.add(back);

        JLabel description = new JLabel("What kind of transaction would you like?");
        description.setBounds(150, 189, 430, 28);
        description.setFont(new Font("Helvetica", Font.BOLD, 20));
        description.setForeground(Color.white);
        jFrame.add(description);

        JButton checking = new JButton("Deposit");
        checking.setBounds(75, 260, 150, 50);
        checking.setFont(new Font("Helvetica", Font.BOLD, 18));
        checking.setBackground(Color.white);
        checking.setFocusable(false);
        jFrame.add(checking);

        JButton withdraw = new JButton("Withdraw");
        withdraw.setBounds(275, 260, 150, 50);
        withdraw.setFont(new Font("Helvetica", Font.BOLD, 18));
        withdraw.setBackground(Color.white);
        withdraw.setFocusable(false);
        withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                SavingsWithdraw withdraw = new SavingsWithdraw();
            }
        });
        jFrame.add(withdraw);

        JButton checkBal = new JButton("Balance");
        checkBal.setBounds(475, 260, 150, 50);
        checkBal.setFont(new Font("Helvetica", Font.BOLD, 18));
        checkBal.setBackground(Color.white);
        checkBal.setFocusable(false);
        checkBal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                SavingsBal bal = new SavingsBal();
            }
        });
        jFrame.add(checkBal);

        JButton logout = new JButton("LogOut");
        logout.setBounds(530, 410, 120, 50);
        logout.setFont(new Font("Helvetica", Font.BOLD, 20));
        logout.setBackground(Color.white);
        logout.setFocusable(false);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Jdialog
                int results = JOptionPane.showConfirmDialog(jFrame, "Are you sure you want to LogOut?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (results == JOptionPane.YES_OPTION) {
                    jFrame.setVisible(false);
                    LogIn logIn = new LogIn();
                }
            }
        });
        jFrame.add(logout);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new SavingsHome();
    }
}
