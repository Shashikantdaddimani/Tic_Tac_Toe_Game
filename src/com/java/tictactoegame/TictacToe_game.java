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

	/**
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
	 * UC3 
	 * Method Name: showBoard 
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
     * UC4
     * Method Name: makeMove
     * Description: method to make user to move to desired location
     * Algorithm: It takes user input from index 1 to 9. If you enter invalid index or try to move
     * to occupied position it prints error message else it moves the user letter to desired location.
     */

	private static void makeMove() {
		System.out.println("Enter Location 1-9 to Make Move");
		playLocation = input.nextInt();
		if (playLocation < 10 && playLocation > 0) {
			board[playLocation] = player;
			showBoard();
			makeMove();

		} else {
			System.out.println("Invalid Choice");
		}
	}

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		createEmptyBoard();
		chooseLetter();
		showBoard();
		makeMove();
	}

}
