package org.example;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Fill rect to fill the all field
        g.fillRect(100, 100, 200, 50);
    }
}
