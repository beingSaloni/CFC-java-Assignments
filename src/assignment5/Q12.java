package assignment5;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[][] sudoku = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        solveSudoku(sudoku,0,0);
}

    private static void solveSudoku(int[][] sudoku, int row ,int col) {
        if(row== sudoku.length ){
            System.out.println(Arrays.deepToString(sudoku));
            return;
        }
        if(col== sudoku[0].length){

            solveSudoku(sudoku, row+1, 0);
            return;

        }
        if(sudoku[row][col] == 0){
            for (int i = 1; i < 10; i++) {
                if(isSafe(sudoku,row,col,i)){
                    sudoku[row][col] = i;
                    solveSudoku(sudoku,row ,col+1);
                    sudoku[row][col] = 0;
                }
            }

        }else {
            solveSudoku(sudoku,row,col+1);
        }


    }
    private static boolean isSafe(int[][] sudoku, int row, int col, int val) {
        for (int r = 0; r < 9; r++) {
            if(sudoku[r][col] == val){
                return false;
            }
        }

        for (int c = 0; c < 9; c++) {
            if(sudoku[row][c] == val){
                return false;
            }
        }

        int box_r = (row/3)*3;
        int box_c = (col/3)*3;

        for (int r = box_r; r < box_r+3; r++) {
            for (int c = box_c; c < box_c+3; c++) {
                if(sudoku[r][c] == val){
                    return false;
                }
            }
        }

        return true;
    }
}
