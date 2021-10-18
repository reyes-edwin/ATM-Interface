package edu.psu.ist261;



import javax.swing.*;
import java.awt.*;

public class LogIn extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        Color color1 = new Color(139, 183, 223);
        Color color2 = new Color(39, 49, 58);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        LogIn logIn = new LogIn();
        frame.add(logIn);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }
}


