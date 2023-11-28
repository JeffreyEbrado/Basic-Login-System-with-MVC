package book.system;

import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView, loginModel);

        //used to change panel using registerButton from login to register and so on
        RegisterModel registerModel = new RegisterModel();
        RegisterView registerView = new RegisterView();
        RegisterController registerController = new RegisterController(registerView, registerModel);

        UserView userView = new UserView();
        UserModel userModel = new UserModel();
        UserController userController = new UserController(userView, userModel);

        // Creating the main JFrame to display the panels
        JFrame frame = new JFrame("Login/Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(310, 400);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Adding the login panel initially
        frame.add(loginView.getPanel());
        frame.setVisible(true);

/* Login Part */

        //LOGIN: loginButton -> USER
        // Assuming successful login action performs the switch to the user panel
        loginView.getLoginButton().addActionListener(e -> {

            loginModel.setUsername(loginView.getUsernameTextField().getText());
            loginModel.setPassword(String.valueOf(loginView.getPasswordField().getPassword()));

                // Check if file exists for the entered username
                String folderPath = "database";
                String fileName = folderPath + File.separator + loginModel.getUsername() + ".txt";
   
                File file = new File(fileName);

                if (file.exists()) {
                    // File exists, try to validate password
                    if (loginController.validatePassword(fileName, loginModel.getPassword())) {
                        
                        System.out.println("Login successful!!!");
                        frame.getContentPane().removeAll();
                        frame.add(userView.getPanel());
                        frame.revalidate();
                        frame.repaint();

                    } else {
                        System.out.println("Incorrect password!");
                    }
                } else {
                    System.out.println("User does not exist!");
                }
        });

        // LOGIN: registerButton -> REGISTER
        // Switching to register panel when press
        loginView.getSwitchToRegisterButton().addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.add(registerView.getPanel());
            frame.revalidate();
            frame.repaint();
        });

/* Register Part */   
        
        //REGISTER: registerButton -> LOGIN
        // Switching back to login panel when registered
        registerView.getRegisteredButton().addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.add(loginView.getPanel());
            frame.revalidate();
            frame.repaint();
        });
        
        //REGISTER: cancelButton -> LOGIN
        // Switching back to login panel if cancelled
        registerView.getCancelButton().addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.add(loginView.getPanel());
            frame.revalidate();
            frame.repaint();
        });

/* User Part */

        // Switching back to login panel from user panel
        userView.getLogoutButton().addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.add(loginView.getPanel());
            frame.revalidate();
            frame.repaint();
        });   
    }
}
