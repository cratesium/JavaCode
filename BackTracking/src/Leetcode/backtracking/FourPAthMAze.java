package Leetcode.backtracking;

import java.util.Scanner;

public class FourPAthMAze {
	private int callMaze(int startingRow , int startingCol,int endingRow, int endingCol, boolean[][] isVisited)
	{   if(startingCol<0 || startingRow<0) return 0;
		if(startingCol>endingCol || startingRow>endingRow)
			return 0;
		if (isVisited[startingRow][startingCol]==true) {
			return 0;
			
		}
		if (isVisited[startingRow][startingCol]==true) {
			return 0;
			
		}
		if (startingRow==endingRow && startingCol==endingCol) {
			return 1;
			
			
		}
		
		isVisited [startingRow][startingCol]= true;
		int right=callMaze(startingRow, startingCol+1, endingRow, endingCol, isVisited);
		int left=callMaze(startingRow, startingCol-1, endingRow, endingCol, isVisited);
		int up=callMaze(startingRow-1, startingCol, endingRow, endingCol, isVisited);
		int down=callMaze(startingRow+1, startingCol, endingRow, endingCol, isVisited);
		 isVisited[startingRow][startingCol]=false;
		int totalways=right+left+up+down;
		return totalways;
		
		
		
		
	}
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);
			) {
			
			System.out.println("enter number of rows ");
			int totalRow=scanner.nextInt();
			int totalCol=scanner.nextInt();
			int startRow=0;
			int StartingCol=0;
			boolean [][] isVisited= new boolean[totalRow][totalCol];

		FourPAthMAze objFourPAthMAze= new FourPAthMAze();
		int total=objFourPAthMAze.callMaze(startRow,StartingCol, totalRow-1, totalCol-1, isVisited);
			System.out.println(total);
		} catch (Exception e) {
			System.out.println("an exception occured => "+e);
			// TODO: handle exception
		}
		
	}

}
