package com.mycompany.gui;

// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.GridLayout;

// public class Calculator extends JFrame implements ActionListener {
//     JRadioButton rbtncalc, rbtnnone;
//     JTextField txtspace;
//     JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl0, lblplus, lblminus, lblmul, lbldiv, lblequal;
//     JButton btncalc;
//     ButtonGroup bgoption = new ButtonGroup();

//     public Calculator() {
//         rbtncalc = new JRadioButton("Calculator");
//         rbtnnone = new JRadioButton("None");
//         bgoption.add(rbtncalc);
//         bgoption.add(rbtnnone);
//         rbtncalc.addActionListener(this);

//         add(rbtncalc);
//         add(rbtnnone);

//         setTitle("Main Form");
//         setVisible(true);
//         setSize(310, 200);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setLayout(new GridLayout(5, 4, 5, 5));

//     }

//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == rbtncalc && rbtncalc.isSelected()) {
//             getContentPane().removeAll();

//             txtspace = new JTextField(200);
//             lbl1 = new JLabel("1");
//             lbl2 = new JLabel("2");
//             lbl3 = new JLabel("3");
//             lbl4 = new JLabel("4");
//             lbl5 = new JLabel("5");
//             lbl6 = new JLabel("6");
//             lbl7 = new JLabel("7");
//             lbl8 = new JLabel("8");
//             lbl9 = new JLabel("9");
//             lbl0 = new JLabel("0");
//             lblplus = new JLabel("+");
//             lblminus = new JLabel("-");
//             lblmul = new JLabel("*");
//             lbldiv = new JLabel("%");
//             lblequal = new JLabel("=");
//             btncalc = new JButton("Calc");

//             add(txtspace);
//             add(lbl1);
//             add(lbl2);
//             add(lbl3);
//             add(lbl4);
//             add(lbl5);
//             add(lbl6);
//             add(lbl7);
//             add(lbl8);
//             add(lbl9);
//             add(lbl0);
//             add(lblplus);
//             add(lblminus);
//             add(lblmul);
//             add(lbldiv);
//             add(lblequal);
//             add(btncalc);

//             revalidate();
//             repaint();

//         }
//     }

//     public static void main(String[] args) {
//         new Calculator();
//     }

// }

// import javax.swing.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.GridLayout;

// public class Calculator extends JFrame implements ActionListener {
//     JRadioButton rbtncalc, rbtnnone;
//     JTextField txtspace;
//     JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
//     JButton btnplus, btnminus, btnmul, btndiv, btnequal;
//     JButton btncalc;
//     ButtonGroup bgoption = new ButtonGroup();

//     public Calculator() {
//         setTitle("Calculator");
//         setLayout(new GridLayout(5, 4, 5, 5));

//         rbtncalc = new JRadioButton("Calculator");
//         rbtnnone = new JRadioButton("None");
//         bgoption.add(rbtncalc);
//         bgoption.add(rbtnnone);
//         rbtncalc.addActionListener(this);

//         // Add radio buttons to the frame
//         add(rbtncalc);
//         add(rbtnnone);

//         setVisible(true);
//         setSize(400, 300);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }

//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == rbtncalc && rbtncalc.isSelected()) {
//             // Clear the frame before adding calculator components
//             getContentPane().removeAll();

//             txtspace = new JTextField(20);
//             btn1 = new JButton("1");
//             btn2 = new JButton("2");
//             btn3 = new JButton("3");
//             btn4 = new JButton("4");
//             btn5 = new JButton("5");
//             btn6 = new JButton("6");
//             btn7 = new JButton("7");
//             btn8 = new JButton("8");
//             btn9 = new JButton("9");
//             btn0 = new JButton("0");
//             btnplus = new JButton("+");
//             btnminus = new JButton("-");
//             btnmul = new JButton("*");
//             btndiv = new JButton("/");
//             btnequal = new JButton("=");
//             btncalc = new JButton("Calc");
//             btncalc.addActionListener(this);

//             // Add action listeners to buttons
//             btn1.addActionListener(this);
//             btn2.addActionListener(this);
//             btn3.addActionListener(this);
//             btn4.addActionListener(this);
//             btn5.addActionListener(this);
//             btn6.addActionListener(this);
//             btn7.addActionListener(this);
//             btn8.addActionListener(this);
//             btn9.addActionListener(this);
//             btn0.addActionListener(this);
//             btnplus.addActionListener(this);
//             btnminus.addActionListener(this);
//             btnmul.addActionListener(this);
//             btndiv.addActionListener(this);
//             btnequal.addActionListener(this);

//             add(txtspace);
//             add(btn1);
//             add(btn2);
//             add(btn3);
//             add(btn4);
//             add(btn5);
//             add(btn6);
//             add(btn7);
//             add(btn8);
//             add(btn9);
//             add(btn0);
//             // add(rootPane);
//             add(btnplus);
//             add(btnminus);
//             add(btnmul);
//             add(btndiv);
//             add(btnequal);
//             add(btncalc);

//             // Revalidate and repaint the frame to reflect the changes
//             revalidate();
//             repaint();
//         }
//     }

//     public static void main(String[] args) {
//         new Calculator();
//     }
// }

import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class Calculator extends JFrame implements ActionListener {
    JTextField txtspace;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    JButton btnplus, btnminus, btnmul, btndiv, btnequal, btnclear, btncalc;
    String currentEquation = "";
    JRadioButton rbtncalc, rbtnnone;
    ButtonGroup bgoption = new ButtonGroup();

    public Calculator() {
        setTitle("Calculator");
        setLayout(new GridLayout(5, 4, 5, 5));
        rbtncalc = new JRadioButton("Calculator");
        rbtnnone = new JRadioButton("None");
        bgoption.add(rbtncalc);
        bgoption.add(rbtnnone);
        rbtncalc.addActionListener(this);
        // Add radio buttons to the frame
        add(rbtncalc);
        add(rbtnnone);
        txtspace = new JTextField(20);
        txtspace.setEditable(false);
        setSize(310, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rbtncalc && rbtncalc.isSelected()) {
            // Clear the frame before adding calculator components
            // getContentPane().removeAll();

            btn1 = createButton("1");
            btn2 = createButton("2");
            btn3 = createButton("3");
            btn4 = createButton("4");
            btn5 = createButton("5");
            btn6 = createButton("6");
            btn7 = createButton("7");
            btn8 = createButton("8");
            btn9 = createButton("9");
            btn0 = createButton("0");

            btnplus = createButton("+");
            btnminus = createButton("-");
            btnmul = createButton("*");
            btndiv = createButton("/");
            btnequal = createButton("=");
            btnclear = createButton("C");

            add(txtspace);
            add(btn1);
            add(btn2);
            add(btn3);
            add(btn4);
            add(btn5);
            add(btn6);
            add(btn7);
            add(btn8);
            add(btn9);
            add(btn0);
            add(btnplus);
            add(btnminus);
            add(btnmul);
            add(btnequal);
            add(btndiv);
            add(btnclear);

        }
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        return button;
    }

    public void ActionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("0123456789".contains(command)) {
            currentEquation += command;
        } else if ("+-*/".contains(command)) {
            currentEquation += " " + command + " ";
        } else if ("=".equals(command)) {
            currentEquation = evaluate(currentEquation);
        } else if ("C".equals(command)) {
            currentEquation = "";
        }
        txtspace.setText(currentEquation);
    }

    private String evaluate(String equation) {
        String[] parts = equation.split(" ");
        int result = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int operand = Integer.parseInt(parts[i + 1]);
            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    result /= operand;
                    break;
            }
        }
        return Integer.toString(result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
