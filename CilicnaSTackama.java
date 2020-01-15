package hr.java.zimskizadatci.projecteluar;

public class CilicnaSTackama {

	public static void main(String[] args) {
		int red = 11;
		int kolona = 13;
		int[][] M = new int[red][kolona]; 
		
		int redMax = red - 1;
		int redMin = 0;
		int kolonaMax = kolona - 1;
		int kolonaMin = 0;
		int broj = 1;
		
		while (broj <= red*kolona) {
			//pocetna tacka je max red s max kolonom, potrebno je smanjivati kolonu max i zadrzati red max
			for (int i = kolonaMax; i >= kolonaMin; i--) {
				if(M[redMax][i] == 0) {
					M[redMax][i] = broj++;	
				} else {
					break;
				}
			}
			//smanji red max da ne dodje do preklapanja
			redMax--;
			//pocetna tacka je max red s min kolonom, potrebno je smanjivati red max i zadrzati kolonu min
			for (int i = redMax; i >= redMin; i--) {
				if(M[i][kolonaMin] == 0) {
					M[i][kolonaMin] = broj++;
				} else {
					break;
				}
			}
			//povecaj kolonu min da ne dodje do preklapanja
			kolonaMin++;
			//pocetna tacka je min red s min kolonom, potrebno je povecavati kolonu min i zadrzati red min
			for (int i = kolonaMin; i <= kolonaMax; i++) {
				if(M[redMin][i] == 0) {
					M[redMin][i] = broj++;
				} else {
					break;
				}
			}
			//povecati red min da ne dodje do preklapanja
			redMin++;
			//pocetna tacka je red min s kolonom max, potrebno je povecavati min red i zadrzatai kolonu max
			for (int i = redMin; i <= redMax; i++) {
				if(M[i][kolonaMax] == 0) {
					M[i][kolonaMax] = broj++;
				} else {
					break;
				}
			}
			//smanjiti kolonu max da ne dodje do preklapanja
			kolonaMax--;
		}
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("\t" + M[i][j]);
			}
			System.out.println();
		}
	}

}
