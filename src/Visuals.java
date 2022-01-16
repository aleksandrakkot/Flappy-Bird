import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Visuals {

    public Font font;
    public Image cat, back, button, small_button, menu_background, pipe;
    private Dimensions Constants;

    public Visuals()
    {
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File(".\\src\\font\\font.otf")).deriveFont(60f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(".\\src\\font\\font.otf")));
        } catch (IOException | FontFormatException e) {
            System.exit(1);
        }

        menu_background = new ImageIcon(".\\src\\img\\menu-background.png").getImage();
        button = new ImageIcon(".\\src\\img\\button.png").getImage();
        small_button = new ImageIcon(".\\src\\img\\small_button.png").getImage();
        back = new ImageIcon(".\\src\\img\\back.png").getImage();
        cat = new ImageIcon(".\\src\\img\\cat.png").getImage();
        pipe = new ImageIcon(".\\src\\img\\cat.png").getImage();
    }

    public void homeScreen(Graphics g) {
        g.drawImage(menu_background, 0, 0, Constants.SIZE, Constants.SIZE, null);

        g.setColor(Color.GRAY);
        g.setFont(font);

        g.drawString("Flappy Cat!", 100, Constants.SIZE / 2 - 150);

        g.setColor(Color.WHITE);


        g.drawImage(button, 150, 400, 500, 60, null);
        g.drawString("Start Game", 300, 444);

        g.drawImage(small_button, 410, 500, 240, 60, null);
        g.drawString("Quit", 500, 544);
    }

    public void drawGame(Graphics g, Rectangle player) {
        g.drawImage(back, 0, 0, Constants.SIZE, Constants.MAPMAXHEIGHT, null);
        //g.drawImage(gameGround, 0, Constants.MAPMAXHEIGHT, Constants.SIZE, Constants.SIZE - Constants.MAPMAXHEIGHT, null);
        g.drawImage(cat, player.x, player.y, player.width, player.height, null);
    }

    public void drawPipe(Graphics g, Rectangle pipeRect) {
        g.setColor(Color.black.darker());
        g.drawImage(pipe, pipeRect.x, pipeRect.y, pipeRect.width, pipeRect.height, Color.BLACK,null);
    }

    public void startBanner(Graphics g) {
        g.setFont(font);
        g.drawString("Click to start!", 75, Constants.SIZE / 2 - 50);
    }

    public void gameOverScreen(Graphics g, int finalScore) {
        int tooLong;
        g.setFont(font);
        g.drawString("Game Over!", 300, Constants.SIZE / 2 - 150);
        if(finalScore <= 10) tooLong = 0;  else tooLong = 5;
        g.drawString("Your score: " + finalScore, 270 - tooLong, Constants.SIZE / 2 - 50);
        g.drawString("Click to play again",240,Constants.SIZE / 2 + 50);
        g.drawImage(cat,0, 0, 75, 65, null);
    }

    public void scoreBar(Graphics g, int score) {
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString("Score: " + score, 25, 730);
    }
}
