import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class FlappyCat implements ActionListener, MouseListener, KeyListener{
    public static FlappyCat flappyCat;

    public boolean gameOver, started, begining = true;

    Timer timer = new Timer(20, this);

    public FlappyCat(){
        gameSettings();
        initialize();
        timer.start();
    }

    public void initialize() {
    }

    public void gameSettings() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
