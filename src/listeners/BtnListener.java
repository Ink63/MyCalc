package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton jb = (JButton) (e.getSource());
            jb.setText(String.valueOf(JOptionPane.showConfirmDialog(jb.getParent(),
                    "Нажата кнопка "+jb.getText())));
        }


    }
}
