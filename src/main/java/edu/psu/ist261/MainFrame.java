package edu.psu.ist261;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("ReyesATM");
        setSize(700, 560);
        setLayout(null);
        getContentPane().setBackground(Color.decode("#626C90"));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

}
