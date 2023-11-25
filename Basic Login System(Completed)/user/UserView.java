package book.system;

import javax.swing.*;
import java.awt.*;

public class UserView {
    private JPanel panel;
    private JPanel userPanel;

    private JLabel label;

    private JButton logoutButton;

    public UserView() {
        panel = new JPanel(new GridLayout());

        userPanel = new JPanel();
        userPanel.setBounds(0, 0, 310, 400);
        userPanel.setLayout(null);
        userPanel.setBackground(Color.red);

        label = new JLabel("Welcome User!!");
        label.setFont(new Font("Arial", Font.BOLD, 15));
        label.setBounds(20, 50, 200, 50);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(180, 320, 100, 30);

        userPanel.add(label);
        userPanel.add(logoutButton);

        panel.add(userPanel);
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JPanel getPanel() {
        return panel;
    }
}
