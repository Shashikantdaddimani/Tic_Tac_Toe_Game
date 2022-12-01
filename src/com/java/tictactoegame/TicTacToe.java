package com.java.tictactoegame;

/**
 * imports all the class of the java.util package
 */
import java.util.Scanner;

public class TicTacToe {

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
	/*
	 * Logic for Printing the showBoard the TicTacToe Game Board.
	 */
	public void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}
	/*
	 * Logic for checking Player selected letter
	 */
	public void check() {
		System.out.println("please select your choice letter: 'X' or 'Y' ");
		char choice = scanner.next().toUpperCase().charAt(0);
		if(choice=='X')
		{
			System.out.println( "Player selected letter is:"+'X');
			System.out.println("Computer selected letter is:"+'O');
			
		}else if (choice == 'Y')
		{
			System.out.println("Player selected letter is:"+'O');
			System.out.println("Computer selected letter is:"+'X');
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
		 * Creating object of class name by calling the method 
		 */
		TicTacToe tictactoe = new TicTacToe();
		tictactoe.initialize();
		tictactoe.showBoard();
		tictactoe.check();
	}

}
