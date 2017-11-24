package parts;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import listeners.DigitsBtnListener;
import listeners.OperationsBtnListener;
import myComponents.MyJButton;
import myComponents.MyJPanel;

public class OperationPanel {
    public static final String BTN_PLUS = "BTN+" ;
    public static final String BTN_MINUS = "BTN-";
    public static final String BTN_MULT = "BTN*";
    public static final String BTN_DIV = "BTN/";
    public static final String BTN_EQUAL = "BTN=";

    private static JPanel panel = null;
    private static final Font font = new Font(Font.SANS_SERIF, Font.BOLD, 30);


    private OperationPanel() {

        panel = new MyJPanel("Actions",100,300,new GridLayout(0,1,2,2) );
        addComponents();   
    }

    public static JPanel getPanel() {
        if (panel==null) {
            new OperationPanel();
        }
        return panel;
    }  

    private static void addComponents() {
        
        // создаем кнопки арифметических действий
        List<MyJButton> btnActions = new ArrayList<>();
        btnActions.add(new MyJButton("+",font, BTN_PLUS));
        btnActions.add(new MyJButton("-",font,BTN_MINUS));
        btnActions.add(new MyJButton("*",font, BTN_MULT));
        btnActions.add(new MyJButton("/",font, BTN_DIV));
        btnActions.add(new MyJButton("=",font, BTN_EQUAL));

        ActionListener al = new OperationsBtnListener();

        // добавляем кнопки на панель
        for (MyJButton btnAction : btnActions) {
            panel.add(btnAction);
            btnAction.addActionListener(al);
        }
    }
}
