package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;

public class CheckBalance extends Checking {
     JFrame aframe = new JFrame();

     public CheckBalance() {
        super();
        aframe.setSize(700,530);
        aframe.setTitle("Home");
        aframe.getContentPane().setBackground(Color.decode("#7199BD"));

        aframe.setLayout(null);

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(540, 50, 132, 28);
        title.setFont(new Font("Roboto", Font.BOLD, 24));
        title.setForeground(Color.white);
        aframe.add(title);

        JLabel exit = new JLabel("EXIT");
        exit.setBounds(75, 50, 132, 28);
        exit.setFont(new Font("Roboto", Font.BOLD, 22));
        exit.setForeground(Color.white);
        aframe.add(exit);

        JLabel bal = new JLabel("Balance ");
        bal.setBounds(241, 262, 80, 21);
        bal.setFont(new Font("Roboto", Font.BOLD, 18));
        bal.setForeground(Color.white);
        aframe.add(bal);

         JLabel amount = new JLabel("$" + getAmount());
         amount.setBounds(316, 262, 90, 21);
         amount.setFont(new Font("Roboto", Font.PLAIN, 18));
         amount.setForeground(Color.white);
         aframe.add(amount);






         aframe.setResizable(false);
        aframe.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBalance();
    }




}
