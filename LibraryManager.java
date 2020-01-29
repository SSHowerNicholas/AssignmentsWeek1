package com.ss.assignments.one;

import java.util.Scanner;

public class LibraryManager {
	private Scanner menuscan;
	private Library[] branches;
	
	public LibraryManager() {
		branches = new Library[1];
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
				libBranch();
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

	private void libBranch() {
		boolean liquit = true;
		while (liquit) {
			System.out.println("1) Enter Branch you manage \n2) Quit to previous");
			String liresp = menuscan.next();
			if ("1".equals(liresp)) {
				System.out.println("you have selected branch management");
				//TODO
			}
			else if("2".equals(liresp)) {
				liquit = false;
			}
			else {
				System.out.println("Unexpected input, please try again");
			}
		}
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
