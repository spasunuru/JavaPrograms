package com.pasunuru.basicex;




import java.util.Random;
import java.util.Scanner;

public class Weight {
	
	public static void main(String[] args) {
		int weight = 0;
		int row = 8, column =8;
		char[][] grid = new char[row][column];

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an x-coordinate of the Cell:\t");
		while (!scanner.hasNextInt()) 
			System.out.print("please give the Integer");
		int i = scanner.nextInt();
		System.out.print("Enter an y-coordinate of the Cell:\t");
		while (!scanner.hasNextInt()) 
			System.out.print("please give the Integer");
		int j = scanner.nextInt();
		
		try {
			assignValue(grid);
			printChar(i, j,grid);
			weight =findWeight(i,j, grid);
		} catch (GridNotSupportedException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		System.out.println("Weight of the grid["+ i + "][" +j + "] :" + weight);
	}
	

	private static void assignValue(char[][] grid) {
		for (int i =0; i<grid.length; i++)
			for(int j=0; j<grid.length; j++)
				grid[i][j] = random();
	}
	

	private static void printChar(int x, int y, char[][] grid) {
		System.out.println("Randomly filled Grid 'R'-Red Flag, 'G'-Green Flag \n");
		for (int i =0; i<grid.length; i++){
			for(int j=0; j<grid.length; j++) {
				if (i==x && y == j)
					System.out.print("*" +grid[i][j] );
				else
				System.out.print("-" +grid[i][j] );
			}
		System.out.println("-");
		}
		System.out.println("");
	}

	private static char random() {
		final String alphabet = "RG";
	    final int N = alphabet.length();
	    Random r = new Random();
	    return alphabet.charAt(r.nextInt(N));
	}

	
	private static int findWeight(int x, int y, char[][] grid) throws GridNotSupportedException {
		int weight = 0;
		if (x < grid.length && y <grid.length ) {
			System.out.println("The Value in given co-ordinates of grid["+ x + "][" +y + "] :" + grid[x][y]);
			System.out.println("");
		}
		for (int i = -1; i < 2; i++)
			for (int j = -1; j < 2; j++) {
				int rx = x + i;
				int ry = y + j;
				if (rx >= 0 && ry >= 0 && rx < 8 && ry < 8) {
					if (rx == x && ry == y)
						continue;
					if (grid[rx][ry] == grid[x][y])
						weight++;
				} else {
					throw new GridNotSupportedException("Values are higher than grid");
				}
			}
		return weight;
	}

}
