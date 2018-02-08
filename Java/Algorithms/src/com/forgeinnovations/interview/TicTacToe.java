package com.forgeinnovations.interview;

import java.util.HashMap;

public class TicTacToe {
	private char[][] board = new char[3][3];
	private int numMoves = 0;
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
		
		System.out.println("Human player's move:");
		
		//Read Move
		
		//Validate if its a Valid move 
		
	}
	
	
};
