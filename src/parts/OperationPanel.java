package parts;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import myComponents.MyJButton;
import myComponents.MyJPanel;

public class OperationPanel {
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
        btnActions.add(new MyJButton("+",font));
        btnActions.add(new MyJButton("-",font));
        btnActions.add(new MyJButton("*",font));
        btnActions.add(new MyJButton("/",font));
        btnActions.add(new MyJButton("=",font));


        // добавляем кнопки на панель
        for (MyJButton btnAction : btnActions) {
            panel.add(btnAction);

        }
    }
}
