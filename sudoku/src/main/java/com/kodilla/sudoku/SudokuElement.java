package com.kodilla.sudoku;

public class SudokuElement {
    private int value;
    public static int EMPTY = -1;

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}