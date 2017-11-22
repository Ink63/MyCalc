package parts;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JPanel;
import myComponents.MyJButton;
import myComponents.MyJPanel;

public class FourthPanel {
    
    private static JPanel panel=null;

    private FourthPanel() {
        panel = new MyJPanel("Equal",500,200,new FlowLayout());
        addComponents();   
    }

    public static JPanel getPanel() {
        if (panel==null) {
            new FourthPanel();
        }
        return panel;
    }     
    
        
    private static void addComponents() {
        // создаем нижнюю панель с кнопкой результат
        MyJButton btnEqual = new MyJButton("=",100,200);
        btnEqual.setPreferredSize(new Dimension(300,100));                
        btnEqual.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        panel.add(btnEqual);
        
    }
}
