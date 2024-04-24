package com.mycompany.gui;

import javax.swing.*;
import java.awt.event.*;

public class eventlistenertry extends JFrame implements ActionListener {
    JTextField tf;

    eventlistenertry() {

        // create components
        tf = new JTextField();
        tf.setBounds(60, 50, 170, 20);
        JButton b = new JButton("click me");
        b.setBounds(100, 120, 80, 30);

        // register listener
        b.addActionListener(this);// passing current instance

        // add components and set size, layout and visibility
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String args[]) {
        new eventlistenertry();
    }
}