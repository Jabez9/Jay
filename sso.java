package com.mycompany.gui;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class sso extends JFrame implements ActionListener {
    JLabel lblusername, lblpassword, lblconfpassword;
    JRadioButton rbnnew, rbnexisting;
    JTextField txtuser = new JTextField(20);
    JPasswordField pspassword, psconfpassword;
    JButton btnlogin, btnreset;
    ButtonGroup bguser = new ButtonGroup();

    public sso() {
        lblusername = new JLabel("User Name");
        rbnnew = new JRadioButton("New User");
        rbnexisting = new JRadioButton("Existing user");
        lblpassword = new JLabel("Password");
        lblconfpassword = new JLabel("Confirm Password");
        txtuser = new JTextField();
        pspassword = new JPasswordField(20);
        psconfpassword = new JPasswordField(20);
        btnlogin = new JButton("Login");
        btnreset = new JButton("Reset");
        bguser.add(rbnnew);
        bguser.add(rbnexisting);
        pspassword.setEditable(false);
        psconfpassword.setEditable(false);
        JMenuBar bar = new JMenuBar();
        JMenu mnuFile = new JMenu("File");
        JMenuItem mniOpen = new JMenuItem("Open");
        // JMenuItem mniClose = new JMenuItem();
        // JMenuItem ;
        // JMenuItem ;

        setTitle("User Information");
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        setJMenuBar(bar);

        add(lblusername);
        add(txtuser);
        add(rbnnew);
        add(rbnexisting);
        add(lblpassword);
        add(pspassword);
        add(lblconfpassword);
        add(psconfpassword);
        add(btnlogin);
        add(btnreset);
        rbnnew.addActionListener(this);
        rbnexisting.addActionListener(this);
        btnlogin.addActionListener(this);
        bar.add(mnuFile);
        mnuFile.add(mniOpen);
        mniOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Empty Menu");
            }

        });

    }

    public void actionPerformed(ActionEvent e) {
        /*
         * getSource() - returns the object
         * getAction ()- returns the string
         */

        if (e.getSource() == rbnnew) {
            pspassword.setEditable(true);
            psconfpassword.setEditable(true);
            btnlogin.setText("Create User");
        }
        if (e.getSource() == rbnexisting) {
            // if (e.getActionCommand().equals(rbnexisting.getText())) {
            pspassword.setEditable(true);
            psconfpassword.setEditable(false);
            btnlogin.setText("Login");
        }
        if (e.getSource() == btnlogin) {
            // if (e.getActionCommand().equals("Login")) {

            String uname = txtuser.getText();
            String pword = pspassword.getText();
            if (uname.equalsIgnoreCase("Student") && pword.equals("MMU")) {
                JOptionPane.showMessageDialog(this, uname + " you are Authorized");
            } else {
                JOptionPane.showMessageDialog(this, "Type mismatch.\nTry again");
                pspassword.setText("");
                psconfpassword.setText("");
            }

        }
    }

    public static void main(String[] args) {
        new sso();
    }

}
