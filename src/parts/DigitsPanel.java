package parts;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

import listeners.BtnListener;
import myComponents.MyJButton;
import myComponents.MyJPanel;

public class DigitsPanel {

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
            btnDigits.add(new MyJButton(String.valueOf(i),font)); }
        btnDigits.add(new MyJButton(".",font));
        btnDigits.add(new MyJButton("-/+",font));

        ActionListener bl = new BtnListener();
        // добавляем кнопки на панель
        for (MyJButton btnDigit : btnDigits) {
            panel.add(btnDigit);
            btnDigit.addActionListener(bl);
        }
    }
    
}
