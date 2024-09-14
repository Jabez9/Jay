package com.mycompany.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sso1 extends JFrame implements ActionListener {
    JLabel lbluser, lblpassword;
    JTextField txtuser;
    JPasswordField pspass;
    JButton btnlogin, btnexit;

    public sso1() {

        lbluser = new JLabel("Username");
        lblpassword = new JLabel("Password");
        // lblpassword.setBounds(2, 4, 6, 8);
        txtuser = new JTextField(20);
        pspass = new JPasswordField(20);
        btnlogin = new JButton("Login");
        btnexit = new JButton("Exit");

        setTitle("Authetication");
        setVisible(true);
        setSize(310, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(lbluser);
        add(txtuser);
        add(lblpassword);
        add(pspass);
        add(btnlogin);
        add(btnexit);

        btnlogin.addActionListener(this);
        btnexit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int Choice = JOptionPane.showConfirmDialog(null, "You are about to exit");
                if (Choice == 0)
                    System.exit(0);
            }
            // use of anonymous object
        });

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Login")) {

            String uname = txtuser.getText();
            String pword = pspass.getText();
            if (uname.equalsIgnoreCase("Student") && pword.equals("MMU")) {
                JOptionPane.showMessageDialog(this, uname + " welcome");
                new Calculator();
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect credentials.\nTry again");
                txtuser.setText("");
                pspass.setText("");
            }

        } else {

        }

    }

    public static void main(String[] args) {

        new sso1();
    }

}
