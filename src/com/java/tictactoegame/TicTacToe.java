package com.java.tictactoegame;

/**
 * imports all the class of the java.util package
 */
import java.util.Scanner;

public class TicTacToe {
	static Scanner scanner = new Scanner(System.in);
	static char board[] = new char[10];
	static char player, computer;
	private static int playLocation;

	/*
	 * logic for initialize boarder up to size 10
	 */
	public static void createBoard() {
		for (int index = 1; index < 10; index++) {
			board[index] = ' ';
		}
	}

	/*
	 * logic for select the letter for playing the game
	 */
	public static void getPlayerChoice() {
		System.out.print("select X or O : ");
		player = scanner.next().toUpperCase().charAt(0);

		if (player == 'X')
			computer = 'O';
		else
			computer = 'X';
		System.out.println("You have selected : " + player);
		System.out.println("Computer's choice is : " + computer);
	}

	/*
	 * Logic for Printing the showBoard the TicTacToe Game Board.
	 */
	public static void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}

	public static void userMove() {
		System.out.println("Enter Location 1-9 to Make Move");
		playLocation = scanner.nextInt();
		if (playLocation < 10 && playLocation > 0) {
			board[playLocation] = player;
			showBoard();
		} else {
			System.out.println("Invalid Choice");
		}
	}
	/*
	 * Logic for checking FreeSpace
	 */
	public static boolean isEmpty() {
		if(board[playLocation]==' ') {
			return true;
		}else {
			return false;
		}
	}

	/*
	 * Logic for checking Player selected letter
	 */
	public static void check() {
		System.out.println("please select your choice letter: 'X' or 'Y' ");
		char choice = scanner.next().toUpperCase().charAt(0);
		if (choice == 'X') {
			System.out.println("Player selected letter is:" + 'X');
			System.out.println("Computer selected letter is:" + 'O');

		} else if (choice == 'Y') {
			System.out.println("Player selected letter is:" + 'O');
			System.out.println("Computer selected letter is:" + 'X');
		}
	}

	/**
	 * program execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcom to the Tic Tac Toe Game program");
		createBoard();
		getPlayerChoice();
		showBoard();
		isEmpty();
		userMove();
		
	}

}
