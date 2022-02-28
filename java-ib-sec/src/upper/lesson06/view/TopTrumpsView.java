package upper.lesson06.view;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

import upper.lesson06.view.partials.CardPartialView;
import upper.lesson06.view.partials.CatImage;

public class TopTrumpsView extends JFrame {

    protected final int WIDTH = 550;

    protected final int HEIGHT = 450;
    
    public TopTrumpsView() {
        setSize(WIDTH, HEIGHT);
        add(new CardPartialView());
        add(new CardPartialView());      
        add(new CatImage());
        setLayout(new FlowLayout());
        pack();
        setVisible(true);
    }
}
