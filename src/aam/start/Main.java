/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aam.start;

import aam.gui.Mp3GUI;

/**
 *
 * @author Augusto Marrengula
 */
public class Main
{

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(() -> {
            Mp3GUI dialog = new Mp3GUI(new java.awt.Frame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter()
            {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e)
                {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
}
