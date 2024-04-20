package Leetcode.backtracking;

class Solution {
    public int totalNoOfWays(int sr , int sc , int er , int ec , boolean [][] isVisited, int [][] grid )
    {
        if(sr<0 || er<0) return 0;
        if(sr>er || sc>ec )
        return 0;
        if(sr ==er && sc==ec ) return 1;
        if(isVisited[sr][sc]==true)
        return 0;
        if(grid[sr][sc]==-1) return 0;

        isVisited[sr][sc]=true;
            int right =totalNoOfWays( sr ,sc+1,er,ec,isVisited,grid);
            int left=totalNoOfWays( sr,sc-1,er,ec,isVisited,grid);
            int up =totalNoOfWays( sr-1 ,sc,er,ec,isVisited,grid);
            int down =totalNoOfWays( sr+1 ,sc,er,ec,isVisited,grid);
            isVisited[sr][sc]=false;
            return right+left+up+down;

    }
    public static void main (String [] argStrings ) {
        int cRow=0;
        int cCol=0;
        int eRow=0;
        int eCol=0;
        int [][] grid = {{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        
        for( int i=0 ;i< grid.length;i++)
        {
            for( int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1){
                    cRow=i;
                    cCol=j;
                
                }
                if(grid[i][j]==2)
                {
                    eRow=i;
                    eCol=j;
                }

            }
        }

        boolean [][]isVisited=new boolean[grid.length][grid[0].length];
        Solution solution = new Solution();
        int p=solution.totalNoOfWays(cRow,cCol,eRow,eCol,isVisited,grid);
        System.out.println(" ways are "+p);
        
    }
}