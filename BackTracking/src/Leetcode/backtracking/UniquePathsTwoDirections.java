package Leetcode.backtracking;

import java.util.Scanner;

class UniquePathsTwoDirections {
 public int countPaths(int startingRow, int StartingCol,int endingRow,int endingCol) {
	if (startingRow>endingRow || StartingCol>endingCol ) {
     return 0;		
	}
	if (startingRow==endingRow ||StartingCol==endingCol) {
		return 1;
		
	}
	 int downPath= countPaths(startingRow+1, StartingCol, endingRow, endingCol);
	 int righPath=countPaths(startingRow, StartingCol+1, endingRow, endingCol);
	 int totalPath=downPath+righPath;
	 return totalPath;
	
}
	public static void main(String[] args) {
		System.out.println("enter rows AND cols ");
		try(Scanner scanner = new Scanner(System.in);) {
		   int row=scanner.nextInt();
		   int col=scanner.nextInt();
		   UniquePathsTwoDirections objectUniquePaths=new UniquePathsTwoDirections();
		 int x =  objectUniquePaths.countPaths(1,1,row,col);
		 System.out.println("total paths are "+x);
			
		} catch (Exception e) {
			System.out.println("exception occured => "+e);
		}
		
		
	}

}
