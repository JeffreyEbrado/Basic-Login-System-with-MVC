package book.system;

import javax.swing.*;
import java.awt.*;

public class RegisterView {

    private JTextField nameTextField;
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    private JPanel panel;
    private JPanel registerPanel;

    private JLabel registerLabel;
    private JLabel nameLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    private JButton cancelButton;
    private JButton registerButton;

    public RegisterView() {

        panel = new JPanel(new GridLayout(1, 1));
   
        registerPanel = new JPanel();
        registerPanel.setBounds(0, 0, 310, 400);
        registerPanel.setLayout(null);
        registerPanel.setBackground(Color.blue);

        registerLabel = new JLabel("REGISTER");
        registerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        registerLabel.setBounds(60, 30, 300, 50);

        nameLabel = new JLabel("Name: ");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nameLabel.setBounds(20, 100, 150, 15);

        nameTextField = new JTextField();
        nameTextField.setBounds(20, 115, 250, 30);

        usernameLabel = new JLabel("Username: ");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        usernameLabel.setBounds(20, 160, 150, 15);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(20, 175, 250, 30);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));
        passwordLabel.setBounds(20, 220, 150, 15);

        passwordField = new JPasswordField();
        passwordField.setBounds(20, 235, 250, 30);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(20, 275, 120, 30);

        registerButton = new JButton("Register");
        registerButton.setBounds(150, 275, 120, 30);

        registerPanel.add(registerLabel);
        registerPanel.add(nameLabel);
        registerPanel.add(nameTextField);
        registerPanel.add(usernameLabel);
        registerPanel.add(usernameTextField);
        registerPanel.add(passwordLabel);
        registerPanel.add(passwordField);
        registerPanel.add(cancelButton);
        registerPanel.add(registerButton);

        panel.add(registerPanel);
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getRegisteredButton() {
        return registerButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public JPanel getPanel() {
        return panel;
    }
}
