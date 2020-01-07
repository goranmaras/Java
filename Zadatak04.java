package vezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak04 {

	public static void main(String[] args) {

		// define the range
		int max = 100;
		int min = 1;
		int range = max - min + 1;
		int rand = 0;
		// generate random numbers within 1 to 10
		for (int i = 0; i < 1; i++) {
			rand = (int) (Math.random() * range) + min;
		}

		int[][] matrica1 = new int[4][4];
		int[][] matrica2 = new int[4][4];
		int zbroj = 0;

		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1.length; j++) {
				matrica1[i][j] = rand;

			}

		}

		for (int i = 0; i < 1; i++) {
			rand = (int) (Math.random() * range) + min;
		}

		for (int i = 0; i < matrica2.length; i++) {
			for (int j = 0; j < matrica2.length; j++) {
				matrica2[i][j] = rand;

			}

		}

		for (int i = 0; i < matrica2.length; i++) {
			for (int j = 0; j < matrica2.length; j++) {
				zbroj = zbroj + matrica1[i][j] + matrica2[i][j];
			}

		}

		System.out.println(Arrays.deepToString(matrica1));
		System.out.println(Arrays.deepToString(matrica2));
		System.out.println(zbroj);

	}

}
