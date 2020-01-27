package main.java.parallel;

import main.java.parallel.tasks.AddingTaskPanel;
import main.java.parallel.tasks.MatrixAddition;
import main.java.parallel.tasks.MultiplicationTaskPanel;
import main.java.parallel.tasks.SubtractionTaskPanel;

import javax.swing.*;

public class MainCalculator {

    public static void main(String[] args){
        JFrame window = new JFrame("Calculator");
        JPanel addinTask = new AddingTaskPanel(),
                subtractionTask = new SubtractionTaskPanel(),
                multiplicationTask = new MultiplicationTaskPanel(),
                matrixAddition = new MatrixAddition(),
                windowPanel = new JPanel();

        windowPanel.add(addinTask);
        windowPanel.add(subtractionTask);
        windowPanel.add(multiplicationTask);
        windowPanel.add(matrixAddition);
        window.add(windowPanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }
}
