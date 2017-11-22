package parts;

import myComponents.MyJFrame;

import javax.swing.*;
import java.awt.*;

public class MainWin extends JPanel{

    private static JPanel panelText;
    private static JPanel panelDigits;
    private static JPanel panelActions;
    private static JPanel panelEq;
    private static JFrame mainFrame;

    private MainWin(String title, int width, int height) {
        // создаем основное окно
        mainFrame = new MyJFrame(title,width, height, new BorderLayout());
        this.panelText = EditPanel.getPanel();
        this.panelDigits = DigitsPanel.getPanel();
        this.panelActions = OperationPanel.getPanel();
        this.panelEq = FourthPanel.getPanel();

        init();

    }

    public static JFrame getWin(String title, int width, int height) {
        if (mainFrame==null) {
            new MainWin(title, width, height);
        }
        return mainFrame;
    }


    public void init() {

        //UIManager.setLookAndFeel(new McWinLookAndFeel());


        //JFrame.setDefaultLookAndFeelDecorated(true);

        mainFrame.setResizable(false);
        //mainFrame.setMinimumSize(new Dimension(500,700));

        mainFrame.getContentPane().add(panelText,BorderLayout.NORTH);
        // добавляем на основное окно панель цифр
        mainFrame.getContentPane().add(panelDigits,BorderLayout.CENTER);
        // добавляем на основное окно панель арифметических оператий
        mainFrame.getContentPane().add(panelActions,BorderLayout.EAST);
        // добавляем панель с кнопкой равно
        //mainFrame.getContentPane().add(panelEq,BorderLayout.SOUTH);
    }





}
