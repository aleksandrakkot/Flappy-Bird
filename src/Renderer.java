import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel{
    private static final long serialVersionUID = 1L; //sprawdzamy czy dana klasa odpowieda obiektowi serializowanemu

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        FlappyCat.flappyCat.refresh(g);
    }
}
