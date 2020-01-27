package main.java.parallel.tasks;

import main.java.parallel.frames.TwoFactorsOperation;
import main.java.parallel.model.Matrix;

import javax.swing.*;

public class MatrixAddition extends TwoFactorsOperation {

    public MatrixAddition() {
        super(new JLabel("Adding Matrix"), new JPanel(), new JPanel(), new JPanel());
        remove(factor1);
        remove(factor2);
        remove(result);
        this.factor1 = createMatrix(2);
        this.factor2 = createMatrix(2);
//        this.result = createMatrix(2);
        add(factor1);
        add(factor2);
//        add(result);
    }

    private JPanel createMatrix(int size) {
        JPanel row = new JPanel();
        for(int i =0; i < size; i++){
            JPanel col = new JPanel();
            for(int j = 0; j < size; j++){
                col.add(new JTextField(5));
            }
            row.add(col);
        }
        return row;
    }

    /**
     * Create {@link JPanel} with the matrix values
     * @param size
     * @param matrix
     * @return
     */
    private JPanel createMatrixWithValues(int size, Matrix matrix){
        JPanel  col = new JPanel();
        for(int i =0; i < size; i++){
            JPanel row = new JPanel();
            for(int j = 0; j < size; j++){
                JLabel field = new JLabel(String.valueOf(matrix.getValues()[i][j]));
                row.add(field);
            }
            col.add(row);
        }
        return col;
    }

    //Implementation not relevant at this point
    private Matrix extractValuesFromPanelToMatrix(JPanel panel){
        Matrix matrix = new Matrix(2);
        for(int i = 0; i < matrix.getRowColNum(); i++){
            for(int j = 0; j < matrix.getRowColNum(); j++){
                JTextField tf = (JTextField) ((JPanel)panel.getComponent(i)).getComponent(j);
                matrix.getValues()[i][j] = Integer.parseInt(tf.getText());
            }
        }
        return matrix;
    }

    @Override
    public void run() {
        Matrix matrix1 = extractValuesFromPanelToMatrix((JPanel) factor1);
        Matrix matrix2 = extractValuesFromPanelToMatrix((JPanel) factor2);
        Matrix result = new Matrix(2);
        for(int i = 0; i < matrix1.getRowColNum(); i++){
            for(int j = 0; j < matrix1.getRowColNum(); j++){
                result.getValues()[i][j] = matrix1.getValues()[i][j] + matrix2.getValues()[i][j];
            }
        }
        this.result = createMatrixWithValues(2, result);
        this.result.revalidate();
    }
}
