package book.system;

import java.awt.event.*;
import java.io.*;

public class RegisterController {
    private RegisterView view;
    private RegisterModel model;

    public RegisterController(RegisterView view, RegisterModel model) {
        this.view = view;
        this.model = model;

        view.getRegisteredButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setUsername(view.getNameTextField().getText());
                model.setUsername(view.getUsernameTextField().getText());
                model.setPassword(String.valueOf(view.getPasswordField().getPassword()));

                // Perform registration functionality here
                System.out.println("Registering:");
                System.out.println("Name: " + model.getName());
                System.out.println("Username: " + model.getUsername());
                System.out.println("Password: " + model.getPassword());

                 // Create file using username and write password if file doesn't exist
                createFileIfNotExists(model.getUsername(), model.getPassword());
            }
        });
        
        //switches panelLogin back
        view.getCancelButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the login view or perform necessary actions
                // Example: show/login panel
                System.out.println("Switching to Login");
            }
        });
    }

    private void createFileIfNotExists(String username, String password) {
    String folderPath = "database"; // Folder name where files will be stored
    String fileName = folderPath + File.separator + username + ".txt"; // File path including the folder

    File file = new File(fileName);

    if (!file.exists()) {
        try {
            // Ensure that the directory exists, create if it doesn't
            File directory = new File(folderPath);
            if (!directory.exists()) {
                directory.mkdirs(); // Creates the directory and any necessary but nonexistent parent directories
            }

            FileWriter writer = new FileWriter(fileName);
            writer.write("Password: " + password);
            writer.close();
            System.out.println("File created for user: " + username + " in the 'database' folder");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    } else {
        System.out.println("File for user " + username + " already exists in the 'database' folder.");
     }
  }

}
