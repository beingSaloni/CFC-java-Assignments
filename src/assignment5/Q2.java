package assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] maze = new int[rows][cols];
        ArrayList<String> allpaths = new ArrayList<>();
         allpaths = solveMaze(maze,0 ,0 ,allpaths ,"");
        for (int i = 0; i < allpaths.size(); i++) {
            System.out.println(allpaths.get(i));
        }

    }

    private static ArrayList solveMaze(int[][] maze, int cr, int cc ,ArrayList paths ,String sol) {
        if(cr >= maze.length-1 && cc>= maze[0].length-1){
            paths.add(sol);
            return paths;
        }
        if(cr >= maze.length-1){
            return solveMaze(maze ,cr  ,cc +1 ,paths ,sol+"H");
        }
        if(cc>= maze[0].length-1){
            return solveMaze(maze,cr +1 ,cc  ,paths ,sol+"V");
        }

        solveMaze(maze ,cr  ,cc +1 ,paths ,sol+"H");

        solveMaze(maze ,cr +1 ,cc  ,paths ,sol+"V");
        return paths;

    }
}
