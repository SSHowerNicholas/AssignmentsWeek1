/**
 * 
 */
package com.ss.assignments.one;

/**
 * @author Nicholas
 *
 */
public class ArrayFinder {

	int[][] matrix;

	public ArrayFinder(int[][] input) {
		matrix = input;
	}

	public void findmaxandposition() {
		if (matrix != null) {
			int max = matrix[0][0];
			int row = 0;
			int col = 0;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] > max) {
						max = matrix[i][j];
						row = i;
						col = j;
					}
				}
			}
			System.out.println("the max of this matrix is: "+ max +" at position ["
					+ row + "] [" + col + "]");
		}
		else {
			System.out.println("the input has not been initialized");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int[][] reg = {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] reg = null;
		int[][] reg = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				reg[i][j] = (int)(Math.random()*100);
			}
		}
		ArrayFinder af = new ArrayFinder(reg);
		af.findmaxandposition();
	}

}
