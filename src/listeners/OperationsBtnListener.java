package listeners;

import arithmetics.Calculations;
import arithmetics.Operations;
import parts.EditPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static parts.OperationPanel.*;

public class OperationsBtnListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton jb = (JButton) (e.getSource());
            // какая операция выбрана
            Operations op = null;
            switch (jb.getName()) {
                case BTN_PLUS: {
                    EditPanel.getEdOperation().setText("+");
                    op = Operations.PLUS;
                    break;
                }
                case BTN_MINUS: {
                    EditPanel.getEdOperation().setText("-");
                    op = Operations.MINUS;
                    break;
                }
                case BTN_MULT: {
                    EditPanel.getEdOperation().setText("*");
                    op = Operations.MULT;
                    break;
                }
                case BTN_DIV: {
                    EditPanel.getEdOperation().setText("/");
                    op = Operations.DIV;
                    break;
                }
                case BTN_EQUAL: {
                    op = getOperation(EditPanel.getEdOperation().getText());
                }

            }
            // если была выбрана операция
            if (op != null) {
                String dig1 = EditPanel.getFirstDigit().getText();
                String dig2 = EditPanel.getSecondDigit().getText();
                try {
                    int res = Calculations.sendDigit(dig1, dig2, op);
                    EditPanel.setResDigit(String.valueOf(res));
                }
                catch (ArithmeticException e1) {
                    e1.printStackTrace();
                }

            }

        }
    }

    public static Operations getOperation(String s) {
        switch (s) {
            case "+": {
                return Operations.PLUS;
            }
            case "-": {
                return Operations.MINUS;
            }
            case "/": {
                return Operations.DIV;
            }
            case "*": {
                return Operations.MULT;
            }
        }
        return null;
    }
}
