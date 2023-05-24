package taskB;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 * @author 
 * This class implements a Game of life board
 * 
 */
public class GoL_Board extends CA
{
	Scanner input = new Scanner(System.in);
	
	protected int board [][] ; 
	
	/**
	 * 
	 * @param rows: Number of rows
	 * @param cols: Number of columns
	 * Init new GoL automaton with an empty board
	 */
	
	public GoL_Board(int rows, int cols)
	{
		System.out.println("Enter numbers of rows: ");
		rows = input.nextInt();
		
		System.out.println("Enter numbers of cols: ");
		cols = input.nextInt();
		
		board = new int[rows][cols];
		
		
	}

	@Override
	public Iterator iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @param board: The board to be set.
	 * Set parameter board as current board
	 */
	public void SetBoard(int[][] board)
	{
		System.out.println("Enter 1 for live or 0 for dead cell on the board: ");
		for(int i=0; i< rows; i++){
		    for(int j=0; j< cols; j++){
		    	board[i][j]= input.nextInt();
		    }
		}
		// TODO Auto-generated method stub
	}

	/**
	 * 
	 * @return current CA state as a String 
	 */
	public String CurrentBoardOutput()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	// TODO add methods and fields as needed.
	
}
