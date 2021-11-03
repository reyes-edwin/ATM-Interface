package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SavingsWithdraw extends SavingsAccount {
    JFrame aframe = new JFrame();
    JPanel apanel = new JPanel();

    public SavingsWithdraw() {
        super();
        aframe.setSize(700, 530);
        aframe.setTitle("Balance");
        aframe.getContentPane().setBackground(Color.decode("#7199BD"));
        aframe.setLayout(null);

        apanel.setSize(637, 400);
        apanel.setLayout(null);
        apanel.setBackground(Color.decode("#7199BD"));


        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        aframe.add(title);

        ImageIcon icon = new ImageIcon("C:\\Users\\reyes\\OneDrive\\Desktop\\IST261\\ATM-Interface\\src\\main\\resources\\BackBtn.png");
        JButton backArrow = new JButton(icon);
        backArrow.setBounds(30, 46, 40, 40);
        backArrow.setBorder(null);
        backArrow.setBackground(null);
        backArrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aframe.setVisible(false);
                SavingsHome home = new SavingsHome();
            }
        });
        aframe.add(backArrow);

        JButton back = new JButton("Home");
        back.setBounds(55, 53, 80, 30);
        back.setFont(new Font("Helvetica", Font.BOLD, 20));
        back.setForeground(Color.white);
        back.setBackground(null);
        back.setBorder(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aframe.setVisible(false);
                SavingsHome home = new SavingsHome();
            }
        });
        aframe.add(back);

        JLabel type = new JLabel(getType() + ":");
        type.setBounds(55, 131, 180, 23);
        type.setFont(new Font("Helvetica", Font.BOLD, 20));
        type.setForeground(Color.white);
        apanel.add(type);

        Random random = new Random();
        String accountNum = String.format("%09d", random.nextInt(1000000000));

        JLabel acctNum = new JLabel(accountNum);
        acctNum.setBounds(55, 162, 100, 23);
        acctNum.setFont(new Font("Helvetica", Font.PLAIN, 20));
        acctNum.setForeground(Color.white);
        apanel.add(acctNum);

        JLabel bal = new JLabel("$" + getBalance());
        bal.setBounds(536, 131, 180, 23);
        bal.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bal.setForeground(Color.white);
        apanel.add(bal);

        JLabel description = new JLabel("Balance");
        description.setBounds(548, 162, 75, 23);
        description.setFont(new Font("Helvetica", Font.PLAIN, 20));
        description.setForeground(Color.white);
        apanel.add(description);

        JButton twenty = new JButton("$20");
        twenty.setBounds(55, 235, 150, 50);
        twenty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        twenty.setBackground(Color.white);
        twenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        apanel.add(twenty);

        JButton forty = new JButton("$40");
        forty.setBounds(270, 235, 150, 50);
        forty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        forty.setBackground(Color.white);
        apanel.add(forty);

        JButton sixty = new JButton("$60");
        sixty.setBounds(470, 235, 150, 50);
        sixty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        sixty.setBackground(Color.white);
        apanel.add(sixty);

        JButton eighty = new JButton("$80");
        eighty.setBounds(55, 319, 150, 50);
        eighty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        eighty.setBackground(Color.white);
        apanel.add(eighty);

        JButton oneHundred = new JButton("$100");
        oneHundred.setBounds(270, 319, 150, 50);
        oneHundred.setFont(new Font("Helvetica", Font.PLAIN, 18));
        oneHundred.setBackground(Color.white);
        apanel.add(oneHundred);

        JButton other = new JButton("other");
        other.setBounds(470, 319, 150, 50);
        other.setFont(new Font("Helvetica", Font.PLAIN, 18));
        other.setBackground(Color.white);
        apanel.add(other);
        apanel.setVisible(true);
        aframe.add(apanel);
        aframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aframe.setResizable(false);
        aframe.setVisible(true);
    }

    public static void main(String[] args) {
        new SavingsWithdraw();
    }
}
