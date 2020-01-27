package main.java.parallel.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class TwoFactorsOperation extends JPanel implements Runnable, ActionListener {
    protected JLabel operationTitle;
    protected Component factor1;
    protected Component factor2;
    protected Component result;
    protected JButton executeButton;

    protected TwoFactorsOperation(JLabel operationTitle, Component factor1, Component factor2, Component result) {
        this.operationTitle = operationTitle;
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.result = result;
        executeButton = new JButton("Evaluate");
        executeButton.addActionListener(this);
        add(operationTitle);
        add(this.factor1);
        add(this.factor2);
        add(this.executeButton);
        add(this.result);
    }

    @Override
    public void actionPerformed(ActionEvent var1){
        Thread myThread = new Thread(this);
        myThread.start();
        System.out.println(myThread.getName());
    }
}
