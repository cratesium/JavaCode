package Leetcode.backtracking;

import java.util.Scanner;

public class UniquePathFourDirections {
	public int countPaths(int startingRow, int StartingCol,int endingRow,int endingCol) {
		if (startingRow>endingRow || StartingCol>endingCol ) {
	     return 0;		
		}
		if (startingRow==endingRow ||StartingCol==endingCol) {
			return 1;
			
		}
		if (startingRow<1 || StartingCol<1) {
			return 0;
			
		}
		 int downPath= countPaths(startingRow+1, StartingCol, endingRow, endingCol);
		 int righPath=countPaths(startingRow, StartingCol+1, endingRow, endingCol);
		 int leftPath=countPaths(startingRow, StartingCol-1, endingRow, endingCol);
		 int upPath=countPaths(startingRow-1, StartingCol, endingRow, endingCol);
		 int totalPath=downPath+righPath+leftPath+upPath;
		 return totalPath;
		
	}
		public static void main(String[] args) {
			System.out.println("enter rows and  cols ");
			try(Scanner scanner = new Scanner(System.in);) {
			   int row=scanner.nextInt();
			   int col=scanner.nextInt();
			   UniquePathFourDirections objectUniquePaths1=new UniquePathFourDirections();
			 int x =  objectUniquePaths1.countPaths(1,1,row,col);
			 System.out.println("total paths here are "+x);
				
			} catch (Exception e) {
				System.out.println("exception occured => "+e);
			}
			
			
		}


}
