package listeners;

import arithmetics.Calculations;
import parts.DigitsPanel;
import parts.EditPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitsBtnListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton jb = (JButton) (e.getSource());
            //jb.setText(String.valueOf(JOptionPane.showConfirmDialog(jb//.getParent(),
 //                   "Нажата кнопка "+jb.getText())));
            if (jb.getName().contains(DigitsPanel.BTN_Name)) {
                //Calculations.sendDigit(Integer.parseInt(jb.getText()));
                    EditPanel.getFocusDigit().setText(jb.getText());
            }
        }


    }
}
