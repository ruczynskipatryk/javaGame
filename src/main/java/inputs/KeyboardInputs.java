package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // Moving of monsters - basic control of the game
    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("It's W");
                break;
            case KeyEvent.VK_S:
                System.out.println("It's S");
                break;
            case KeyEvent.VK_A:
                System.out.println("It's A");
                break;
            case KeyEvent.VK_D:
                System.out.println("It's D");
                break;
        }
    }
}
