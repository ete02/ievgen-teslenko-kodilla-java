package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private static final int COLUMNS = 9;
    private static final int ROWS = 9;
    private static final int EMPTY = -1;
    private List<List<SudokuElement>> columns = new ArrayList<>();
}
    public SudokuBoard() {
        for (int i = 0; i < COLUMNS; i++) {
            List<SudokuElement> singleColumn = new ArrayList<>();
            for (int j = 0; j < ROWS; j++) {
                singleColumn.add(new SudokuElement());
            }
            columns.add(singleColumn);
        }
    }