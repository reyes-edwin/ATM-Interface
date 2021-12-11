package edu.psu.ist261.view;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Home extends JPanel {
    JLabel userName = new JLabel();
    JButton logout = new JButton("Logout");
    JButton balance = new JButton("Balance");
    JButton withdraw = new JButton("Withdraw");
    JButton deposit = new JButton("Deposit");
    JButton quickCash = new JButton("Quick Cash");

    public Home() {
        setBounds(50, 50, 600, 430);
        setLayout(null);
        setVisible(false);
        setBackground(Color.decode("#ffffff"));

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(0, 0, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 24));
        title.setForeground(Color.decode("#2A68AB"));
        add(title);

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

        JLabel welcome = new JLabel("Welcome,");
        welcome.setBounds(0, 96, 80, 16);
        welcome.setFont(new Font("Helvetica", Font.PLAIN, 18));
        welcome.setForeground(Color.black);
        add(welcome);

        userName.setBounds(0, 122, 130, 21);
        userName.setFont(new Font("Helvetica", Font.BOLD, 18));
        userName.setForeground(Color.BLACK);
        add(userName);

        JLabel description = new JLabel("Please choose a transaction.");
        description.setBounds(175, 69, 200, 16);
        description.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
        description.setForeground(Color.black);
        add(description);
//
        JLabel quickCashText = new JLabel("$50 from checking");
        quickCashText.setFont(new Font("Helvetica", Font.ITALIC, 14));
        quickCashText.setBounds(219, 162, 120, 14);
        quickCashText.setForeground(Color.white);
        add(quickCashText);

//        Transaction Buttons

        quickCash.setBounds(175, 95, 200, 100);
        quickCash.setFont(new Font("Helvetica", Font.BOLD, 20));
        quickCash.setFocusable(false);
        quickCash.setForeground(Color.white);
        quickCash.setBackground(Color.decode("#8CC07D"));
        quickCash.setOpaque(true);
        quickCash.setBorderPainted(false);
        add(quickCash);


        withdraw.setBounds(400, 95, 200, 100);
        withdraw.setFont(new Font("Helvetica", Font.BOLD, 20));
        withdraw.setFocusable(false);
        withdraw.setForeground(Color.white);
        withdraw.setBackground(Color.decode("#6786B3"));
        withdraw.setBorderPainted(false);
        withdraw.setOpaque(true);
        add(withdraw);


        deposit.setBounds(175, 220, 200, 100);
        deposit.setFont(new Font("Helvetica", Font.BOLD, 20));
        deposit.setFocusable(false);
        deposit.setForeground(Color.white);
        deposit.setBackground(Color.decode("#6786B3"));
        deposit.setBorderPainted(false);
        deposit.setOpaque(true);
        add(deposit);


        balance.setBounds(400, 220, 200, 100);
        balance.setFont(new Font("Helvetica", Font.BOLD, 20));
        balance.setFocusable(false);
        balance.setForeground(Color.white);
        balance.setBackground(Color.decode("#6786B3"));
        balance.setBorderPainted(false);
        balance.setOpaque(true);
        add(balance);

//        Logout Button

        logout.setBounds(450, 370, 150, 60);
        logout.setFont(new Font("Helvetica", Font.BOLD, 18));
        logout.setFocusable(false);
        logout.setBackground(Color.white);
        logout.setForeground(Color.white);
        logout.setBackground(Color.decode("#D55E3F"));
        logout.setBorderPainted(false);
        logout.setOpaque(true);
        add(logout);
    }

    public JLabel getUserName() {
        return userName;
    }

    public JButton getBalance() {
        return balance;
    }

    public JButton getLogout() {
        return logout;
    }

    public JButton getWithdraw() {
        return withdraw;
    }

    public JButton getDeposit() {
        return deposit;
    }

    public JButton getQuickCash() {
        return quickCash;
    }

    public int displayConfirmLogout() {
        int results = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
        return results;
    }

    public int displayQuickCashMessage() {
        int results = JOptionPane.showConfirmDialog(this, "Are you sure you want to withdraw $50 from checking?", "Confirmation", JOptionPane.YES_NO_OPTION);
        return results;
    }

    public void quickCashConfirmation() {
        JOptionPane.showMessageDialog(this, "$50 has been withdrew!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }
}
