package main.java.parallel.model;

import javax.swing.*;

//Square Matrix
public class Matrix {

    private int rowColNum;
    private int[][] values;

    public Matrix(int rowColNum) {
        this.rowColNum = rowColNum;
        values = new int[rowColNum][rowColNum];
    }

    public int getRowColNum() {
        return rowColNum;
    }

    public int[][] getValues() {
        return values;
    }
}
