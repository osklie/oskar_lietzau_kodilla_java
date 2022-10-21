package com.kodilla.sudoku;


import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public List<SudokuRow> sudokuRow = new ArrayList<>();

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++) {
                if(i==0 && j==0) {
                    result += " " + "   ";
                }
                else if(i==0) {
                    result += "_" + "   ";
                }
                   /*else if(i==3 || i==6) {
                        result += "_" + " | ";
                    }*/
                else if(j==0) {
                    result += " " + " | ";
                }
                    /*else if(j==3 || j==6) {
                        result += "_" + " || ";
                    }*/
                else result += "_" + " | ";
            }
            result += "\n";
        }
        return result;
    }
}