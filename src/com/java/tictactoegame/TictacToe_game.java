package com.java.tictactoegame;

/**
 * imports all the class of the java.util package
 */
import java.util.*;

/**
 * Class to create TicTacToe game with different methods
 */
public class TictacToe_game {
	/*
	 * create a board of char array of size 10
	 */
	static char[] board = new char[10];
	static char player, computer;
	private static int playLocation;
	static Scanner input = new Scanner(System.in);
	/*
	 * UC1 Name: createEmptyBoard Description: Static method to create empty board
	 * Algorithm: It takes board array indexes from 1 to 9 using for loop and assign
	 * empty space to each element in the board.
	 */

	private static void createEmptyBoard() {
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
	}
	/*
	 * UC2 Name: chooseLetter 
	 * Description: static method to choose letter for user
	 * and computer
	 */
	public static void chooseLetter() {

		System.out.print("select X or O : ");
		player = Character.toUpperCase(input.next().charAt(0));
		if (player == 'X')
			computer = 'O';
		else
			computer = 'X';
		System.out.println("You have selected : " + player);
		System.out.println("Computer's choice is : " + computer);
	}
	/*
	 * UC3 Method Name: showBoard 
	 * Description: method to display current board
	 * Algorithm: it prints the every element in board array using println method.
	 */
	public static void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}
	/*
	 * UC4 Method Name: makeMove 
	 * Description: method to make user to move to desired
	 * location Algorithm: It takes user input from index 1 to 9. If you enter
	 * invalid index or try to move to occupied position it prints error message
	 * else it moves the user letter to desired location.
	 */

	private static void makeMove() {
		System.out.println("Enter Location 1-9 to Make Move");
		playLocation = input.nextInt();
		if (playLocation < 10 && playLocation > 0) {
			board[playLocation] = player;
			showBoard();
			checkFreeSpace();
			winner();
			makeMove();

		} else {
			System.out.println("Invalid Choice");
		}
	}
	/*
	 * UC5 Method Name: checkFreeSpace 
	 * Description: method to check if space is available in the board. 
	 * Algorithm: It checks free space is available or not
	 * before make a move and count the number of spaces available.It extends UC4.
	 */
	private static void checkFreeSpace() {
		boolean isSpaceAvailable = false;
		int numOfFreeSpaces = 0;
		for (int index = 1; index < board.length; index++) {
			if ((board[index] == ' ')) {
				isSpaceAvailable = true;
				numOfFreeSpaces++;
			}
		}
		if (isSpaceAvailable == false) {
			System.err.println("Board is full! You can't make another move");
			System.exit(0);
		} else {
			System.out.println("Free space is available! you have " + numOfFreeSpaces + " moves left");
		}
	}
	/*
	 * UC6 Method Name: checkFirstPlayer 
	 * Description : method to check who plays first computer or user 
	 * Algorithm: random generates two values 1 and 2. if it
	 * is 1 or 2. then depending on Player and computer to decide to take position
	 */
	public static void checkToss() {
		Random random = new Random();
		int tossResult = random.nextInt(2) + 1;
		System.out.println("Genarated random Number is :" + tossResult);
		System.out.println("\nChoose 1 for Heads or 2 for Tails");
		int coinSelect = input.nextInt();
		if (coinSelect == tossResult) {
			System.out.println("\nPlayer Won The Toss! Player Starts");
		} else {
			System.out.println("\nComputer Won The Toss! Computer Starts");
		}
	}
	 /*UC7
     * MethodName: winner
     * Description: method to check player possible winning positions
     * Algorithm: if player get 3 of his letters in a row (up,down,diagonally) then he becomes winner.
     */

	private static void winner() {
		if ((board[1] == player && board[2] == player && board[3] == player)
				|| (board[4] == player && board[5] == player && board[6] == player)
				|| (board[7] == player && board[8] == player && board[9] == player)
				|| (board[1] == player && board[5] == player && board[9] == player)
				|| (board[3] == player && board[5] == player && board[7] == player)
				|| (board[1] == player && board[4] == player && board[7] == player)
				|| (board[2] == player && board[5] == player && board[8] == player)
				|| (board[3] == player && board[6] == player && board[9] == player)) {
			showBoard();
			System.out.println("Player win the game");
			System.exit(0);
		}
	}

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		checkToss();
		createEmptyBoard();
		chooseLetter();
		showBoard();
		makeMove();
	}

}
