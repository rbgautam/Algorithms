package com.forgeinnovations.driver;

import java.util.Scanner;

import com.forgeinnovations.algos.collections.Array;

public class CLIConsole {
	
	public static void ShowConsole() {
		
		System.out.println("Algorithms");
		
		System.out.println("__________");
		
		Scanner scanner = new Scanner( System.in );
		  
		String input = scanner.nextLine();
		System.out.println("User entered =" + input);
		
		int choice = Integer.parseInt(input);
		
		switch (choice) {
		case 1:
			createArray();
			break;

		default:
			break;
		}
		
		
		
		
	}

	private static void createArray() {
		Array newArr = new Array();
		newArr.displayStudents();
	}
	
}
