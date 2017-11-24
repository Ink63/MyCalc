package parts;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import listeners.DigitsBtnListener;
import myComponents.MyJButton;
import myComponents.MyJPanel;

public class DigitsPanel {

    public static final String BTN_Name = "DIGIT_";
    public static final String BTN_POINT = "BTN_POINT";
    public static final String BTN_REVERSE = "BTN_REVERSE";

    private static JPanel panel=null;

    private static final Font font = new Font(Font.SANS_SERIF, Font.BOLD, 30);


    public static JPanel getPanel() {
        if (panel==null) {
            new DigitsPanel();
        }
        return panel;
    }

    private DigitsPanel() {
        panel = new MyJPanel("Digits",100,100,new GridLayout(0,3,2,2));
        addComponents();   
    }  
        
    private static void addComponents() {
         // создаем кнопки цифр
        List<MyJButton> btnDigits = new ArrayList<>();
        for (int i=0; i<10; i++ ) {
            btnDigits.add(new MyJButton(String.valueOf(i),font,BTN_Name+String.valueOf(i)));
        }
        btnDigits.add(new MyJButton(".",font, BTN_POINT));
        btnDigits.add(new MyJButton("-/+",font, BTN_REVERSE));

        ActionListener bl = new DigitsBtnListener();
        // добавляем кнопки на панель
        for (MyJButton btnDigit : btnDigits) {
            panel.add(btnDigit);
            btnDigit.addActionListener(bl);
        }
    }
    
}
