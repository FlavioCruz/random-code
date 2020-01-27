package main.java.parallel.tasks;

import main.java.parallel.frames.TwoFactorsOperation;

import javax.swing.*;

public class SubtractionTaskPanel extends TwoFactorsOperation {

    public SubtractionTaskPanel(){
        super(new JLabel("subtraction"), new JTextField(10), new JTextField(10), new JLabel("  ?  "));
    }

    @Override
    public void run() {
        var r = Long.parseLong(((JTextField)factor1).getText()) -
                Long.parseLong(((JTextField)factor2).getText());
        ((JLabel)result).setText(String.valueOf(r));
    }
}
