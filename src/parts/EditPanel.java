package parts;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JTextField;

import myComponents.MyJPanel;
import myComponents.MyJTextField;

public class EditPanel {
    private static JPanel panel=null;
    private static final Font font = new Font(Font.SANS_SERIF, Font.BOLD, 30);


    private EditPanel() {
        panel = new MyJPanel("Text",500,300,new FlowLayout());
        addComponents();        
    }    
        
    public static JPanel getPanel() {           
        if (panel==null) {
            new EditPanel();
        }
        return panel;
    }
    
    private static void addComponents() {
        // создаем верхнюю панель с числами 
        JTextField firstDigit = new MyJTextField(70,100,font);
        JTextField secondDigit = new MyJTextField(70,100,font);
        JTextField resDigit = new MyJTextField(70,100,font,false);
        //resDigit.setBackground(Color.RED);
        JTextField edOperation = new MyJTextField(30,100,font,false);
        edOperation.setBorder(null);
        JTextField edEqual = new MyJTextField(30,100,font,false);
        edEqual.setBorder(null);
        edEqual.setText("=");

        panel.add(firstDigit);
        panel.add(edOperation);
        panel.add(secondDigit);
        panel.add(edEqual);
        panel.add(resDigit);
        //panel.setMinimumSize(new Dimension(300,100));

    }
    

}
