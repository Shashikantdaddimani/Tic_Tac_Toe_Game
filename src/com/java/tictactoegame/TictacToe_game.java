package com.java.tictactoegame;
/*
 * Class to create TicTacToe game with different methods
 */
public class TictacToe_game {
	/*
	 * create a board of char array of size 10
	 */
	static char[] board = new char[10];

	/* UC1 Name: createEmptyBoard
	 * Description: Static method to create empty board
	 * Algorithm: It takes board array indexes from 1 to 9 using for loop and assign
	 * empty space to each element in the board.
	 */

	private static void createEmptyBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}
	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game Program");
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("----------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("----------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}

}
