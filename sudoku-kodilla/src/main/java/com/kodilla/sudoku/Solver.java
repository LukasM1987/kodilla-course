package com.kodilla.sudoku;

public class Solver {

    private static final int SIZE = 9;

    public boolean solveBoard(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int numberToTry = 1; numberToTry <= SIZE; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, col)) {
                            board[row][col] = numberToTry;
                            if(solveBoard(board)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isnNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isnNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isnNumberInSquare(int[][] board, int number, int row, int column) {
        int localSquareRow = row - row % 3;
        int localSquareColumn = column - column % 3;
        for (int i = localSquareRow; i < localSquareRow + 3; i++) {
            for (int j = localSquareColumn; j < localSquareColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isnNumberInRow(board, number, row)
                && !isnNumberInColumn(board, number, column)
                && !isnNumberInSquare(board, number, row, column);
    }
}
