package com.java.tictactoegame;

/**
 * imports all the class of the java.util package
 */
import java.util.Scanner;

/**
 * Class to create TicTacToe game with different methods
 */
public class TictacToe_game {
	/*
	 * create a board of char array of size 10
	 */
	static char[] board = new char[10];
	static char player, computer;
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
	 * UC2 Name: chooseLetter Description: static method to choose letter for user
	 * and computer
	 * 
	 */
	public static void chooseLetter() {
		System.out.println("Please Select Your Choice Letter : 'X' or 'O' ");
		char choice = input.next().charAt(0);
		if (choice == 'X') {
			player = 'X';
			computer = 'O';
		} else if (choice == 'Y') {
			player = 'O';
			computer = 'X';
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
		createEmptyBoard();
		chooseLetter();
	}

}
