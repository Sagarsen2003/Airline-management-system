package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Log_in extends JFrame implements ActionListener {

    JButton reset, submit, close;
    JTextField tuserName;
    JPasswordField tPassword;

    public Log_in() {
        // Set the window background color
        getContentPane().setBackground(Color.WHITE);

        // Set the window layout
        setLayout(null);

        // Labels for username and password
        JLabel lblUsername = new JLabel("USERNAME");
        JLabel lblPassword = new JLabel("PASSWORD");

        // Set the position and size of labels
        lblUsername.setBounds(20, 20, 100, 20);
        lblPassword.setBounds(20, 60, 100, 20);

        // Add labels to the window
        add(lblUsername);
        add(lblPassword);

        // Text fields for user input
        tuserName = new JTextField();
        tuserName.setBounds(130, 20, 200, 20);

        tPassword = new JPasswordField();
        tPassword.setBounds(130, 60, 200, 20);

        // Buttons for reset, submit, and close
        reset = new JButton("RESET");
        reset.setBounds(40, 120, 120, 20);

        submit = new JButton("SUBMIT");
        submit.setBounds(190, 120, 120, 20);

        close = new JButton("CLOSE");
        close.setBounds(130, 160, 120, 20);

        // Add text fields to the window
        add(tuserName);
        add(tPassword);

        // Add action listeners to buttons
        reset.addActionListener(this);
        add(reset);

        submit.addActionListener(this);
        add(submit);

        close.addActionListener(this);
        add(close);

        // Set the size of the window
        setSize(400, 250);

        // Set the location of the window on the screen
        setLocation(750, 300);

        // Set the title of the window
        setTitle("Login");

        // Make the window visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String username = tuserName.getText().trim();
            String password = new String(tPassword.getPassword()).trim();

            try {
                // Create an instance of the DatabaseConnection class
                DatabaseConnection dbConn = new DatabaseConnection();

                // Get the statement object
                Statement stmt = dbConn.getStatement();

                // SQL query to check username and password
                String query = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password
                        + "'";
                ResultSet rs = stmt.executeQuery(query);

                if (rs.next()) {
                    System.out.println("Valid ");
                } else {
                    JOptionPane.showMessageDialog(null, "You entered an invalid username or password");
                    setVisible(false);
                }

                // Close resources
                rs.close();
                dbConn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == reset) {
            tuserName.setText(null);
            tPassword.setText(null);
        }
    }

    public static void main(String[] args) {
        // Call the Login class
        new Log_in();
    }
}
