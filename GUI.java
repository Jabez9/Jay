/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Swoosh
 */
public class GUI {

    public static void main(String[] args) {
        String name;
        // int option;
        name = JOptionPane.showInputDialog(null, "Enter your name ", "Title", JOptionPane.QUESTION_MESSAGE); // input
                                                                                                             // dialog
                                                                                                             // box

        JOptionPane.showMessageDialog(null, name + " you are welcome.");// message dialog box
        int option = JOptionPane.showConfirmDialog(null, " Do you want to exit?");// confirm dialog box
        if (option == 0)
            System.exit(0);
        else if (option == 1)
            System.out.println("Still running");

    }
    /*
     * message dialog without 'null' takes first parameter as parent object, so the
     * null is to show use of the screen as the parent object
     * Confirm dialog box
     * -has 'select an option'
     * -Are you sure?
     * - eg yes,no,cancel
     * -returns an integer depending on button clicked, eg yes is 0, no is 1 and
     * cancel is 2.
     */
}
