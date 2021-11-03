package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SavingsWithdraw extends SavingsAccount {
    JFrame aframe = new JFrame();
    JPanel selection = new JPanel();
    JPanel confirmation = new JPanel();

    public SavingsWithdraw() {
        super();
//        JFRAME GOES HERE
        aframe.setSize(700, 530);
        aframe.setTitle("Balance");
        aframe.getContentPane().setBackground(Color.decode("#7199BD"));
        aframe.setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 22));
        title.setForeground(Color.white);
        aframe.add(title);

        JButton back = new JButton("Back");
        back.setBounds(30, 53, 90, 30);
        back.setFont(new Font("Helvetica", Font.BOLD, 20));
        back.setFocusable(false);
        back.setBackground(Color.white);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aframe.setVisible(false);
                SavingsHome savingsHome = new SavingsHome();
            }
        });
        aframe.add(back);

        aframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aframe.setResizable(false);
        aframe.setVisible(true);

//        JPANEL GOES HERE
        selection.setLayout(null);
        selection.setBounds(44, 110, 605, 344);
        selection.setBackground(Color.decode("#7199BD"));

        //        Second JPANEL

        confirmation.setLayout(null);
        confirmation.setBounds(44, 110, 605, 344);
        confirmation.setBackground(Color.decode("#7199BD"));

        JLabel type = new JLabel(getType() + ":");
        type.setBounds(30, 5, 180, 23);
        type.setFont(new Font("Helvetica", Font.BOLD, 20));
        type.setForeground(Color.white);
        selection.add(type);

        Random random = new Random();
        String accountNum = String.format("%09d", random.nextInt(1000000000));

        JLabel acctNum = new JLabel(accountNum);
        acctNum.setBounds(30, 43, 100, 23);
        acctNum.setFont(new Font("Helvetica", Font.PLAIN, 20));
        acctNum.setForeground(Color.white);
        selection.add(acctNum);

        JLabel bal = new JLabel("$" + getBalance());
        bal.setBounds(485, 5, 90, 23);
        bal.setFont(new Font("Helvetica", Font.PLAIN, 20));
        bal.setForeground(Color.white);
        selection.add(bal);

        JLabel description = new JLabel("Balance");
        description.setBounds(500, 43, 75, 23);
        description.setFont(new Font("Helvetica", Font.PLAIN, 20));
        description.setForeground(Color.white);
        selection.add(description);

        JButton twenty = new JButton("$20");
        twenty.setBounds(30, 121, 150, 50);
        twenty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        twenty.setBackground(Color.white);
        twenty.setFocusable(false);
        twenty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selection.setVisible(false);
                back.setVisible(false);
                JLabel text = new JLabel("Withdraw " + twenty.getText() + " from " + getType() + "?");
                text.setForeground(Color.white);
                text.setFont(new Font("Helvetica", Font.BOLD, 20));
                text.setBounds(163, 90, 280, 23);
                confirmation.add(text);

                JButton yes = new JButton("Yes");
                yes.setBounds(128, 150, 150, 50);
                yes.setFont(new Font("Helvetica", Font.BOLD, 18));
                yes.setBackground(Color.white);
                yes.setFocusable(false);
                confirmation.add(yes);

                JButton no = new JButton("No");
                no.setBounds(328, 150, 150, 50);
                no.setFont(new Font("Helvetica", Font.BOLD, 18));
                no.setBackground(Color.white);
                no.setFocusable(false);
                no.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        confirmation.setVisible(false);
                        selection.setVisible(true);
                        back.setVisible(true);
                    }
                });
                confirmation.add(no);



            }
        });
        selection.add(twenty);

        JButton forty = new JButton("$40");
        forty.setBounds(228, 121, 150, 50);
        forty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        forty.setBackground(Color.white);
        forty.setFocusable(false);
        selection.add(forty);

        JButton sixty = new JButton("$60");
        sixty.setBounds(425, 121, 150, 50);
        sixty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        sixty.setBackground(Color.white);
        sixty.setFocusable(false);
        selection.add(sixty);

        JButton eighty = new JButton("$80");
        eighty.setBounds(30, 206, 150, 50);
        eighty.setFont(new Font("Helvetica", Font.PLAIN, 18));
        eighty.setBackground(Color.white);
        eighty.setFocusable(false);
        selection.add(eighty);

        JButton oneHundred = new JButton("$100");
        oneHundred.setBounds(228, 206, 150, 50);
        oneHundred.setFont(new Font("Helvetica", Font.PLAIN, 18));
        oneHundred.setBackground(Color.white);
        oneHundred.setFocusable(false);
        selection.add(oneHundred);

        JButton other = new JButton("other");
        other.setBounds(425, 206, 150, 50);
        other.setFont(new Font("Helvetica", Font.PLAIN, 18));
        other.setBackground(Color.white);
        other.setFocusable(false);
        selection.add(other);

        selection.setVisible(true);
        confirmation.setVisible(true);
        aframe.add(selection);
        aframe.add(confirmation);




    }

    public static void main(String[] args) {
        new SavingsWithdraw();
    }
}
