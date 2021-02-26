package assignment5;

public class Q4 {
    public static void main(String[] args) {
        char c [][] =    {{'O','X','O','O'},
                          {'O','O','O','X'},
                          {'O','O','X','O'},
                          {'X','O','O','O'},
                          {'X','X','O','O'}};
        int[][] output = new int[c.length][c[0].length];
        if(solveGrid(c,output ,0 ,0)){
            for (int i = 0; i < output.length ; i++) {
                for (int j = 0; j < output[0].length; j++) {
                    System.out.print(output[i][j]+ " ");
                }
                System.out.println("");
            }
        }
    }

    private static boolean solveGrid(char[][] maze, int[][] output, int r, int c) {
        if(r>=maze.length-1 && c>= maze[0].length-1){
            output[r][c]=1;
            return true;
        }
        if(maze[r][c] == 'X'){
            return false;
        }
        output[r][c]=1;
        if(c < maze[0].length-1){
            if(solveGrid(maze,output,r,c+1)){
                return true;
            }
        }
        if(r < maze.length-1){
            if(solveGrid(maze,output,r+1 ,c)){
                return true;
            }
        }
        output[r][c]=0;
        return false;
    }
}
