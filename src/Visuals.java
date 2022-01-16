import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Visuals {

    public Font font;
    public Image cat, back, button, small_button, menu_background;
    private Dimensions Constants;



    public void showScore(Graphics g, int score){
        g.setFont(font);
        g.drawString("Score", 25, 710);
        g.setFont(font);
        g.drawString(String.valueOf(score), 65, 750);
    }

    public void startGame(Graphics g){
        g.setFont(font);
        g.drawString("Click to start!", 75, Constants.SIZE / 2 - 50);
    }
}
