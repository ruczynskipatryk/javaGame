package org.example;

import javax.swing.*;

public class GameWindow extends JFrame {
    private JFrame jFrame;
    public GameWindow() {
        jFrame = new JFrame();

        jFrame.setSize(400,400);
        // EXIT when we close the program
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
