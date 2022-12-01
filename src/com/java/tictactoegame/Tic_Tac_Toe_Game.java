package com.java.tictactoegame;

/**
 * imports all the class of the java.util package
 */
import java.util.Scanner;

public class Tic_Tac_Toe_Game {

	static char board[] = new char[10];
	static char player, computer;
	Scanner scanner = new Scanner(System.in);

	/*
	 * logic for initialize boarder up to size 10
	 */
	public void initialize() {
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	/**
	 * program execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcom to the Tic Tac Toe Game program");
		/*
		 * Printing the Tic Tac Toe game Board.
		 */
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);

	}

}
