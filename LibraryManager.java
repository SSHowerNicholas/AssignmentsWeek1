package com.ss.assignments.one;

import java.util.Scanner;

public class LibraryManager {
	private Scanner menuscan;
	private Library[] branches;
	
	public LibraryManager() {
		branches = new Library[2];
		branches[0] = new Library();
		branches[1] = new Library();
		branches[0].setName("University Library");
		branches[0].setLocation("Boston");
		branches[1].setName("State Library");
		branches[1].setLocation("New York");
	}
	public void mainBranch() {
		menuscan = new Scanner(System.in);
		boolean dontquit = true;
		while (dontquit) {
			System.out.println("Welcome to the SmoothStack Library Management System. Which category of user are you?");
			System.out.println("1) Librarian\n2) Administrator\n3) Borrower");
			System.out.println("Or type 'quit' to exit");
			String resp = menuscan.next();
			switch (resp.toLowerCase()) {
			case "1":
			case "librarian":
				libBranchOne();
				break;
			case "2":
			case "administrator":
				adminBranch();
				break;
			case "3":
			case "borrower":
				borrowBranch();
				break;
			case "quit":
				dontquit = false;
				break;
			default:
				System.out.println("Unexpected input, please try again");
				break;
			}
		}
		menuscan.close();
	}

	private void libBranchOne() {
		boolean liquit = true;
		while (liquit) {
			System.out.println("1) Enter Branch you manage \n2) Quit to previous");
			String liresp = menuscan.next();
			if ("1".equals(liresp)) {
				System.out.println("you have selected branch management");
				libBranchTwo();
			}
			else if("2".equals(liresp)) {
				liquit = false;
			}
			else {
				System.out.println("Unexpected input, please try again");
			}
		}
	}
	private void libBranchTwo() {
		 boolean liquittwo = true;
		 while(liquittwo) {
			 System.out.println("Choose your branch:");
			 for(int i = 0; i < branches.length; i++) {
				 System.out.println((i+1) + ") " + branches[i].getName() + ", " + branches[i].getLocation());
			 }
			 System.out.println((branches.length + 1) + ") Quit to previous");
			 String lirespon = menuscan.next();
			 Integer inte;
			 try{
				inte = Integer.valueOf(lirespon); 
			 }
			 catch(NumberFormatException e) {
				 System.out.println(" Unexpected input, please try again");
				 continue;
			 }
			 if(inte > branches.length + 1 || inte <= 0) {
				 System.out.println(" Unexpected input, please try again");
			 }
			 else if(inte == branches.length + 1){
				 liquittwo = false;
			 }
			 else {
			 libBranchThree(branches[inte-1]);
			 }
		 }
	}
	
	private void libBranchThree(Library lib) {
		System.out.println("You are now managing a branch");
	}

	private void adminBranch() {
		System.out.println("You are an Administrator, congrats");
	}

	private void borrowBranch() {
		System.out.println("You are a Borrower, congrats");
	}

	public static void main(String[] args) {
		LibraryManager libman = new LibraryManager();
		libman.mainBranch();
	}

}
