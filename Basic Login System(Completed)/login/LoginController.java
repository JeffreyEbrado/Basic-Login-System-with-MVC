package book.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoginController {
    private LoginView view;
    private LoginModel model;

    public LoginController(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;

        view.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setUsername(view.getUsernameTextField().getText());
                model.setPassword(String.valueOf(view.getPasswordField().getPassword()));
                //I can add actions here

            }
        });

        view.getSwitchToRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //guide               
                System.out.println("Switching to Register");
                //I can add actions here

            }
        });
    }

    public boolean validatePassword(String fileName, String enteredPassword) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {

                // Assuming the password is stored as "Password: 'actual_password'"

                if (line.startsWith("Password: ")) {

                    String passwordFromFile = line.substring("Password: ".length());

                    // Compare enteredPassword with passwordFromFile
                    return enteredPassword.equals(passwordFromFile.trim());
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
