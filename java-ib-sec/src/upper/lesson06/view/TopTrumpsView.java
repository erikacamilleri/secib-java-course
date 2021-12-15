package upper.lesson06.view;

import java.awt.*;
import javax.swing.JFrame;

import upper.lesson06.view.partials.CardPartialView;

public class TopTrumpsView extends JFrame {

    protected final int WIDTH = 550;

    protected final int HEIGHT = 450;
    
    public TopTrumpsView() {
        setSize(WIDTH, HEIGHT);
        add(new CardPartialView());
        add(new CardPartialView());
        setLayout(new FlowLayout());
        setVisible(true);
    }
}
