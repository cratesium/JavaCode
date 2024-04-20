package leetcodeTest;

class Solution {
    public int  calculate(int sr, int sc , int er, int ec ,int [][] grid ,String string )
    {    
       
        if(sr<0 || sc<0 )return 0;
        if(sr>er || sc >ec ) return 0;
        if(grid[sr][sc]==1) return 0;

        if(sr==er && sc== ec ) {
        	System.out.println(string);
        	return 1 ;
        }
       
        int rightPath = calculate( sr,sc+1,er,ec,grid,"R");
        int downpath=calculate(sr+1,sc,er,ec,grid,"D");
        int totalways=rightPath+downpath;
        return totalways;

    }
    public static int uniquePathsWithObstacles(int[][] nums) {
        if( nums[nums.length-1][nums[0].length-1]==1) return 0;
        if(nums[0][0]==1) return 0;
        int rows= nums.length;
        int cols= nums[0].length;
        int sc = 0;
        int sr=0;
        Solution solution = new Solution();
        int x = solution.calculate( sr,sc,rows-1,cols-1,nums,"");
        return x ;
        
        
        
    }
   public static void main(String[] args) {
	   int nums[][]= {};
	   int x= Solution.uniquePathsWithObstacles(nums);
	   System.out.println(x);
	   
	   
	
}
}
