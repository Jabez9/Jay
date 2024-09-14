package com.mycompany.gui;

import javax.swing.*;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class MyGUI extends JFrame {
    private JLabel lbluser, lblmath, lblplus, lblEqual;
    private JTextField txtuser, txtNum1, txtNum2, txtResult;
    private JButton btnCompute = new JButton("Compute");

    // private JPasswordField psdpassword=ABC;

    public MyGUI() {
        lbluser = new JLabel("Username");
        // psdpassword= new JPasswordField("Password");
        lblmath = new JLabel("Maths: ");
        lblplus = new JLabel("+");
        lblEqual = new JLabel("=");
        txtuser = new JTextField(30);
        txtNum1 = new JTextField(5);
        txtNum2 = new JTextField(5);
        txtResult = new JTextField(5);
        setTitle("GUI Demo");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(lbluser);
        add(txtuser);
        add(lblmath);
        add(txtNum1);
        add(lblplus);
        add(txtNum2);
        add(lblEqual);
        add(txtResult);
        add(btnCompute);
        btnCompute.setBounds(130, 100, 100, 40);
        txtResult.setEditable(false);
        // btnCompute.addActionListener(this);

    }


    public static void main(String[] args) {
        new MyGUI();
    }

}
