package vezbanje;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak03 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 1 "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 2 "));

		int min = 0, max = 0;
		min = a > b ? min = b : a;
		max = a < b ? max = b : a;

		System.out.printf("Ovo je min %d, a ovo je max %d", min, max);
		System.out.println();

		boolean flag = false;
		int[] brojevi = new int[(max - min) + min + 1];
		int[] neprimebrojevi = new int[(max - min) + min + 1];
		int[] primebrojevi = new int[(max - min) + min + 1];
		int brojac = 0;
		
		for (int i = min; i < max; i++) {
			brojevi[brojac] = i;
			brojac++;
		}
		
		brojac = 0;
		
		for (int i = 2; i <= max; i++) {
			
			
			for (int j = 2; j < i; j++) {
				if(i%j==0)
				{
					neprimebrojevi[brojac] = i;
					brojac++;
				}
				//System.out.printf("%s,%d,%d",isPrime,i,j);
			}
		}
		
		
		
		
		for (int i = 0; i < brojevi.length; i++) {
			for (int j = 0; j < neprimebrojevi.length; j++) {
				if(brojevi[i] != neprimebrojevi[j]) {
					primebrojevi[i] = brojevi[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(primebrojevi));
		
		}
	
	}
		
	
	

	


