package myComponents;

import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MyJPanel extends JPanel{

    private MyJPanel(String name, int width, int height) {
        super.setSize(width,height);
        super.setName(name);
        super.setBorder(BorderFactory.createLoweredSoftBevelBorder());        
    }
    
    public MyJPanel(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.add(comp);        
    }
    
    public MyJPanel(String name, int width, int height, LayoutManager lm) {
        this(name, width, height);
        super.setLayout(lm);        
    }
    
    public MyJPanel(String name, int width, int height, LayoutManager lm, Component comp) {
        this(name, width, height, lm);
        super.add(comp);        
    }
}
