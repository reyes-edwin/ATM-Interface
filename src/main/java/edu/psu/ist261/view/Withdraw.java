package edu.psu.ist261.view;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Withdraw extends JPanel {
    private JButton homeBTN = new JButton("Cancel");
    private JButton twenty = new JButton("20");
    private JButton forty = new JButton("40");
    private JButton sixty = new JButton("60");
    private JButton eighty = new JButton("80");
    private JButton oneHundred = new JButton("100");
    private JButton other = new JButton("other");
    JLabel type = new JLabel();



    public Withdraw() {
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

        JLabel description = new JLabel("Withdraw - Select Amount");
        description.setFont(new Font("Helvetica", Font.BOLD | Font.ITALIC, 14));
        description.setForeground(Color.BLACK);
        description.setBounds(175, 54, 195, 16);
        add(description);

        JLabel accountText = new JLabel("Account:");
        accountText.setBounds(0, 109, 60, 16);
        accountText.setForeground(Color.black);
        accountText.setFont(new Font("Helvetica", Font.PLAIN, 14));
        add(accountText);

        type.setBounds(60, 109, 70, 16);
        type.setForeground(Color.BLACK);
        type.setFont(new Font("Helvetica", Font.BOLD, 14));
        add(type);

        twenty.setBounds(175, 80, 200, 100);
        twenty.setFocusable(false);
        twenty.setForeground(Color.white);
        twenty.setBackground(Color.decode("#6786B3"));
        twenty.setOpaque(true);
        twenty.setBorderPainted(false);
        twenty.setFont(new Font("Helvetica", Font.BOLD, 18));
        add(twenty);

        forty.setBounds(400, 80, 200, 100);
        forty.setFocusable(false);
        forty.setForeground(Color.white);
        forty.setBackground(Color.decode("#6786B3"));
        forty.setOpaque(true);
        forty.setBorderPainted(false);
        forty.setFont(new Font("Helvetica", Font.BOLD, 18));
        add(forty);

        sixty.setBounds(175, 205, 200, 100);
        sixty.setFocusable(false);
        sixty.setForeground(Color.white);
        sixty.setBackground(Color.decode("#6786B3"));
        sixty.setOpaque(true);
        sixty.setBorderPainted(false);
        sixty.setFont(new Font("Helvetica", Font.BOLD, 18));
        add(sixty);

        eighty.setBounds(400, 205, 200, 100);
        eighty.setFocusable(false);
        eighty.setForeground(Color.white);
        eighty.setBackground(Color.decode("#6786B3"));
        eighty.setOpaque(true);
        eighty.setBorderPainted(false);
        eighty.setFont(new Font("Helvetica", Font.BOLD, 18));
        add(eighty);

        oneHundred.setBounds(175, 330, 200, 100);
        oneHundred.setFocusable(false);
        oneHundred.setForeground(Color.white);
        oneHundred.setBackground(Color.decode("#6786B3"));
        oneHundred.setOpaque(true);
        oneHundred.setBorderPainted(false);
        oneHundred.setFont(new Font("Helvetica", Font.BOLD, 18));
        add(oneHundred);

        other.setBounds(400, 330, 200, 100);
        other.setFocusable(false);
        other.setForeground(Color.white);
        other.setBackground(Color.decode("#6786B3"));
        other.setOpaque(true);
        other.setBorderPainted(false);
        other.setFont(new Font("Helvetica", Font.BOLD, 18));
        add(other);


    }


    public JButton getHomeBTN() {
        return homeBTN;
    }

    public JButton getTwenty() {
        return twenty;
    }

    public JButton getForty() {
        return forty;
    }

    public JButton getSixty() {
        return sixty;
    }

    public JButton getEighty() {
        return eighty;
    }

    public JButton getOneHundred() {
        return oneHundred;
    }

    public JButton getOther() {
        return other;
    }

    public JLabel getType() {
        return type;
    }

    public int confirmWithDrawMessage(String amount) {
        int results = JOptionPane.showConfirmDialog(this, "Are you sure you want to withdraw $ " + amount, "Confirmation", JOptionPane.YES_NO_OPTION);
        return results;
    }

    public void amountWithdrewConfirmation(String amount) {
         JOptionPane.showMessageDialog(this, "$" + amount + " has been withdraw from checking.", "Confirmation", JOptionPane.DEFAULT_OPTION);
    }

}
