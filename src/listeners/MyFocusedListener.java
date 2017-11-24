package listeners;

import parts.EditPanel;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyFocusedListener implements FocusListener{
    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() instanceof JTextField) {
            EditPanel.setFocusDigit((JTextField) e.getSource());
        }

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
