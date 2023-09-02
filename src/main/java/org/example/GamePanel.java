package org.example;

import inputs.KeyboardInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    public GamePanel(){
        addKeyListener(new KeyboardInputs());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Fill rect to fill the all field
        g.fillRect(100, 100, 200, 50);
    }
}
