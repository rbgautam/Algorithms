package com.forgeinnovations.interview;

import java.util.HashMap;
import java.util.Scanner;

public class TicTacToe {
	private char[][] board = new char[3][3];
	private int numMoves = 1;
	private boolean AIPlayer = false; //
	private char[] tokens = {'O','X'};
	private HashMap<String,Integer> movesDict= new HashMap<>();
	
	public void InitailizeBoard() {
		for(int i = 0; i<3;i++) {
			for(int j=0; j<3;j++) {
				board[i][j] = '-';
				
			}
		}
	}
	
	
	public void DisplayBoard() {
		System.out.println();
		System.out.println();
		System.out.println("Current Board State");
		System.out.println("--------------------------");
		
		for(int i=0;i<3;i++) {
			StringBuilder strbuild = new StringBuilder();
			for(int j=0;j<3;j++) {
				String rowdata = String.valueOf(board[i][j]);
				
				if(j<2)
					rowdata += "|";
				strbuild.append(rowdata);
			}
			System.out.println(strbuild.toString());
		}
	}
	
	public void Addtoken(int row, int col, char token) {
		board[row][col] =token;
	}
	
	public void PlayTicTacToe() {
		
		while(numMoves <= 9 ) {
			//TODO: add moves
			if(AIPlayer) playAIMove();
			if(!AIPlayer) promptHuman();
			//Check for winning move
			//
			
			AIPlayer = !AIPlayer;
			numMoves++;
		}
		
		
	}


	private void playAIMove() {
		
		//Check all occupied squares 
		System.out.println("AI player move:");
	}


	private void promptHuman() {
		
		System.out.println("Human player's move:(enter row,column(0 Indexed))");
		Scanner scan = new Scanner(System.in);
		//Read Move
		String move  = scan.next();
		//Validate if its a Valid move 
		if(!movesDict.containsKey(move) && IsValidMove(move))
			movesDict.put(move, numMoves);
		else {
			System.out.println("Invalid move: \nUsage: Enter row,column (0 Indexed)");
			promptHuman();
		}
			
	}


	private boolean IsValidMove(String move) {
		// TODO Auto-generated method stub
		if(move.indexOf(',') <0 )
			return false;
		
		String[] currMove = move.split(",");
		if(currMove.equals(" ") || currMove[0].equals("") ||currMove[1].equals("") )
			return false;
		if(Integer.parseInt(currMove[0]) >2 || Integer.parseInt(currMove[1]) >2)
			return false;
		
		return true;
	}
	
	
};
