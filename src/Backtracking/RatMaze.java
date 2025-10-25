package Backtracking;

public class RatMaze {
    public static void main(String[] args) {
        int[][] maze = {
                {1,1,1,0},
                {1,0,0,1},
                {1,1,0,0},
                {1,1,1,1}
        };
        int n=maze.length;
        int m=maze[0].length;
        boolean[][] visited = new boolean[n][m];
        visited[0][0]=true;
        String path="";
        int i=0;
        int j=0;
        rat(maze,visited,path,n,m,i,j);


    }
    static boolean iSvalid(int i, int j,int[][] maze,boolean[][] visited,int n,int m){
        return i >= 0 && i < n && j >= 0 && j < m && maze[i][j] == 1 && !visited[i][j];
    }
    public static void rat(int maze[][],boolean[][] visited,String path,int n,int m,int i,int j){
        if(i==n-1&&j==m-1){
            System.out.println(path);

            return;
        }
        if(iSvalid(i+1,j,maze,visited,n,m)){
            visited[i+1][j]=true;
            rat(maze,visited,path+"D",n,m,i+1,j);
            visited[i+1][j]=false;
        }
        if(iSvalid(i,j-1,maze,visited,n,m)){
            visited[i][j-1]=true;
            rat(maze,visited,path+"L",n,m,i,j-1);
            visited[i][j-1]=false;
        }
        if(iSvalid(i,j+1,maze,visited,n,m)){
            visited[i][j+1]=true;
            rat(maze,visited,path+"R",n,m,i,j+1);
            visited[i][j+1]=false;
        }
        if(iSvalid(i-1,j,maze,visited,n,m)){
            visited[i-1][j]=true;
            rat(maze,visited,path+"U",n,m,i-1,j);
            visited[i-1][j]=false;
        }

    }

}
