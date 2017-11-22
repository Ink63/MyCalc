import myComponents.MyJFrame;
import parts.EditPanel;
import parts.FourthPanel;
import parts.DigitsPanel;
import parts.OperationPanel;

import javax.swing.*;
import java.awt.*;

public class MySwing {

    public static void main(String[] args)  {  
                

       //UIManager.setLookAndFeel(new McWinLookAndFeel());
        
        
        //JFrame.setDefaultLookAndFeelDecorated(true);
        

        JPanel panelText = EditPanel.getPanel();
        JPanel panelDigits = DigitsPanel.getPanel();
        JPanel panelActions = OperationPanel.getPanel();
        JPanel panelEq = FourthPanel.getPanel();


        // создаем основное окно
        MyJFrame frame1 = new MyJFrame("Калькулятор",1500,700, new BorderLayout());
        frame1.setResizable(false);
        //frame1.setMinimumSize(new Dimension(500,700));

        frame1.getContentPane().add(panelText,BorderLayout.NORTH);
        // добавляем на основное окно панель цифр
        frame1.getContentPane().add(panelDigits,BorderLayout.CENTER);
        // добавляем на основное окно панель арифметических оператий
        frame1.getContentPane().add(panelActions,BorderLayout.EAST);
        // добавляем панель с кнопкой равно
        //frame1.getContentPane().add(panelEq,BorderLayout.SOUTH);

        frame1.setVisible(true);




    }
    
}
