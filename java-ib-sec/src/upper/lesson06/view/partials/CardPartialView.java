package upper.lesson06.view.partials;

import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

public class CardPartialView extends JPanel {
    
    public CardPartialView () {
        setPreferredSize(new DimensionUIResource(200, 300));
        setBackground(new ColorUIResource(100, 200, 200));;
        setVisible(true);
    }
}
