package parts;

import java.awt.*;
import java.awt.event.FocusListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.MyFocusedListener;
import myComponents.MyJPanel;
import myComponents.MyJTextField;

public class EditPanel {

    private static JPanel panel=null;
    private static final Font font = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    private static JTextField firstDigit;
    private static JTextField secondDigit;
    private static JTextField resDigit;
    private static JTextField edOperation;
    private static JTextField edEqual;
    private static JTextField focusDigit;

    public static JTextField getFocusDigit() {
        return focusDigit;
    }

    public static void setFocusDigit(JTextField focusDigit) {
        EditPanel.focusDigit = focusDigit;
    }

    public static JTextField getFirstDigit() {
        return firstDigit;
    }

    public static void setFirstDigit(String dig1) {
        firstDigit.setText(dig1);
    }

    public static JTextField getSecondDigit() {
        return secondDigit;
    }

    public static void setSecondDigit(String dig2) {
        secondDigit.setText(dig2);
    }

    public static JTextField getResDigit() {
        return resDigit;
    }

    public static void setResDigit(String res) {
        resDigit.setText(res);
    }

    public static JTextField getEdOperation() {
        return edOperation;
    }

    public static void setEdOperation(String op) {
        edOperation.setText(op);
    }

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
        FocusListener fl = new MyFocusedListener();
        // создаем верхнюю панель с числами 
        firstDigit = new MyJTextField(60,100,font);
        firstDigit.addFocusListener(fl);
        secondDigit = new MyJTextField(60,100,font);
        secondDigit.addFocusListener(fl);
        resDigit = new MyJTextField(60,100,font,false);
        //resDigit.setBackground(Color.RED);
        edOperation = new MyJTextField(30,100,font,false);
        edOperation.setBorder(null);
        edEqual = new MyJTextField(30,100,font,false);
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
