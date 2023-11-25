package book.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController {
    private UserView view;
    private UserModel model;

    public UserController(UserView view, UserModel model) {
        this.view = view;
        this.model = model;

        view.getLogoutButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform logout functionality here or switch to login view
                // Example: switch to the login view
                System.out.println("Logging out...");
                // For now, just printing a message
            }
        });
    }
}
