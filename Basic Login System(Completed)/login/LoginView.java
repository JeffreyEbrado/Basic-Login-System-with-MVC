package book.system;

import javax.swing.*;
import java.awt.*;

public class LoginView {
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton switchToRegisterButton;
    private JPanel panel;
    private JPanel loginPanel;
    private JLabel loginLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    public LoginView() {
        panel = new JPanel(new GridLayout(1, 1));

        loginPanel = new JPanel();
        loginPanel.setBounds(0, 0, 310, 400);
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.yellow);

        loginLabel = new JLabel("LOGIN");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 50));
        loginLabel.setBounds(60, 30, 250, 50);

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        usernameLabel.setBounds(20, 100, 150, 15);
        
        usernameTextField = new JTextField();
        usernameTextField.setBounds(20, 115, 250, 30);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));
        passwordLabel.setBounds(20, 160, 150, 15);

        passwordField = new JPasswordField();
        passwordField.setBounds(20, 175, 250, 30);

        loginButton = new JButton("Login");
        loginButton.setBounds(20, 225, 250, 30);

        switchToRegisterButton = new JButton("Register");
        switchToRegisterButton.setBounds(20, 265, 250, 30);
        
        loginPanel.add(loginLabel);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(switchToRegisterButton);

        panel.add(loginPanel);
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getSwitchToRegisterButton() {
        return switchToRegisterButton;
    }

    public JPanel getPanel() {
        return panel;
    }
}
