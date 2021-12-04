package edu.psu.ist261.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LogInPanel extends JPanel {
    JTextField userNameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton logInButton = new JButton("Login");

    public LogInPanel() {
        setBounds(50, 50, 600, 430);
        setLayout(null);
        setVisible(true);
        setBackground(Color.decode("#FFFFFF"));

        JLabel title = new JLabel("ReyesATM");
        title.setBounds(0, 0, 132, 28);
        title.setFont(new Font("Helvetica", Font.BOLD, 24));
        title.setForeground(Color.decode("#2A68AB"));
        add(title);

        JLabel userName = new JLabel("Username:");
        userName.setForeground(Color.black);
        userName.setBounds(130, 128, 106, 40);
        userName.setFont(new Font("Helvetica", Font.BOLD, 20));
        add(userName);

        logInButton.setBounds(369, 275, 100, 50);
        logInButton.setFocusable(false);
        logInButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        logInButton.setForeground(Color.white);
        logInButton.setBackground(Color.decode("#8CC07D"));
        logInButton.setOpaque(true);
        logInButton.setBorderPainted(false);
        add(logInButton);

        userNameField.setBounds(269, 125, 200, 50);
        userNameField.setBackground(Color.decode("#DFDFDF"));
        userNameField.setOpaque(true);
        add(userNameField);

        JLabel passWord = new JLabel("Password:");
        passWord.setForeground(Color.black);
        passWord.setBounds(130, 203, 106, 40);
        passWord.setFont(new Font("Helvetica", Font.BOLD, 20));
        add(passWord);

        passwordField.setBounds(269, 200, 200, 50);
        passwordField.setBackground(Color.decode("#DFDFDF"));
        passwordField.setOpaque(true);
        add(passwordField);

    }

    public JTextField getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(JTextField userNameField) {
        this.userNameField = userNameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getLogInButton() {
        return logInButton;
    }

    public void setLogInButton(JButton logInButton) {
        this.logInButton = logInButton;
    }

}
