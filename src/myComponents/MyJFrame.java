package myComponents;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.*;

public class MyJFrame extends JFrame{

    private MyJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        super.setIconImage(new ImageIcon("icon.jpg").getImage());

    }

    public MyJFrame(String title, int width, int height, Component comp) {
        this(title,width,height);
        super.getContentPane().add(comp);
    }

    public MyJFrame(String title, int width, int height, LayoutManager lm) {
        this(title,width,height);
        super.setLayout(lm);
    }
    

}
