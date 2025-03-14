package java.awt.event;

import java.util.EventListener;

public interface KeyListener extends EventListener {
    /**
     * Invoked when a key has been typed.
     */
    public void keyTyped(KeyEvent e);

    /**
     * Invoked when a key has been pressed.
     */
    public void keyPressed(KeyEvent e);

    /**
     * Invoked when a key has been released.
     */
    public void keyReleased(KeyEvent e);
}
