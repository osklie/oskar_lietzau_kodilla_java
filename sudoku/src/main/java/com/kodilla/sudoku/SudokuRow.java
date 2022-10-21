package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    public List<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow(List<SudokuElement> sudokuElements) {
        this.sudokuElements = sudokuElements;
    }

    public List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }

    @Override
    public String toString() {
        return "SudokuRow{" +
                "sudokuElements=" + sudokuElements +
                '}';
    }
}