//package assignment5;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Q11 {
//    public static void main(String[] args) {
//        int n = 4;
//        int[][] board = new int[n][n];
//        ArrayList<int[][]> list = new ArrayList<>();
//       list= knightPlace(board,list, 0,0);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(Arrays.deepToString(list.get(i)));
//        }
//
//    }
//
//    private static ArrayList knightPlace(int[][] board, ArrayList<int[][]> list,int row,int col) {
//        if(row>= board.length && col>= board.length){
//            list.add(board);
//            return list;
//        }
//        if(col >= board[0].length){
//            row = row + 1;
//            col=0;
//        }
//        for (int i = 1; i < board[0].length-1; i++) {
//            if(isSafe(row ,col ,board)){
//                board[row][col] = 1;
//                knightPlace(board,list,row,col+i);
//                board[row][col] =0;
//
//            }
//
//        }
//
//
//
//
////        if(col == board[0].length){
////            row = row +1;
////        }
////        if(isSafe(row ,col ,board)){
////                    board[row][col] = 1;
////                    knightPlace(board,list,row,col+1);
////                }
//
//
//        return list;
//
//    }
//
//    private static boolean isSafe(int row, int col, int[][] board) {
//        int [] r = {2, 1, -1, -2, -2, -1, 1, 2};
//      int [] c = {1, 2, 2, 1, -1, -2, -2, -1};
//        for (int i = 0; i < 8; i++) {
//            if( row + r[i] >= 0 &&  col + c[i] >=0 && row + r[i] < board.length && col + c[i] < board[0].length){
//            if (board[row + r[i]][col +c[i]] == 1) {
//                return false;
//            }
//
//        }}
//        return true;
//    }
//}
