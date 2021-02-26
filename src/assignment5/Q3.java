package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] maze = new int[row][col];
        ArrayList<String> arr = new ArrayList<>();
        arr= solveMaze(maze ,0 ,0 , arr ,"");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }


    }

    private static ArrayList solveMaze(int[][] maze, int row, int col, ArrayList<String> arr, String sol) {
        if(row >= maze.length-1 && col >= maze[0].length-1){
            arr.add(sol);
            return arr;

        }
        if(row>= maze.length-1){
            return solveMaze(maze,row,col +1 ,arr ,sol+"H");
        }
        if(col >= maze.length-1){
            return solveMaze(maze,row+1,col,arr,sol +"V");
        }
        solveMaze(maze,row,col +1 ,arr ,sol+"H");

        solveMaze(maze,row+1,col,arr,sol +"V");

       solveMaze(maze,row+1,col+1,arr,sol+"D");
       return arr;

    }
}
