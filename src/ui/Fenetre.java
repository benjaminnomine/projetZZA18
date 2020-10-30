package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame {
    public Fenetre() {
        setFrame();
        setListeners();
    }

    private void setListeners() {
    }

    private void setFrame() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        JPanel fenetre = new JPanel(new BorderLayout());

        // code à ajouter


        this.setContentPane(fenetre);
        this.setSize(WIDTH,HEIGHT);
        this.setVisible(true);
    }


}
