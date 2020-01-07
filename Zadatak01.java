package vezbanje;


import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak01 {
	public static void main(String[] args) {

//		int uglbroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj : "));

		int[] values = new int[4];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int zbroj = 0;

		for (int i = 0; i < 4; i++) {

			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Ukucaj vrednost za index " + i));
			zbroj += values[i];
			
		}
		
		System.out.println("Zbroj = " + zbroj);

		for (int i = 0; i < values.length; i++) {
			if(values[i]<min) {
				min=values[i];
			}
			if(values[i]>max) {
				max=values[i];
			}
			
		}
		System.out.println("Min is "+min);
		System.out.println("Max is "+max);
		System.out.println(Arrays.toString(values));
		
	}

}
