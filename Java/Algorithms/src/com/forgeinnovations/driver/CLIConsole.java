package com.forgeinnovations.driver;

import java.util.Scanner;

public class CLIConsole {
	
	public static void ShowConsole() {
		
		System.out.println("Algorithms");
		
		System.out.println("__________");
		
		Scanner scanner = new Scanner( System.in );
		  
		String input = scanner.nextLine();
		
		System.out.println("User entered =" + input);
		
	}
	
}
