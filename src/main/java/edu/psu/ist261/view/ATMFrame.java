package edu.psu.ist261.view;

import javax.swing.*;
import java.awt.*;

public class ATMFrame extends JFrame {

    public ATMFrame() {
        setTitle("ReyesATM");
        setSize(700, 560);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#FFFFFF"));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}
