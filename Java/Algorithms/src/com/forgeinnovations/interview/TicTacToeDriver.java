package com.forgeinnovations.interview;

public class TicTacToeDriver {

	public static void main(String[] args) {
		
		TicTacToe newGame = new TicTacToe();
		
		newGame.InitailizeBoard();
		newGame.DisplayBoard();
	
		
		newGame.Addtoken(0, 2, 'O');
		newGame.Addtoken(1, 1, 'X');
		newGame.Addtoken(2, 2, 'X');
		
		newGame.DisplayBoard();
			
	}

}
