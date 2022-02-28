package upper.lesson06.view.partials;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

public class CatImage extends JPanel {
    
    private final String IMAGE_REL_PATH = "res/assets/cat_image_001.jpg";
    
    public CatImage() {
        setBackground(new ColorUIResource(40, 40, 40));
        setPreferredSize(new DimensionUIResource(200, 300));
        add(new JLabel(new ImageIcon(IMAGE_REL_PATH)));
        setVisible(true);
    }
}
