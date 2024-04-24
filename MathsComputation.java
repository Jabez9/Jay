package com.mycompany.gui;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class MathsComputation extends JFrame implements ActionListener, MouseListener {
    private JLabel lblInput, lblOper, lblEqual;
    private JTextField txtVal1, txtVal2, txtResult;
    private JButton btnSum, btnProd, btnExit;

    public MathsComputation() {
        lblInput = new JLabel("Input");
        lblOper = new JLabel("?");
        lblEqual = new JLabel("=");
        txtVal1 = new JTextField(5);
        txtVal2 = new JTextField(5);
        txtResult = new JTextField(5);
        btnSum = new JButton("Sum");
        btnProd = new JButton("Product");
        btnExit = new JButton("Exit");
        setTitle("Computation");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(lblInput);
        add(txtVal1);
        add(lblOper);
        add(txtVal2);
        add(lblEqual);
        add(txtResult);
        txtResult.setEditable(false);
        add(btnSum);
        add(btnProd);
        add(btnExit);

        btnSum.addActionListener(this);
        btnProd.addActionListener(new Demo());

        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int Choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
                if (Choice == 0)
                    System.exit(0);
            }
            // use of anonymous object
        });

        btnProd.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btnProd.setBackground(Color.CYAN);
                btnProd.setText("Multiplying");
            }

            public void mouseExited(MouseEvent e) {
                btnProd.setBackground(UIManager.getColor("Button.background"));
                btnProd.setText("Product");
            }
        });
    }

    public void actionPerformed(ActionEvent event) {
        lblOper.setText("+");
        int val1 = Integer.parseInt(txtVal1.getText());
        int val2 = Integer.parseInt(txtVal2.getText());
        int sum = val1 + val2;
        // txtResult.setText(sum+""); == to line 73
        txtResult.setText(Integer.toString(sum));
        JOptionPane.showMessageDialog(this, "Get sum of numbers");

    }

    private class Demo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lblOper.setText("*");
            int num1 = Integer.parseInt(txtVal1.getText());
            int num2 = Integer.parseInt(txtVal2.getText());
            int prd = num1 * num2;
            // txtResult.setText(sum+""); == to line 73
            txtResult.setText(Integer.toString(prd));
            JOptionPane.showMessageDialog(null, "Get product of numbers");

        }

    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        // Not used
    }

    public void mousePressed(MouseEvent e) {
        // Not used
    }

    public void mouseReleased(MouseEvent e) {
        // Not used
    }

    public void mouseEntered(MouseEvent e) {
        // Not used
    }

    public void mouseExited(MouseEvent e) {
        // Not used
    }

    public static void main(String[] args) {
        new MathsComputation();
    }
}
