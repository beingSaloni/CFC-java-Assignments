package assignment5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        int n = 5;
        int[][] board = new int[n][n];
        ArrayList<int[][]> list = new ArrayList<>();
        knightPlace(board,list, 0,0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.deepToString(list.get(i)));
        }

    }

    private static boolean knightPlace(int[][] board, ArrayList<int[][]> list,int row,int col) {
        if(row>= board.length){
            System.out.println(Arrays.deepToString(board));
            return true;
        }


        for (int i = 0; i < board[0].length ; i++) {
            if(isSafe(row ,col ,board)) {
                if (col + i < board.length && row< board.length) {
                    col = col + i;
                    board[row][col] = 1;
                    if(knightPlace(board, list, row, col + 1)){
                        return true;
                    }
                    board[row][col] = 0;
                }
            }
            if(col>=board[0].length-1 && row< board.length){
                if(knightPlace(board,list,row +1,0)){
                    return true;
                }
            }
            if(i== board[0].length-1){
                if(knightPlace(board,list,row,col+1)){
                    return true;
                }
            }
        }
        return false;

    }

    private static boolean isSafe(int row, int col, int[][] board) {
        int [] r = {2, 1, -1, -2, -2, -1, 1, 2};
        int [] c = {1, 2, 2, 1, -1, -2, -2, -1};
        for (int i = 0; i < 8; i++) {
            if( row + r[i] >= 0 &&  col + c[i] >=0 && row + r[i] < board.length && col + c[i] < board[0].length){
                if (board[row + r[i]][col +c[i]] == 1) {
                    return false;
                }

            }}
        return true;
    }
}
