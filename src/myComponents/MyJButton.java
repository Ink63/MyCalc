package myComponents;

import javax.swing.JButton;
import java.awt.*;

public class MyJButton extends JButton{

    private MyJButton(String title) {
        super.setText(title);

    }

    public MyJButton(String title, Font font) {
            super.setText(title);
            super.setFont(font);

    }

    public MyJButton(String title, Font font, String name) {
        this(title,font);
        super.setName(name);
    }

    public MyJButton(String title, int width, int height) {
        this(title);
        super.setSize(width,height);
    }
    
    
        
}
