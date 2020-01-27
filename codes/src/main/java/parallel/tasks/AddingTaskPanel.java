package main.java.parallel.tasks;

import main.java.parallel.frames.TwoFactorsOperation;

import javax.swing.*;

public class AddingTaskPanel extends TwoFactorsOperation {

    public AddingTaskPanel(){
        super(new JLabel("addition"), new JTextField(10), new JTextField(10), new JLabel("  ?  "));
    }

    @Override
    public void run() {
        var r = Long.parseLong(((JTextField)factor1).getText()) +
                Long.parseLong(((JTextField)factor2).getText());
        ((JLabel)result).setText(String.valueOf(r));
    }
}
