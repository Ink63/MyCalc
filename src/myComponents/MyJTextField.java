package myComponents;

import javax.swing.*;
import java.awt.*;

public class MyJTextField extends JTextField
{
    private MyJTextField(int width, int height, boolean active) {
        super.setPreferredSize(new Dimension(width,height));
        super.setEditable(active);
        super.setFocusable(active);
    }

    public MyJTextField(int width, int height, Font font) {
        super.setPreferredSize(new Dimension(width,height));
        super.setFont(font);
    }

    public MyJTextField(int width, int height, Font font, boolean active) {
        this(width,height,active);
        super.setFont(font);

    }
}
