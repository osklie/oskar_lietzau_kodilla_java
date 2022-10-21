package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuProcessor {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();

            SudokuBoard sudokuBoard = new SudokuBoard();
            System.out.println(sudokuBoard.toString());

            Scanner number = new Scanner(System.in);
            char a = number.next().charAt(0);
        }
    }
}