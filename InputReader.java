/**
 * 
 */
package com.ss.assignments.one;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Nicholas
 *
 */
public class InputReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> summary = new ArrayList<Integer>();
		String s = "";
		Integer sum = null;
		while (!"stop".equals(s)) {
			System.out.println("Please input a valid integer or type 'stop' to finish input");
			s = scan.next();
			if (!"stop".equals(s)) {
				try {
					sum = Integer.valueOf(s);
				} catch (NumberFormatException e) {
					System.out.println("Invalid input, please try again");
					continue;
				}
				summary.add(sum);
			}
		}
		sum = 0;
		for(Integer i : summary) {
			sum += i;
		}
		System.out.println(sum);
		scan.close();
	}

}
