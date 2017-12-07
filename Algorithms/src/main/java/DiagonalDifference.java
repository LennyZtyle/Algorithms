import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int matSize = s.nextInt();		
		int topDiagonal = 0;
		int botDiagonal = 0;
		int[][] matrix = new int[matSize][matSize];
		for (int i = 0; i < matSize; i++) {
			for (int j = 0; j < matSize; j++) {
				matrix[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < matSize; i++) {
			topDiagonal += matrix[i][i];
		}
		for (int i = 0; i < matSize; i++) {
			botDiagonal += matrix[i][matSize-i-1];
		}
		
		System.out.println(Math.abs(topDiagonal-botDiagonal));
	}

	private static void printMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
