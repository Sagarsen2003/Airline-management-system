
package airline.management.system;   

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton reset, submit, close;
    JTextField tuserName;
    JPasswordField tPassword;
 
    public Login() {

//  To set the window background color
        getContentPane().setBackground(Color.WHITE);

// To set The window Layout
        setLayout(null);

//    To Show Types of Information in Windows 
        JLabel lblUsername = new JLabel("USERNAME");
        JLabel lblPassword = new JLabel("PASSWORD");

// For Setting the height and width, position of the label
        lblUsername.setBounds(20, 20, 100, 20); 
        lblPassword.setBounds(20, 60, 100, 20);

//       To add Labels On Screen
        add(lblUsername);
        add(lblPassword);

        //   For Taking User Input In Box
        tuserName = new JTextField();
        tuserName.setBounds(130, 20, 200, 20);

        tPassword = new JPasswordField();
        tPassword.setBounds(130, 60, 200, 20);

        reset = new JButton("RESET");
        reset.setBounds(40, 120, 120, 20);

        submit = new JButton("SUBMIT");
        submit.setBounds(190, 120, 120, 20);

        close = new JButton("CLOSE");
        close.setBounds(130, 160, 120, 20);

        add(tuserName);
        add(tPassword);

        reset.addActionListener(this);
        add(reset);

        submit.addActionListener(this);
        add(submit);

        close.addActionListener(this);
        add(close);

//  To Set the size of the Window length and width
        setSize(400, 250);

//  To Set the Location on Screen in both horizontally and vertically
        setLocation(750, 300);

//  To Show the Window Title
        setTitle("Login");

//  To Show the Login window
        setVisible(true);

    }

    @Override
// To Perfrom button Operations
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == submit) {

        } else if (ae.getSource() == close) {
            setVisible(false);
        } else if (ae.getSource() == reset) {
            tuserName.setText(null);
            tPassword.setText(null);

        }
    }

    public static void main(String[] args) {

// To Call the Login Class 
        new Login();
    }
}
