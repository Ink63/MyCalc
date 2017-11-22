import myComponents.MyJFrame;
import parts.MainWin;

import javax.swing.*;
import java.awt.*;

public class MySwing {
    static final int WIN_WIDTH = 300;
    static final int WIN_HEIGHT = 600;

    public static void main(String[] args)  {
        JFrame win = MainWin.getWin("Калькулятор",WIN_WIDTH,WIN_HEIGHT);
        win.setVisible(true);
    }
    
}
